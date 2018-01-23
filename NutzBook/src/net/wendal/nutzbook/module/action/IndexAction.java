package net.wendal.nutzbook.module.action;

import java.io.File;
import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;

import net.wendal.nutzbook.utils.Base64AndMD5;
import net.wendal.nutzbook.utils.CaesarCipher;
import net.wendal.nutzbook.utils.DESUtil;

@IocBean
@At("/index")
public class IndexAction {

	public static void main(String[] args) throws Exception{  
	     String decStr = DESUtil.decryption("9da07c6fb379a1ef", "12345678");
	     System.out.println(decStr);
	     String encStr = DESUtil.encryption("zhuyao", "12345678");
	     System.out.println(Base64AndMD5.encode(encStr.getBytes()));
	}  

	/**
	 * 功能：验证字符串长度是否符合要求，一个汉字等于两个字符
	 * 
	 * @param strParameter
	 *            要验证的字符串
	 * @param limitLength
	 *            验证的长度
	 * @return 符合长度ture 超出范围false
	 */
	public static boolean validateStrByLength(String strParameter, int limitLength) {
		int temp_int = 0;
		byte[] b = strParameter.getBytes();

		for (int i = 0; i < b.length; i++) {
			if (b[i] >= 0) {
				temp_int = temp_int + 1;
			} else {
				temp_int = temp_int + 2;
				i++;
			}
		}

		if (temp_int >= limitLength) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean deleteFile(String delpath) {  
		File file = new File(delpath);  
		if (file.exists() && !file.isDirectory()) {
			file.delete();
			return true;
		} 
        return false;  
    }
}
