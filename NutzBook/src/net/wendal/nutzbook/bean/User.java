package net.wendal.nutzbook.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.ManyMany;
import org.nutz.dao.entity.annotation.Prev;
import org.nutz.dao.entity.annotation.SQL;


public class User implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id(auto=false)
	@Column("ID")
	private Long id;
	
	@Column
	private String name;
	@Column
	private String account;
	@Column("PWD")
	private String password;
	@Column
	private String salt;
	@Column
	private String email;
	@Column("EMAIL_CHECKED")
	private String emailChecked;
	@Column("LOGIN_IP")
	private String loginIp;
	@Column("LOGIN_TIME")
	private Timestamp loginTime;
	@Column("LOGIN_COUNT")
	private int loginCount;
	@Column("IS_LOCKED")
	private String isLocked;
	@Column("CREATE_TIME")
	private Date createTime;
	@Column("DELETE_TIME")
	private Date deleteTime;

	@Column("LOGIN_THEME")
	private String loginTheme;
	@Column("LOGIN_SIDEBAR")
	private String loginSidebar;
	@Column("LOGIN_BOXED")
	private String loginBoxed;
	@Column("LOGIN_SCROLL")
	private String loginScroll;
    
    private boolean system;//是否系统级用户（通过判断是否拥有superadmin角色）
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailChecked() {
		return emailChecked;
	}
	public void setEmailChecked(String emailChecked) {
		this.emailChecked = emailChecked;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public Timestamp getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}
	public int getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}
	public String getIsLocked() {
		return isLocked;
	}
	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getDeleteTime() {
		return deleteTime;
	}
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}
	
	public String getLoginTheme() {
		return loginTheme;
	}
	public void setLoginTheme(String loginTheme) {
		this.loginTheme = loginTheme;
	}
	public String getLoginSidebar() {
		return loginSidebar;
	}
	public void setLoginSidebar(String loginSidebar) {
		this.loginSidebar = loginSidebar;
	}
	public String getLoginBoxed() {
		return loginBoxed;
	}
	public void setLoginBoxed(String loginBoxed) {
		this.loginBoxed = loginBoxed;
	}
	public String getLoginScroll() {
		return loginScroll;
	}
	public void setLoginScroll(String loginScroll) {
		this.loginScroll = loginScroll;
	}
//	public boolean isAdmin(){
//		return SystemContext.configs.get("user.admin", "admin").equalsIgnoreCase(this.account);
//	}
	public boolean isSystem() {
		return system;
	}
	public void setSystem(boolean system) {
		this.system = system;
	}
    
}
