package net.wendal.nutzbook.timer;

import java.util.Timer;
import java.util.TimerTask;

import javax.mail.internet.MimeUtility;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;

public class TimerTest extends TimerTask {

	private String jobName = "";
	
	public TimerTest(String jobName) {
		super();
		this.jobName = jobName;
	}
	
	@Override
	public void run() {
		System.out.println("发送邮件");
		// 发送email  
        HtmlEmail email = new HtmlEmail();  
        try {  
            // 这里是SMTP发送服务器的名字：163的如下："smtp.163.com"  
            email.setHostName("smtp.163.com");  
            // 字符编码集的设置  
            email.setCharset("UTF-8");  
            // 收件人的邮箱  
            email.addTo("2514411641@qq.com");  
            // 发送人的邮箱  
            email.setFrom("15895958434@163.com", "茅山道士");  
            // 如果需要认证信息的话，设置认证：用户名-密码。分别为发件人在邮件服务器上的注册名称和密码  
            email.setAuthentication("15895958434@163.com", "51612698zy");  
            // 要发送的邮件主题  
            email.setSubject("病毒邮件");  
            // 要发送的信息，由于使用了HtmlEmail，可以在邮件内容中使用HTML标签  
            email.setMsg("<div><lable style='font:50px;color: #ca0c16'>恭喜看官喜获伍佰万！！！！！！！</lable></div>"
            		+ "<div><img src='/mg/970aa2ab0e8dc9f30aa6aa48cf296b26.gif'/></div>");  

            EmailAttachment attachment = new EmailAttachment();  
            attachment.setDisposition(EmailAttachment.ATTACHMENT);  
            attachment.setDescription("前端学习资料");  
            attachment.setPath("C:\\Eclipse\\NutzBook\\WebContent\\mg\\1.jpg") ;  
            attachment.setName(MimeUtility.encodeText("1.jpg")) ; //设置附件的中文编码
            // 添加附件  
            email.attach(attachment);
            // 发送  
            email.send();
        } catch (Exception e) {  
            e.printStackTrace();
        } 
	}
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		long delay1 = 1 * 1000;
		long period1 = 10000;
		//从现在开始1秒钟之后，每隔一秒钟执行一次
		timer.schedule(new TimerTest("job1"), delay1, period1);
	}

}
