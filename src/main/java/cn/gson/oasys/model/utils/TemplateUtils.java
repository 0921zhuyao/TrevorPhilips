package cn.gson.oasys.model.utils;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;

import cn.gson.oasys.common.constant.ZabbixAPIMethodConstant;
import io.github.hengyunabc.zabbix.api.Request;
import io.github.hengyunabc.zabbix.api.RequestBuilder;

/**
 * 模板工具类
 * 
 * @author TrevorPhilips
 * @date 2019-04-01
 */
@SuppressWarnings("rawtypes")
public class TemplateUtils {

	/**
	 * 获取所有模板
	 * 
	 * @return
	 */
	public static List<Map> getTemplate() {
		Request request = RequestBuilder.newBuilder().method(ZabbixAPIMethodConstant.TEMPLATE_GET)
				.paramEntry("output", "extend").build();
		List<Map> maps = JSONArray.parseArray(ZabbixUtils.zabbixRequest(request), Map.class);
		return maps;
	}

	/**
	 * 根据入参筛选模板信息
	 * 
	 * @param paramsMap
	 * @return
	 */
	public static List<Map> getTemplate(Map<String, Object> paramsMap) {
		Request request = ZabbixUtils.queryParams(paramsMap, ZabbixAPIMethodConstant.TEMPLATE_GET);
		List<Map> maps = JSONArray.parseArray(ZabbixUtils.zabbixRequest(request), Map.class);
		return maps;
	}
}
