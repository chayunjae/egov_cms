package com.cms.sys.menu.vo;

import java.io.Serializable;

public class MenuVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1629890055475736463L;
	private String muCode; // 메뉴 코드
	private String upMuSeq; // 상위 메뉴 시퀀스
	private String munmKr; // 메뉴 한글
	private String munmEn; // 메뉴 영문
	private String muOrdr; // 메뉴 순서
	private String muPath; // 메뉴 링크경로
	private String muAuth; // 메뉴 권한
	
	public String getMuCode() {
		return muCode;
	}
	public void setMuCode(String muCode) {
		this.muCode = muCode;
	}
	public String getUpMuSeq() {
		return upMuSeq;
	}
	public void setUpMuSeq(String upMuSeq) {
		this.upMuSeq = upMuSeq;
	}
	public String getMunmKr() {
		return munmKr;
	}
	public void setMunmKr(String munmKr) {
		this.munmKr = munmKr;
	}
	public String getMunmEn() {
		return munmEn;
	}
	public void setMunmEn(String munmEn) {
		this.munmEn = munmEn;
	}
	public String getMuOrdr() {
		return muOrdr;
	}
	public void setMuOrdr(String muOrdr) {
		this.muOrdr = muOrdr;
	}
	public String getMuPath() {
		return muPath;
	}
	public void setMuPath(String muPath) {
		this.muPath = muPath;
	}
	public String getMuAuth() {
		return muAuth;
	}
	public void setMuAuth(String muAuth) {
		this.muAuth = muAuth;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
