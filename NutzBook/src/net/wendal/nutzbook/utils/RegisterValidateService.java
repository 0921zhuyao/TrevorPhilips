package net.wendal.nutzbook.utils;

public class RegisterValidateService {

	public static void processregister(){
        ///如果处于安全，可以将激活码处理的更复杂点，这里我稍做简单处理
        //user.setValidateCode(MD5Tool.MD5Encrypt(email));

        ///邮件的内容
        StringBuffer sb=new StringBuffer("骆巍，小呆逼！</br>");

        //发送邮件
        SendEmail.send("1522006932@qq.com", sb.toString());
        System.out.println("发送邮件");
    }

	public static void main(String[] args) {
		processregister();
	}
}
