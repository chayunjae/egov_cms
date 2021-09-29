package com.cms.sys.auth.service;

import java.util.List;

import com.cms.sys.auth.vo.AuthVO;

public interface AuthService {

	List<AuthVO> authList(AuthVO vo) throws Exception;

}
