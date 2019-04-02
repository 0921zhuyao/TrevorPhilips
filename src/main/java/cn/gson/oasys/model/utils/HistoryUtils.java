package cn.gson.oasys.model.utils;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;

import cn.gson.oasys.common.constant.ZabbixAPIMethodConstant;
import io.github.hengyunabc.zabbix.api.Request;
import io.github.hengyunabc.zabbix.api.RequestBuilder;

public class HistoryUtils {

	/**
	 * 获取所有历史记录
	 * 
	 * @return
	 */
	public static List<Map> getHistory() {
		Request request = RequestBuilder.newBuilder().method(ZabbixAPIMethodConstant.HISTORY_GET)
				.paramEntry("output", "extend").build();
		List<Map> maps = JSONArray.parseArray(ZabbixUtils.zabbixRequest(request), Map.class);
		return maps;
	}

	/**
	 * 根据入参筛选历史记录
	 * 
	 * @param paramsMap
	 * @return
	 */
	public static List<Map> getHistory(Map<String, Object> paramsMap) {
		Request request = ZabbixUtils.queryParams(paramsMap, ZabbixAPIMethodConstant.HISTORY_GET);
		List<Map> maps = JSONArray.parseArray(ZabbixUtils.zabbixRequest(request), Map.class);
		return maps;
	}
}
