package com.cms.sys.adm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.sys.adm.dao.AdminDAO;
import com.cms.sys.adm.vo.AdminVO;
import com.cms.util.security.SecurityUtil;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDAO adminDAO;

	@Override
	public AdminVO adminCheck(AdminVO vo) throws Exception {
		String encryptPw = SecurityUtil.encrypt(vo.getPassword());
		vo.setPassword(encryptPw.toUpperCase());
		return adminDAO.login(vo);
	}

	@Override
	public List<AdminVO> adminList(AdminVO vo) throws Exception {
		return adminDAO.adminList(vo);
	}

}
