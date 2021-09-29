package com.cms.sys.auth.vo;

import java.io.Serializable;

public class AuthVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -401624063042030309L;
	private String seq; // 권한 시퀀스
	private String code; // 권한 코드
	private String name; // 권한 명
	
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
