package com.cms.sys.role.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.sys.role.dao.RoleDAO;
import com.cms.sys.role.vo.RoleVO;


@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleDAO roleDAO;
	
	@Override
	public List<RoleVO> roleList(RoleVO vo) throws Exception {
		return roleDAO.roleList(vo);
	}
}
