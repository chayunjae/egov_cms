package com.cms.sys.log.vo;

import java.io.Serializable;

public class LogVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1347003524372463454L;
	private String logSeq; // 로그 시퀀스
	private String logId; // 로그 아이디
	private String logNm; // 로그 사용자
	private String createDate; // 등록일
	private String ip; // 사용자 아이피
	private String serviceNm; // 서비스 명
	private String serviceSeq; // 서비스 시퀀스 
	private String serviceType; // 서비스 타입
	
	public String getLogSeq() {
		return logSeq;
	}
	public void setLogSeq(String logSeq) {
		this.logSeq = logSeq;
	}
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getLogNm() {
		return logNm;
	}
	public void setLogNm(String logNm) {
		this.logNm = logNm;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getServiceNm() {
		return serviceNm;
	}
	public void setServiceNm(String serviceNm) {
		this.serviceNm = serviceNm;
	}
	public String getServiceSeq() {
		return serviceSeq;
	}
	public void setServiceSeq(String serviceSeq) {
		this.serviceSeq = serviceSeq;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
