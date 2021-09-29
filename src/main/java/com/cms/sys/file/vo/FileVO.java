package com.cms.sys.file.vo;

import java.io.Serializable;

public class FileVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5674823602425786103L;
	private String groupSeq; // 파일그룹 시퀀스
	private String seq; // 파일 시퀀스
	private String createDate; // 등록일
	
	public String getGroupSeq() {
		return groupSeq;
	}
	public void setGroupSeq(String groupSeq) {
		this.groupSeq = groupSeq;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
