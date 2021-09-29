package com.cms.sys.adm.vo;

import java.io.Serializable;

public class AdminVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6465274845215986872L;
	
	private String seq; // 관리자 시퀀스
	private String id; // 관리자 아이디
	private String password; // 관리자 패스워드
	private String name; // 관리자 명
	private String authCode; // 권한 코드
	private String roleCode; // 역할 코드
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
