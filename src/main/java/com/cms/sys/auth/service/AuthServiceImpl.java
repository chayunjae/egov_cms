package com.cms.sys.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.sys.auth.dao.AuthDAO;
import com.cms.sys.auth.vo.AuthVO;

@Service("authService")
public class AuthServiceImpl implements AuthService{
	@Autowired
	AuthDAO authDAO;
	
	@Override
	public List<AuthVO> authList(AuthVO vo) throws Exception{
		return authDAO.authList(vo);
	}
}
