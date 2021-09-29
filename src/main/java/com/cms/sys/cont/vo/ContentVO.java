package com.cms.sys.cont.vo;

import java.io.Serializable;

public class ContentVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3675750965601794586L;
	private String seq; // 컨텐츠 시퀀스
	private String comCode; // 게시판 코드
	private String writer; // 작성자
	private String title; // 제목
	private String content; // 내용
	private String fileGroupCode; // 첨부파일 그룹
	private String createDate; // 등록일
	private String updateDate; // 수정일
	private String useDp; // 사용유무

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFileGroupCode() {
		return fileGroupCode;
	}

	public void setFileGroupCode(String fileGroupCode) {
		this.fileGroupCode = fileGroupCode;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getUseDp() {
		return useDp;
	}

	public void setUseDp(String useDp) {
		this.useDp = useDp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
