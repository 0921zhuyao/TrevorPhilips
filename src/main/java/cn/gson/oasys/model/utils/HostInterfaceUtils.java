package cn.gson.oasys.model.utils;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;

import cn.gson.oasys.common.constant.ZabbixAPIMethodConstant;
import io.github.hengyunabc.zabbix.api.Request;
import io.github.hengyunabc.zabbix.api.RequestBuilder;

/**
 * 主机接口工具类
 * 
 * @author TrevorPhilips
 * @date 2019-04-02
 */
@SuppressWarnings("rawtypes")
public class HostInterfaceUtils {

	/**
	 * 获取所有主机接口
	 * 
	 * @return
	 */
	public static List<Map> getHostInterface() {
		Request request = RequestBuilder.newBuilder().method(ZabbixAPIMethodConstant.HOST_INTERFACE_GET).paramEntry("output", "extend").build();
		List<Map> maps = JSONArray.parseArray(ZabbixUtils.zabbixRequest(request), Map.class);
		return maps;
	}

	/**
	 * 根据入参筛选主机接口信息
	 */
	public static List<Map> getHostInterface(Map<String, Object> paramsMap) {
		Request request = ZabbixUtils.queryParams(paramsMap, ZabbixAPIMethodConstant.HOST_INTERFACE_GET);
		List<Map> maps = JSONArray.parseArray(ZabbixUtils.zabbixRequest(request), Map.class);
		return maps;
	}
}
