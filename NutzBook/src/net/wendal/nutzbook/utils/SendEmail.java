package net.wendal.nutzbook.utils;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	private static final long serialVersionUID = -7919773103038480712L;
    public static final String HOST = "smtp.qq.com";
    public static final String PROTOCOL = "smtp";  
    public static final int PORT = 465;
    public static final String FROM = "1728473354@qq.com ";//发件人的email
    public static final String PWD = "lkmcvxzqvmqqhdea";//发件人密码   POP3/SMTP==oeqivmsuvkxhdcgi  IMAP/SMTP==dekeqbrbrmmwdjdd
    /**
     * 获取Session
     * @return
     */
    private static Session getSession() {
        Properties props = new Properties();
        props.put("mail.smtp.host", HOST);//设置服务器地址
        props.put("mail.store.protocol" , PROTOCOL);//设置协议
        props.put("mail.smtp.port", PORT);//设置端口
        props.put("mail.smtp.auth" , "true");
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM, PWD);
            }
        };
        Session session = Session.getDefaultInstance(props , authenticator);
        return session;
    }
    public static void send(String toEmail , String content) {
        Session session = getSession();
        try {
            // Instantiate a message
            Message msg = new MimeMessage(session);
            //Set message attributes
            msg.setFrom(new InternetAddress(FROM));
            InternetAddress[] address = {new InternetAddress(toEmail)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject("病毒邮件");
            msg.setSentDate(new Date());
            msg.setContent(content , "text/html;charset=utf-8");
            //Send the message
            Transport.send(msg);
        }
        catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

}
