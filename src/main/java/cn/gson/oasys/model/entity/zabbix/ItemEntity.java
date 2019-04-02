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

	private String itemid;//

	private String delay;//

	private String hostid;

	private String interfaceid;

	private String key_;

	private String name;

	private int type;

	private String url;

	private int value_type;

	private int allow_traps;

	private int authtype;

	private String description;

	private String error;

	private int flags;

	private int follow_redirects;

	private Object headers;

	private String history;

	private String http_proxy;

	private int inventory_link;

	private String ipmi_sensor;

	private String jmx_endpoint;

	private long lastclock;

	private int lastns;

	private String lastvalue;

	private String logtimefmt;

	private int master_itemid;

	private long mtime;

	private int output_format;

	private String params;

	private String password;

	private String port;

	private int post_type;

	private String posts;

	private String prevvalue;

	private String privatekey;

	private String publickey;

	private String[] query_fields;

	private int request_method;

	private int retrieve_mode;

	private String snmp_community;

	private String snmp_oid;

	private String snmpv3_authpassphrase;

	private int snmpv3_authprotocol;

	private String snmpv3_contextname;

	private String snmpv3_privpassphrase;

	private int snmpv3_privprotocol;

	private int snmpv3_securitylevel;

	private String snmpv3_securityname;

	private String ssl_cert_file;

	private String ssl_key_file;

	private String ssl_key_password;

	private int state;

	private int status;

	private String status_codes;

	private String templateid;

	private String timeout;

	private String trapper_hosts;

	private String trends;

	private String units;

	private String username;

	private String valuemapid;

	private int verify_host;

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
