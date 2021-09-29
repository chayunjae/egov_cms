package com.cms.sys.role.service;

import java.util.List;

import com.cms.sys.role.vo.RoleVO;

public interface RoleService {
	List<RoleVO> roleList(RoleVO vo) throws Exception;
}
