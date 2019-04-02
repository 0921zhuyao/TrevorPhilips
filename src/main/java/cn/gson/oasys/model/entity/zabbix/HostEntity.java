package cn.gson.oasys.model.entity.zabbix;

import java.io.Serializable;

/**
 * 主机实体类
 * 
 * @author TrevorPhilips
 * @date 2019-04-01
 */
public class HostEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String hostid; // (只读)主机的ID

	private String host; // 主机的正式名称

	// (只读)Zabbix agent的可用性 可能的值为:0 - 默认）未知;1 - 可用;2 -不可用.
	private int available;

	private String description;// 主机说明

	private long disable_until;// (只读) 不可用状态Agent的下一次轮训时间.

	private String error;// (只读) Agent不可用时的错误信息

	private long errors_from;// (只读) Agent不可用时的时间.

	private int flags;// (只读) 主机的来源. 0 - 普通主机; 4 - 自动发现的主机.

	private int inventory_mode;// 主机资产清单模式. -1 - 禁用; 0 - (默认) 手动; 1 - 自动.

	private int ipmi_authtype;// IPMI认证算法.-1 (默认) 默认; 0-无; 1-MD2; 2- MD5;4 -
								// straight; 5 - OEM;6 - RMCP+.

	private int ipmi_available;// (只读) IPMI agent的可用性.0 - (默认) 未知;1 - 可用;2 -
								// 不可用.

	private long ipmi_disable_until;// (只读) 不可用状态IPMI agent的下一次轮训时间

	private String ipmi_error;// (只读) IPMI agent不可用时的错误信息

	private long ipmi_errors_from;// (只读) IPMI agent不可用时的时间

	private String ipmi_password;// IPMI 密码

	private int ipmi_privilege;// IPMI 权限等级1 - 回调;2 - (默认) 用户;3 - 操作员;4 - 管理员;
								// 5 - OEM原厂

	private int ipmi_username;// IPMI 用户名

	private int jmx_available;// (只读) JMX agent的可用性0 - (默认) 未知;1 - 可用;2 - 不可用

	private long jmx_disable_until;// (只读) 不可用状态JMX agent的下一次轮训时间

	private String jmx_error;// (只读) JMX agent不可用时的错误信息

	private long jmx_errors_from;// (只读) JMX agent不可用时的时间

	private long maintenance_from;// (只读) 有效维护的开始时间

	private int maintenance_status;// (只读) 有效维护的状态0 - (默认) 没有维护;1 - 有效维护.

	private int maintenance_type;// (只读) 有效维护类型0 - (默认) 维护期间搜集数据;1 - 维护期间不搜集数据

	private String maintenance;// (只读) 目前对主机生效的维护的ID

	private String name;// 主机名. 默认: host 属性值

	private String proxy_hostid;// 用于监控主机的Proxy服务器的hostid

	private int snmp_available;// (只读) SNMP agent的可用性0 - (默认) 未知;1 - 可用;2 - 不可用

	private long snmp_disable_until;// (只读) 不可用状态SNMP agent的下一次轮训时间

	private String snmp_error;// (只读) SNMP agent不可用时的错误信息

	private long snmp_errors_from;// (只读) SNMP agent不可用时的时间

	private int status;// 主机的状态0 - (默认) 已监控的主机;1 - 未监控的主机

	private int tls_connect;// 到主机的连接1 - (默认) 没有加密; 2 - PSK; 4 - 证书. |
							// |tls_accept |整数 | 来自主机的连接

	private String tls_issuer;// 证书发行机构

	private String tls_subject;// 证书的主题

	private String tls_psk_identity;// PSK 认证. 如果tls_connect 或
									// tls_accept启用了PSK,那么该选项是必选

	private String tls_psk;// PSK至少需要32位16进制数字构成.如果tls_connect 或
							// tls_accept启用了PSK,那么该选项是必选

	public String getHostid() {
		return hostid;
	}

	public void setHostid(String hostid) {
		this.hostid = hostid;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getDisable_until() {
		return disable_until;
	}

	public void setDisable_until(long disable_until) {
		this.disable_until = disable_until;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public long getErrors_from() {
		return errors_from;
	}

	public void setErrors_from(long errors_from) {
		this.errors_from = errors_from;
	}

	public int getFlags() {
		return flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	public int getInventory_mode() {
		return inventory_mode;
	}

	public void setInventory_mode(int inventory_mode) {
		this.inventory_mode = inventory_mode;
	}

	public int getIpmi_authtype() {
		return ipmi_authtype;
	}

	public void setIpmi_authtype(int ipmi_authtype) {
		this.ipmi_authtype = ipmi_authtype;
	}

	public int getIpmi_available() {
		return ipmi_available;
	}

	public void setIpmi_available(int ipmi_available) {
		this.ipmi_available = ipmi_available;
	}

	public long getIpmi_disable_until() {
		return ipmi_disable_until;
	}

	public void setIpmi_disable_until(long ipmi_disable_until) {
		this.ipmi_disable_until = ipmi_disable_until;
	}

	public String getIpmi_error() {
		return ipmi_error;
	}

	public void setIpmi_error(String ipmi_error) {
		this.ipmi_error = ipmi_error;
	}

	public long getIpmi_errors_from() {
		return ipmi_errors_from;
	}

	public void setIpmi_errors_from(long ipmi_errors_from) {
		this.ipmi_errors_from = ipmi_errors_from;
	}

	public String getIpmi_password() {
		return ipmi_password;
	}

	public void setIpmi_password(String ipmi_password) {
		this.ipmi_password = ipmi_password;
	}

	public int getIpmi_privilege() {
		return ipmi_privilege;
	}

	public void setIpmi_privilege(int ipmi_privilege) {
		this.ipmi_privilege = ipmi_privilege;
	}

	public int getIpmi_username() {
		return ipmi_username;
	}

	public void setIpmi_username(int ipmi_username) {
		this.ipmi_username = ipmi_username;
	}

	public int getJmx_available() {
		return jmx_available;
	}

	public void setJmx_available(int jmx_available) {
		this.jmx_available = jmx_available;
	}

	public long getJmx_disable_until() {
		return jmx_disable_until;
	}

	public void setJmx_disable_until(long jmx_disable_until) {
		this.jmx_disable_until = jmx_disable_until;
	}

	public String getJmx_error() {
		return jmx_error;
	}

	public void setJmx_error(String jmx_error) {
		this.jmx_error = jmx_error;
	}

	public long getJmx_errors_from() {
		return jmx_errors_from;
	}

	public void setJmx_errors_from(long jmx_errors_from) {
		this.jmx_errors_from = jmx_errors_from;
	}

	public long getMaintenance_from() {
		return maintenance_from;
	}

	public void setMaintenance_from(long maintenance_from) {
		this.maintenance_from = maintenance_from;
	}

	public int getMaintenance_status() {
		return maintenance_status;
	}

	public void setMaintenance_status(int maintenance_status) {
		this.maintenance_status = maintenance_status;
	}

	public int getMaintenance_type() {
		return maintenance_type;
	}

	public void setMaintenance_type(int maintenance_type) {
		this.maintenance_type = maintenance_type;
	}

	public String getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProxy_hostid() {
		return proxy_hostid;
	}

	public void setProxy_hostid(String proxy_hostid) {
		this.proxy_hostid = proxy_hostid;
	}

	public int getSnmp_available() {
		return snmp_available;
	}

	public void setSnmp_available(int snmp_available) {
		this.snmp_available = snmp_available;
	}

	public long getSnmp_disable_until() {
		return snmp_disable_until;
	}

	public void setSnmp_disable_until(long snmp_disable_until) {
		this.snmp_disable_until = snmp_disable_until;
	}

	public String getSnmp_error() {
		return snmp_error;
	}

	public void setSnmp_error(String snmp_error) {
		this.snmp_error = snmp_error;
	}

	public long getSnmp_errors_from() {
		return snmp_errors_from;
	}

	public void setSnmp_errors_from(long snmp_errors_from) {
		this.snmp_errors_from = snmp_errors_from;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTls_connect() {
		return tls_connect;
	}

	public void setTls_connect(int tls_connect) {
		this.tls_connect = tls_connect;
	}

	public String getTls_issuer() {
		return tls_issuer;
	}

	public void setTls_issuer(String tls_issuer) {
		this.tls_issuer = tls_issuer;
	}

	public String getTls_subject() {
		return tls_subject;
	}

	public void setTls_subject(String tls_subject) {
		this.tls_subject = tls_subject;
	}

	public String getTls_psk_identity() {
		return tls_psk_identity;
	}

	public void setTls_psk_identity(String tls_psk_identity) {
		this.tls_psk_identity = tls_psk_identity;
	}

	public String getTls_psk() {
		return tls_psk;
	}

	public void setTls_psk(String tls_psk) {
		this.tls_psk = tls_psk;
	}

}
