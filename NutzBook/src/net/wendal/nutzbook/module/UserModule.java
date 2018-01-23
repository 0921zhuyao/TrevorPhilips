package net.wendal.nutzbook.module;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.lang.Files;
import org.nutz.lang.util.NutMap;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Ok;
import org.nutz.runner.NutRunner;

import com.google.common.collect.Lists;

import net.wendal.nutzbook.bean.User;

@IocBean // 还记得@IocBy吗? 这个跟@IocBy有很大的关系哦
@At("/user")
@Ok("json")
@Fail("http:500")
public class UserModule {

	@Inject
	protected Dao dao;
	
	@At
    public int count() {
		NutMap map = new NutMap();
		map.put("test", 10);
		File f = new File("C:\\share");
		File n = new File("E:\\apps");
		try {
			Files.copyFile(f, n);
			NutRunner run = new NutRunner("task") {
				
				@Override
				public long exec() throws Exception {
					
					return 0;
				}
			};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return dao.count(User.class);
    }
}
