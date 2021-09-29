package com.cms.sys.usr.vo;

import java.io.Serializable;

public class UserVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5002316097989096954L;
	private String seq; // 사용자 시퀀스
	private String id; // 사용자 아이디
	private String password; // 사용자 패스워드
	private String name; // 사용자명
	private String zip; // 우편번호
	private String address; // 주소
	private String deAddress; // 상세주소
	private String tel; // 연락처
	private String email; // 이메일
	private String sexCode; // 성별
	private String status; // 상태
	
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDeAddress() {
		return deAddress;
	}
	public void setDeAddress(String deAddress) {
		this.deAddress = deAddress;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexCode() {
		return sexCode;
	}
	public void setSexCode(String sexCode) {
		this.sexCode = sexCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
