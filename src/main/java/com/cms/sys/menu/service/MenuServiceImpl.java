package com.cms.sys.menu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cms.cmmn.dao.CommonDAO;
import com.cms.sys.menu.vo.MenuVO;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("menuService")
public class MenuServiceImpl extends EgovAbstractServiceImpl implements MenuService {
	@Resource(name = "CommonDAO")
	private CommonDAO dao;

	@Override
	public List<EgovMap> selectMenuList(MenuVO vo) {
		return dao.selectList("menu.selectMenuList", vo);
	}
}