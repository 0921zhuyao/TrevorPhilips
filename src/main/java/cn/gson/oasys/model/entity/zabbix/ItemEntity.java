package cn.gson.oasys.model.entity.zabbix;

import java.io.Serializable;

/**
 * 监控项实体类
 * 
 * @author TrevorPhilips
 * @date 2019-04-01
 */
public class ItemEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String itemid;// 监控项ID

	private String delay;// 更新监控项的时间间隔

	private String hostid;// 该监控项所属的主机 ID

	private String interfaceid;// 监控项主机接口的ID。 仅用于主机项

	private String key_;// 监控项键值

	private String name;// 监控项名称
	// 0-Zabbix agent;1-SNMPv1 agent;2-Zabbix trapper;3-simple check;
	// 4-SNMPv2 agent;5 - Zabbix internal;6 - SNMPv3 agent;
	// 7 - Zabbix agent (active);8 - Zabbix aggregate;
	// 9 - web item;10 - external check;11 - database monitor;
	// 12 - IPMI agent;13 - SSH agent;14 - TELNET agent;
	// 15 - calculated;16 - JMX agent;17 - SNMP trap;
	// 18 - Dependent item;19 - HTTP agent;
	private int type;

	private String url;// URL字符串，仅HTTP agent监控项类型需要

	// 监控项信息的类型0 - numeric float;1 - character;2 - log;
	// 3 - numeric unsigned;4 - text
	private int value_type;

	// HTTP agent监控项字段。允许和trapper监控项一样的填充值
	private int allow_traps;

	// 仅在SSH agent items or HTTP agent items中使用
	private int authtype;

	private String description;// 监控项说明

	private String error;// 当更新监控项出错时的错误文本

	private int flags;

	private int follow_redirects;// HTTP agent 监控项字段。合并数据时跟随重定向

	// HTTP agent 监控项字段。带有HTTP(S)请求报头的对象，报头名为键名，报头值为值
	private Object headers;

	private String history;// 一个历史数据被保存的时长的时间单位

	private String http_proxy;// HTTP agent 监控项字段。HTTP(S)代理连接字符串

	private int inventory_link;// 监控项填充的主机资产的ID

	private String ipmi_sensor;// IPMI传感器。仅用于IPMI监控项

	private String jmx_endpoint;// JMX agent自定义的连接字符串

	private long lastclock;// 监控项最后被更新的时间

	private int lastns;// 监控项最后被更新的纳秒

	private String lastvalue;// 监控项最新的值

	private String logtimefmt;// 日志条目的时间格式。仅用于日志监控项

	private int master_itemid;

	private long mtime;// 被监控的日志文件最后一次被更新的时间

	private int output_format;// HTTP agent监控项字段

	private String params;// 取决于监控项类型的附加参数

	private String password;// 认证的密码

	private String port;// 监控项监控的端口。仅用于SMNP监控项

	// HTTP agent字段0 - (default) Raw data;2 - JSON data.3 - XML data
	private int post_type;

	private String posts;// HTTP agent字段。HTTP(S)请求报文。仅用于post_type

	private String prevvalue;// 监控项的前一个值

	private String privatekey;// 私钥文件名

	private String publickey;// 公钥的文件名

	private String[] query_fields;// HTTP agent监控项字段。查询参数。带有键值对的数组对象，值可为空

	// HTTP agent监控项字段。请求方法的类型0 - GET;1 - (default) POST;2 - PUT;3 - HEAD
	private int request_method;

	// HTTP agent监控项字段。被存储的响应的部分
	private int retrieve_mode;

	private String snmp_community;// 仅用于SNMPv1 and SNMPv2 监控项

	private String snmp_oid;

	private String snmpv3_authpassphrase;// SNMPv3认证密码。仅用于SNMPv3监控项

	// SNMPv3认证协议。仅用于SNMPv3监控项;0 - (default) MD5;1 - SHA
	private int snmpv3_authprotocol;

	private String snmpv3_contextname;// SNMPv3文本名称。仅用于SNMPv3监控项

	private String snmpv3_privpassphrase;// SNMPv3私钥。仅用于SNMPv3监控项

	// SNMPv3文私密协议。仅用于SNMPv3监控项0 - (default) DES;1 - AES
	private int snmpv3_privprotocol;

	// SNMPv3安全等级。仅用于SNMPv3监控项0 - noAuthNoPriv;1 - authNoPriv;2 - authPriv
	private int snmpv3_securitylevel;

	// SNMPv3安全名称。仅用于SNMPv3监控项
	private String snmpv3_securityname;

	private String ssl_cert_file;// HTTP agent监控项字段。公共SSL 秘钥的文件路径

	private String ssl_key_file;// HTTP agent监控项字段。私有SLL秘钥的文件路径

	private String ssl_key_password;// HTTP agent监控项字段。SSL 秘钥的文件密码

	private int state;// 0 - (default) normal;1 - not supported

	private int status;// 0 - (default) enabled item;1 - disabled item.

	private String status_codes;// HTTP agent监控项字段。以逗号分隔的HTTP 状态码的范围

	private String templateid;// 父模板的ID

	private String timeout;// HTTP agent监控项字段。监控项数据轮询超时时间

	private String trapper_hosts;// 接受的主机。仅用于trapper监控项或者HTTP agent监控项

	private String trends;// 时间单位，数据数据被保存的时间长度

	private String units;// 值的单位

	private String username;// 认证的用户名

	private String valuemapid;// 关联映射值的ID

	// HTTP agent字段。验证URL中的主机名处于通用名称字段或主机证书的主题备用名称字段
	// 0 - (default) Do not validate;1 - Validate
	private int verify_host;

	// HTTP agent字段。验证主机的合法性0 - (default) Do not validate;1 - Validate
	private int verify_peer;

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getDelay() {
		return delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	public String getHostid() {
		return hostid;
	}

	public void setHostid(String hostid) {
		this.hostid = hostid;
	}

	public String getInterfaceid() {
		return interfaceid;
	}

	public void setInterfaceid(String interfaceid) {
		this.interfaceid = interfaceid;
	}

	public String getKey_() {
		return key_;
	}

	public void setKey_(String key_) {
		this.key_ = key_;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getValue_type() {
		return value_type;
	}

	public void setValue_type(int value_type) {
		this.value_type = value_type;
	}

	public int getAllow_traps() {
		return allow_traps;
	}

	public void setAllow_traps(int allow_traps) {
		this.allow_traps = allow_traps;
	}

	public int getAuthtype() {
		return authtype;
	}

	public void setAuthtype(int authtype) {
		this.authtype = authtype;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getFlags() {
		return flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	public int getFollow_redirects() {
		return follow_redirects;
	}

	public void setFollow_redirects(int follow_redirects) {
		this.follow_redirects = follow_redirects;
	}

	public Object getHeaders() {
		return headers;
	}

	public void setHeaders(Object headers) {
		this.headers = headers;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getHttp_proxy() {
		return http_proxy;
	}

	public void setHttp_proxy(String http_proxy) {
		this.http_proxy = http_proxy;
	}

	public int getInventory_link() {
		return inventory_link;
	}

	public void setInventory_link(int inventory_link) {
		this.inventory_link = inventory_link;
	}

	public String getIpmi_sensor() {
		return ipmi_sensor;
	}

	public void setIpmi_sensor(String ipmi_sensor) {
		this.ipmi_sensor = ipmi_sensor;
	}

	public String getJmx_endpoint() {
		return jmx_endpoint;
	}

	public void setJmx_endpoint(String jmx_endpoint) {
		this.jmx_endpoint = jmx_endpoint;
	}

	public long getLastclock() {
		return lastclock;
	}

	public void setLastclock(long lastclock) {
		this.lastclock = lastclock;
	}

	public int getLastns() {
		return lastns;
	}

	public void setLastns(int lastns) {
		this.lastns = lastns;
	}

	public String getLastvalue() {
		return lastvalue;
	}

	public void setLastvalue(String lastvalue) {
		this.lastvalue = lastvalue;
	}

	public String getLogtimefmt() {
		return logtimefmt;
	}

	public void setLogtimefmt(String logtimefmt) {
		this.logtimefmt = logtimefmt;
	}

	public int getMaster_itemid() {
		return master_itemid;
	}

	public void setMaster_itemid(int master_itemid) {
		this.master_itemid = master_itemid;
	}

	public long getMtime() {
		return mtime;
	}

	public void setMtime(long mtime) {
		this.mtime = mtime;
	}

	public int getOutput_format() {
		return output_format;
	}

	public void setOutput_format(int output_format) {
		this.output_format = output_format;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public int getPost_type() {
		return post_type;
	}

	public void setPost_type(int post_type) {
		this.post_type = post_type;
	}

	public String getPosts() {
		return posts;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}

	public String getPrevvalue() {
		return prevvalue;
	}

	public void setPrevvalue(String prevvalue) {
		this.prevvalue = prevvalue;
	}

	public String getPrivatekey() {
		return privatekey;
	}

	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}

	public String getPublickey() {
		return publickey;
	}

	public void setPublickey(String publickey) {
		this.publickey = publickey;
	}

	public String[] getQuery_fields() {
		return query_fields;
	}

	public void setQuery_fields(String[] query_fields) {
		this.query_fields = query_fields;
	}

	public int getRequest_method() {
		return request_method;
	}

	public void setRequest_method(int request_method) {
		this.request_method = request_method;
	}

	public int getRetrieve_mode() {
		return retrieve_mode;
	}

	public void setRetrieve_mode(int retrieve_mode) {
		this.retrieve_mode = retrieve_mode;
	}

	public String getSnmp_community() {
		return snmp_community;
	}

	public void setSnmp_community(String snmp_community) {
		this.snmp_community = snmp_community;
	}

	public String getSnmp_oid() {
		return snmp_oid;
	}

	public void setSnmp_oid(String snmp_oid) {
		this.snmp_oid = snmp_oid;
	}

	public String getSnmpv3_authpassphrase() {
		return snmpv3_authpassphrase;
	}

	public void setSnmpv3_authpassphrase(String snmpv3_authpassphrase) {
		this.snmpv3_authpassphrase = snmpv3_authpassphrase;
	}

	public int getSnmpv3_authprotocol() {
		return snmpv3_authprotocol;
	}

	public void setSnmpv3_authprotocol(int snmpv3_authprotocol) {
		this.snmpv3_authprotocol = snmpv3_authprotocol;
	}

	public String getSnmpv3_contextname() {
		return snmpv3_contextname;
	}

	public void setSnmpv3_contextname(String snmpv3_contextname) {
		this.snmpv3_contextname = snmpv3_contextname;
	}

	public String getSnmpv3_privpassphrase() {
		return snmpv3_privpassphrase;
	}

	public void setSnmpv3_privpassphrase(String snmpv3_privpassphrase) {
		this.snmpv3_privpassphrase = snmpv3_privpassphrase;
	}

	public int getSnmpv3_privprotocol() {
		return snmpv3_privprotocol;
	}

	public void setSnmpv3_privprotocol(int snmpv3_privprotocol) {
		this.snmpv3_privprotocol = snmpv3_privprotocol;
	}

	public int getSnmpv3_securitylevel() {
		return snmpv3_securitylevel;
	}

	public void setSnmpv3_securitylevel(int snmpv3_securitylevel) {
		this.snmpv3_securitylevel = snmpv3_securitylevel;
	}

	public String getSnmpv3_securityname() {
		return snmpv3_securityname;
	}

	public void setSnmpv3_securityname(String snmpv3_securityname) {
		this.snmpv3_securityname = snmpv3_securityname;
	}

	public String getSsl_cert_file() {
		return ssl_cert_file;
	}

	public void setSsl_cert_file(String ssl_cert_file) {
		this.ssl_cert_file = ssl_cert_file;
	}

	public String getSsl_key_file() {
		return ssl_key_file;
	}

	public void setSsl_key_file(String ssl_key_file) {
		this.ssl_key_file = ssl_key_file;
	}

	public String getSsl_key_password() {
		return ssl_key_password;
	}

	public void setSsl_key_password(String ssl_key_password) {
		this.ssl_key_password = ssl_key_password;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getStatus_codes() {
		return status_codes;
	}

	public void setStatus_codes(String status_codes) {
		this.status_codes = status_codes;
	}

	public String getTemplateid() {
		return templateid;
	}

	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getTrapper_hosts() {
		return trapper_hosts;
	}

	public void setTrapper_hosts(String trapper_hosts) {
		this.trapper_hosts = trapper_hosts;
	}

	public String getTrends() {
		return trends;
	}

	public void setTrends(String trends) {
		this.trends = trends;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getValuemapid() {
		return valuemapid;
	}

	public void setValuemapid(String valuemapid) {
		this.valuemapid = valuemapid;
	}

	public int getVerify_host() {
		return verify_host;
	}

	public void setVerify_host(int verify_host) {
		this.verify_host = verify_host;
	}

	public int getVerify_peer() {
		return verify_peer;
	}

	public void setVerify_peer(int verify_peer) {
		this.verify_peer = verify_peer;
	}

}
