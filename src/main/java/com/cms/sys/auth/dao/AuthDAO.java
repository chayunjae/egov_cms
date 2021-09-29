package com.cms.sys.auth.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cms.sys.auth.vo.AuthVO;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("AuthDAO")
public class AuthDAO extends EgovAbstractMapper{
	
	public List<AuthVO> authList(AuthVO vo){
		return super.getSqlSession().selectList("auth.authList",vo);
	}

}
