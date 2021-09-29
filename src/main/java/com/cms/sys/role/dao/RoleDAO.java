package com.cms.sys.role.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cms.sys.role.vo.RoleVO;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("RoleDAO")
public class RoleDAO extends EgovAbstractMapper{
	public List<RoleVO> roleList(RoleVO vo) {
		return super.getSqlSession().selectList("role.roleList",vo);
	}
}
