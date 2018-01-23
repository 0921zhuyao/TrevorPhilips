package net.wendal.nutzbook.module.action;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		double db = 1234000.567;
		
		Locale[] locales = {Locale.CHINA,Locale.JAPAN,Locale.GERMAN,Locale.US};
		
		NumberFormat[] num = new NumberFormat[12];
		for (int i = 0; i < locales.length; i++) {
			num[i*3] = NumberFormat.getNumberInstance(locales[i]);
			num[i*3+1] = NumberFormat.getPercentInstance(locales[i]);
			num[i*3+2] = NumberFormat.getCurrencyInstance(locales[i]);
		}
		
		for (int i = 0; i < locales.length; i++) {
			String tip = i == 0 ? "===中国的格式===" : 
						 i == 1 ? "===日本的格式===" :
					     i == 2 ? "===德国的格式===" : "===美国的格式===";
			System.out.println(tip);
			System.out.println("通用数值格式：" + num[i*3].format(db));
			System.out.println("百分比数值格式：" + num[i*3+1].format(db));
			System.out.println("货币数值格式：" + num[i*3+2].format(db));
		}
	}
}
