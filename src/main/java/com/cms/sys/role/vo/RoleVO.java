package com.cms.sys.role.vo;

import java.io.Serializable;

public class RoleVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3195063430433645926L;
	private String authCode; // 권한 시퀀스
	private String roleCode; // 역할 코드
	private String roleName; // 역할 명
	
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
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
