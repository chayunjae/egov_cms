package com.cms.sys.adm.service;

import java.util.List;

import com.cms.sys.adm.vo.AdminVO;

public interface AdminService {
	AdminVO adminCheck(AdminVO vo) throws Exception;
	
	List<AdminVO> adminList(AdminVO vo) throws Exception;
}
