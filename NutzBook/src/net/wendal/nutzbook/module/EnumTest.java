package net.wendal.nutzbook.module;

import java.io.IOException;
import java.util.Calendar;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;

import net.wendal.nutzbook.dao.SeasonEnum;

public class EnumTest {

	public void judge(SeasonEnum s){
		switch (s) {
		case SPRING:
			System.out.println("春暖花开，正好踏青");
			break;
		case SUMMER:
			System.out.println("夏日炎炎，适合游泳");
			break;
		case FALL:
			System.out.println("秋高气爽，进补及时");
			break;
		case WINTER:
			System.out.println("冬日雪飘，围炉赏雪");
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) throws Exception {
		/*for (SeasonEnum s : SeasonEnum.values()) {
			System.out.println(s);
		}
		
		new EnumTest().judge(SeasonEnum.SPRING);*/
		
		//获取系统的所有环境变量
		/*Map<String, String> env = System.getenv();
		for (String name : env.keySet()) {
			System.out.println(name + "--------->" + env.get(name));
		}*/
		
		//获取指定环境变量的值
		//System.out.println(System.getenv("JAVA_HOME"));
		
		//获取所有的系统属性
		//Properties props = System.getProperties();
		
		Runtime rt = Runtime.getRuntime();
		/*System.out.println("处理器数量： " + rt.availableProcessors());
		System.out.println("空闲内存数： " + rt.freeMemory());
		System.out.println("总内存数： " + rt.totalMemory());
		System.out.println("可用最大内存数： " + rt.maxMemory());*/
		
		//rt.exec("notepad.exe");
		
		/*String name = null;
		Objects.requireNonNull(name, "name值不能为空");*/
		
		/*ThreadLocalRandom random = ThreadLocalRandom.current();
		System.out.println(random.nextInt());*/
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
	}
}
