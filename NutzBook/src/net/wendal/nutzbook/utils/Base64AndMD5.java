package net.wendal.nutzbook.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.codec.binary.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64AndMD5 {

	/**
	 * @param bytes
	 * @return
	 */
	public static byte[] decode(final byte[] bytes) {
		return Base64.decodeBase64(bytes);
	}

	/**
	 * 二进制数据编码为BASE64字符串
	 * 
	 * @param bytes
	 * @return
	 * @throws Exception
	 */
	public static String encode(final byte[] bytes) {
		return new String(Base64.encodeBase64(bytes));
	}

	/**
	 * 利用MD5进行加密 @param str 待加密的字符串 @return 加密后的字符串 @throws
	 * NoSuchAlgorithmException 没有这种产生消息摘要的算法 @throws
	 * UnsupportedEncodingException
	 */
	public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//确定计算方法
		MessageDigest md5=MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		//加密后的字符串
		String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
		return newstr;
	}
	
	/**判断用户密码是否正确
　　　　* @param newpasswd  用户输入的密码
　　　　 * @param oldpasswd  数据库中存储的密码－－用户密码的摘要
　　　　* @return
　　　　* @throws NoSuchAlgorithmException
　　　　* @throws UnsupportedEncodingException
　　　　*/
	public static boolean checkpassword(String newpasswd,String oldpasswd) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		if(EncoderByMd5(newpasswd).equals(oldpasswd)){
			return true;
		}else{
			return false;
		}
	 }
	
	/**
	 * 字符串解密，采用BASE64的算法
	 * @param encoder 需要解密的字符串
	 * @return 解密后的字符串
	 */
	public static final String decode(String encoder){
		try {
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] buf = decoder.decodeBuffer(encoder);
			return new String(buf);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
     * DES解密
     * @param secretData 密码字符串
     * @param secretKey 解密密钥
     * @return 原始字符串
     * @throws Exception
     */
    public static String decryption(String secretData, String secretKey) throws Exception {

        Cipher cipher = null;
        try {
            //
            cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, generateKey(secretKey));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new Exception("NoSuchAlgorithmException", e);
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            throw new Exception("NoSuchPaddingException", e);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            throw new Exception("InvalidKeyException", e);

        }

        try {

            byte[] buf = cipher.doFinal(hexStr2Bytes(secretData));

            return new String(buf,"utf-8");

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("IllegalBlockSizeException", e);
        }
    }
    public static byte[] hexStr2Bytes(String src){  
        /*对输入值进行规范化整理*/  
        src = src.trim().replace(" ", "").toUpperCase(Locale.CHINA);  
        //处理值初始化  
        int m=0,n=0;  
        int iLen=src.length()/2; //计算长度  
        byte[] ret = new byte[iLen]; //分配存储空间  

        for (int i = 0; i < iLen; i++){  
            m=i*2+1;  
            n=m+1;  
            ret[i] = (byte)(Integer.decode("0x"+ src.substring(i*2, m) + src.substring(m,n)) & 0xFF);  
        }  
        return ret;  
    }  

    /**
     * 获得秘密密钥
     * 
     * @param secretKey
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws InvalidKeyException
     */
    private static SecretKey generateKey(String secretKey)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException {
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        DESKeySpec keySpec = new DESKeySpec(secretKey.getBytes());
        keyFactory.generateSecret(keySpec);
        return keyFactory.generateSecret(keySpec);
    }
}
