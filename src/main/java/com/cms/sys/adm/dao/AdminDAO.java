package com.cms.sys.adm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cms.sys.adm.vo.AdminVO;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("AdminDAO")
public class AdminDAO extends EgovAbstractMapper{

	public AdminVO login(AdminVO vo) {
		return super.getSqlSession().selectOne("admin.loginCheck",vo);
	}

	public List<AdminVO> adminList(AdminVO vo) {
		return super.getSqlSession().selectList("admin.adminList",vo);
	}
	
	

}
