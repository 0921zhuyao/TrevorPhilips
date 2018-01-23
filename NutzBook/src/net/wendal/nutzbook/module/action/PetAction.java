package net.wendal.nutzbook.module.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

@IocBean
@InjectName
@At("/index")
public class PetAction {

	@At
	@Ok("jsp:jsp.websocket")
	public Map<String, Object> batchexportinit() {
		Map<String, Object> result = new HashMap<String, Object>();
		return result;
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.0.1:3306/test","root","admin");
			Statement sta = con.createStatement();
			
			ResultSet result = sta.executeQuery("select * from student");
			while(result.next()){
				result.getString("name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
