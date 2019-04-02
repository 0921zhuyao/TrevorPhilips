package cn.gson.oasys.model.utils;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.gson.oasys.common.constant.ZabbixAPIMethodConstant;
import io.github.hengyunabc.zabbix.api.DefaultZabbixApi;
import io.github.hengyunabc.zabbix.api.Request;
import io.github.hengyunabc.zabbix.api.RequestBuilder;

public class ZabbixUtils {

	private static DefaultZabbixApi zabbixApi;

	// 同步代码快的demo加锁，安全高效
	public static DefaultZabbixApi zabbixInit() {
		if (zabbixApi == null) {
			synchronized (DefaultZabbixApi.class) {
				if (zabbixApi == null) {
					zabbixApi = new DefaultZabbixApi("http://192.168.75.156/zabbix/api_jsonrpc.php");
					// init方法中创建CloseableHttpClient客户端
					zabbixApi.init();
					// 进行权限验证
					boolean loginResult = zabbixApi.login("Admin", "zabbix");
					if (!loginResult) {
						return null;
					}
				}

			}
		}
		return zabbixApi;

	}

	public static String zabbixRequest(Request request) {
		DefaultZabbixApi zabbixApi = zabbixInit();
		if (null != zabbixApi) {
			// 执行请求
			JSONObject resJson = zabbixApi.call(request);
			// 处理结果
			String error = String.valueOf(resJson.get("error"));
			if (!StringUtils.isEmpty(error) && error != "null") {
				System.out.println("调用zabbix接口出错");
			} else {
				JSONArray jsonArray = resJson.getJSONArray("result");
				String resultStr = jsonArray.toJSONString();
				return resultStr;
			}
			System.out.println(request);
		}
		return null;
	}

	public static String getHostGroup() {
		Request request = RequestBuilder.newBuilder().method(ZabbixAPIMethodConstant.HOST_GROUP_GET)
				.paramEntry("output", "extend").build();
		return zabbixRequest(request);
	}

	public static String getProblem() {
		Request request = RequestBuilder.newBuilder().method(ZabbixAPIMethodConstant.PROBLEM_GET)
				.paramEntry("output", "extend").build();
		return zabbixRequest(request);
	}

	public static Request queryParams(Map<String, Object> paramsMap, String method) {
		RequestBuilder requestBuilder = RequestBuilder.newBuilder().method(method);
		if (null != paramsMap) {
			if (paramsMap.containsKey("itemids")) {
				requestBuilder.paramEntry("itemids", paramsMap.get("itemids"));
			}
			if (paramsMap.containsKey("groupids")) {
				requestBuilder.paramEntry("groupids", paramsMap.get("groupids"));
			}
			if (paramsMap.containsKey("templateids")) {
				requestBuilder.paramEntry("templateids", paramsMap.get("templateids"));
			}
			if (paramsMap.containsKey("hostids")) {
				requestBuilder.paramEntry("hostids", paramsMap.get("hostids"));
			}
			if (paramsMap.containsKey("interfaceids")) {
				requestBuilder.paramEntry("interfaceids", paramsMap.get("interfaceids"));
			}
			if (paramsMap.containsKey("triggerids")) {
				requestBuilder.paramEntry("triggerids", paramsMap.get("triggerids"));
			}
			if (paramsMap.containsKey("applicationids")) {
				requestBuilder.paramEntry("applicationids", paramsMap.get("applicationids"));
			}
			if (paramsMap.containsKey("group")) {
				requestBuilder.paramEntry("group", paramsMap.get("group"));
			}
			if (paramsMap.containsKey("host")) {
				requestBuilder.paramEntry("host", paramsMap.get("host"));
			}
			if (paramsMap.containsKey("application")) {
				requestBuilder.paramEntry("application", paramsMap.get("application"));
			}
			if (paramsMap.containsKey("filter")) {
				requestBuilder.paramEntry("filter", paramsMap.get("filter"));
			}
			// 0 - 数字浮点;1 - 字符串;2 - 日志;3 - 无符号数字;4 - 文本
			if (paramsMap.containsKey("history")) {
				requestBuilder.paramEntry("history", paramsMap.get("history"));
			}
			if (paramsMap.containsKey("sortfield")) {
				requestBuilder.paramEntry("sortfield", paramsMap.get("sortfield"));
			}
			if (paramsMap.containsKey("sortorder")) {
				requestBuilder.paramEntry("sortorder", paramsMap.get("sortorder"));
			}
			if (paramsMap.containsKey("limit")) {
				requestBuilder.paramEntry("limit", paramsMap.get("limit"));
			}
			// 给定返回字段
			if (paramsMap.containsKey("output")) {
				requestBuilder.paramEntry("output", paramsMap.get("output"));
			}
		}
		Request request = requestBuilder.build();
		return request;
	}

}
