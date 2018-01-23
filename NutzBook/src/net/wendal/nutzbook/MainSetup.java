package net.wendal.nutzbook;

import java.util.Date;

import org.nutz.dao.Dao;
import org.nutz.dao.util.Daos;
import org.nutz.ioc.Ioc;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

import net.wendal.nutzbook.bean.User;

public class MainSetup implements Setup {

	@Override
	public void destroy(NutConfig arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(NutConfig nc) {
		Ioc ioc = nc.getIoc();
        Dao dao = ioc.get(Dao.class);
        // 如果没有createTablesInPackage,请检查nutz版本
       // Daos.createTablesInPackage(dao, "net.wendal.nutzbook", false);
     // 初始化默认根用户
        /*if (dao.count(User.class) == 0) {
            User user = new User();
            user.setName("admin");
            user.setPassword("123456");
            user.setCreateTime(new Date());
            user.setUpdateTime(new Date());
            dao.insert(user);
        }*/
	}

}
