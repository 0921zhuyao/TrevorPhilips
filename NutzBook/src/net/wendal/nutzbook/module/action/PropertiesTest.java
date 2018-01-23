package net.wendal.nutzbook.module.action;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		
		props.setProperty("username", "李四");
		props.setProperty("address", "紫金大道");
		props.store(new FileOutputStream("file.properties"), "comment line");
		
		Properties props2 = new Properties();
		props2.setProperty("sex", "男");
		props2.load(new FileInputStream("file.properties"));
		System.out.println(props2);
	}

}
