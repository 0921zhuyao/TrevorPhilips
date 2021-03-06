package cn.gson.oasys.model.utils;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;

import cn.gson.oasys.common.constant.ZabbixAPIMethodConstant;
import io.github.hengyunabc.zabbix.api.Request;
import io.github.hengyunabc.zabbix.api.RequestBuilder;

/**
 * 监控项工具类
 * 
 * @author TrevorPhilips
 * @date 2019-04-01
 */
@SuppressWarnings("rawtypes")
public class ItemUtils {

	/**
	 * 获取所有监控项信息
	 * 
	 * @return
	 */
	public static List<Map> getItem() {
		Request request = RequestBuilder.newBuilder().method(ZabbixAPIMethodConstant.ITEM_GET)
				.paramEntry("output", "extend").build();
		List<Map> maps = JSONArray.parseArray(ZabbixUtils.zabbixRequest(request), Map.class);
		return maps;
	}

	/**
	 * 根据入参筛选监控项信息
	 */
	public static List<Map> getItem(Map<String, Object> paramsMap) {
		Request request = ZabbixUtils.queryParams(paramsMap, ZabbixAPIMethodConstant.ITEM_GET);
		List<Map> maps = JSONArray.parseArray(ZabbixUtils.zabbixRequest(request), Map.class);
		return maps;
	}

}
