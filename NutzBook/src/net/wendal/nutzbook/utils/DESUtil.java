package net.wendal.nutzbook.utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.codec.binary.Hex;

public class DESUtil {

	private static final String DES_ALGORITHM = "DES";

	/**
	 * DES加密
	 * 
	 * @param plainData
	 *            原始字符串
	 * @param secretKey
	 *            加密密钥
	 * @return 加密后的字符串
	 * @throws Exception
	 */
	public static String encryption(String plainData, String secretKey) {

		Cipher cipher = null;
		try {
			cipher = Cipher.getInstance(DES_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, generateKey(secretKey));

			// 为了防止解密时报javax.crypto.IllegalBlockSizeException: Input length must
			// be multiple of 8 when decrypting with padded cipher异常，
			// 不能把加密后的字节数组直接转换成字符串
			byte[] buf = cipher.doFinal(plainData.getBytes());

			return Hex.encodeHexString(buf);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * DES解密
	 * 
	 * @param secretData
	 *            密码字符串
	 * @param secretKey
	 *            解密密钥
	 * @return 原始字符串
	 * @throws Exception
	 */
	public static String decryption(String secretData, String secretKey) {

		Cipher cipher = null;
		try {
			//
			cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, generateKey(secretKey));
			byte[] buf = cipher.doFinal(hexStr2Bytes(secretData));
			return new String(buf, "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static byte[] hexStr2Bytes(String src) {
		/* 对输入值进行规范化整理 */
		src = src.trim().replace(" ", "").toUpperCase(Locale.US);
		// 处理值初始化
		int m = 0, n = 0;
		int iLen = src.length() / 2; // 计算长度
		byte[] ret = new byte[iLen]; // 分配存储空间

		for (int i = 0; i < iLen; i++) {
			m = i * 2 + 1;
			n = m + 1;
			ret[i] = (byte) (Integer.decode("0x" + src.substring(i * 2, m) + src.substring(m, n)) & 0xFF);
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
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES_ALGORITHM);
		DESKeySpec keySpec = new DESKeySpec(secretKey.getBytes());
		keyFactory.generateSecret(keySpec);
		return keyFactory.generateSecret(keySpec);
	}

	/**
	 * 字符串转换成十六进制字符串
	 * 
	 * @param str
	 *            String 待转换的ASCII字符串
	 * @return String 每个Byte之间空格分隔，如: [61 6C 6B]
	 */
	private final static char[] mChars = "0123456789ABCDEF".toCharArray();

	public static String str2HexStr(String str) {
		StringBuilder sb = new StringBuilder();
		byte[] bs = str.getBytes();

		for (int i = 0; i < bs.length; i++) {
			sb.append(mChars[(bs[i] & 0xFF) >> 4]);
			sb.append(mChars[bs[i] & 0x0F]);
			sb.append(' ');
		}
		return sb.toString().trim();
	}

	static class Base64Utils {

		static private char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
				.toCharArray();
		static private byte[] codes = new byte[256];

		static {
			for (int i = 0; i < 256; i++)
				codes[i] = -1;
			for (int i = 'A'; i <= 'Z'; i++)
				codes[i] = (byte) (i - 'A');
			for (int i = 'a'; i <= 'z'; i++)
				codes[i] = (byte) (26 + i - 'a');
			for (int i = '0'; i <= '9'; i++)
				codes[i] = (byte) (52 + i - '0');
			codes['+'] = 62;
			codes['/'] = 63;
		}

		/**
		 * 将原始数据编码为base64编码
		 */
		static String encode(byte[] data) {
			char[] out = new char[((data.length + 2) / 3) * 4];
			for (int i = 0, index = 0; i < data.length; i += 3, index += 4) {
				boolean quad = false;
				boolean trip = false;
				int val = (0xFF & (int) data[i]);
				val <<= 8;
				if ((i + 1) < data.length) {
					val |= (0xFF & (int) data[i + 1]);
					trip = true;
				}
				val <<= 8;
				if ((i + 2) < data.length) {
					val |= (0xFF & (int) data[i + 2]);
					quad = true;
				}
				out[index + 3] = alphabet[(quad ? (val & 0x3F) : 64)];
				val >>= 6;
				out[index + 2] = alphabet[(trip ? (val & 0x3F) : 64)];
				val >>= 6;
				out[index + 1] = alphabet[val & 0x3F];
				val >>= 6;
				out[index + 0] = alphabet[val & 0x3F];
			}

			return new String(out);
		}

		/**
		 * 将base64编码的数据解码成原始数据
		 */
		static byte[] decode(char[] data) {
			int len = ((data.length + 3) / 4) * 3;
			if (data.length > 0 && data[data.length - 1] == '=')
				--len;
			if (data.length > 1 && data[data.length - 2] == '=')
				--len;
			byte[] out = new byte[len];
			int shift = 0;
			int accum = 0;
			int index = 0;

			for (int ix = 0; ix < data.length; ix++) {
				int value = codes[data[ix] & 0xFF];
				if (value >= 0) {
					accum <<= 6;
					shift += 6;
					accum |= value;
					if (shift >= 8) {
						shift -= 8;
						out[index++] = (byte) ((accum >> shift) & 0xff);
					}
				}
			}
			if (index != out.length)
				throw new Error("MISCALCULATED DATA LENGTH!");
			return out;
		}
	}

	public static void main(String[] args) throws Exception {
		String decStr = DESUtil.decryption(
				"045fefac628857cba22cab16d7a9103938d7ba8a94f741ae5ee65bb70a2c2bcefeab34b44d6c952601e4beffb060ed840516df8b87503766b67e15c70707b67e4309bb04e9131a2b0c0965c279ea150967a53947967b702f",
				"12345678");
		System.out.println(decStr);

		String encStr = DESUtil.encryption(
				"{'CUSTOMERID':765997,'LAT':31.94344,'LON':118.749907,'STIMESTAMP':'1505962210449'}", "12345678");
		System.out.println(encStr);
	}
}
