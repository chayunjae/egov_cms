package com.cms.sys.file.vo;

import java.io.Serializable;

public class FileDetailVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6190538920533922092L;
	private String seq; // 파일 시퀀스
	private String filePath; // 파일 경로
	private String fileCode; // 파일 코드
	private String originNm; // 기존 파일 명
	private String fileEx; // 파일 확장자
	private String fileSize; // 파일 사이즈
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileCode() {
		return fileCode;
	}
	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}
	public String getOriginNm() {
		return originNm;
	}
	public void setOriginNm(String originNm) {
		this.originNm = originNm;
	}
	public String getFileEx() {
		return fileEx;
	}
	public void setFileEx(String fileEx) {
		this.fileEx = fileEx;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	
	
}
