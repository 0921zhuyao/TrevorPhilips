package cn.gson.oasys.model.utils;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;

import cn.gson.oasys.common.constant.ZabbixAPIMethodConstant;
import cn.gson.oasys.model.entity.zabbix.HostEntity;
import io.github.hengyunabc.zabbix.api.Request;
import io.github.hengyunabc.zabbix.api.RequestBuilder;

public class HostUtils {

	/**
	 * 获取所有主机信息
	 * 
	 * @return
	 */
	public static List<HostEntity> getHost() {
		RequestBuilder requestBuilder = RequestBuilder.newBuilder().method(ZabbixAPIMethodConstant.HOST_GET);
		Request request = requestBuilder.paramEntry("output", "extend").build();
		List<HostEntity> hostEntities = JSONArray.parseArray(ZabbixUtils.zabbixRequest(request), HostEntity.class);
		return hostEntities;
	}

	/**
	 * 根据入参筛选主机信息
	 * 
	 * @param jsonObject
	 * @return
	 */
	public static List<HostEntity> getHost(Map<String, Object> paramsMap) {
		Request request = ZabbixUtils.queryParams(paramsMap, ZabbixAPIMethodConstant.HOST_GET);
		List<HostEntity> hostEntities = JSONArray.parseArray(ZabbixUtils.zabbixRequest(request), HostEntity.class);
		return hostEntities;
	}
}
