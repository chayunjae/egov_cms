package com.cms.sys.menu.vo;

import java.io.Serializable;

public class MenuMasterVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3453732066242357543L;
	private String code; // 메뉴 코드
	private String authCode; // 권한 시퀀스
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
