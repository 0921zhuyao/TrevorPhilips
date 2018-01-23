package net.wendal.nutzbook.module.service;

import org.nutz.dao.Condition;
import org.nutz.json.JsonFormat;
import org.nutz.service.EntityService;

public class BaseService<T> extends EntityService<T> {
	
	protected final static int DEFAULT_PAGE_NUMBER = 10;
	//设置json输出格式是否忽略null
	protected final static JsonFormat JSON_FORMAT = new JsonFormat().setIgnoreNull(false);
	
	public BaseService(){
		super();
	}
	
	public int count(String tableName, Condition cnd){
		return this.dao().count(tableName, cnd);
	}
}
