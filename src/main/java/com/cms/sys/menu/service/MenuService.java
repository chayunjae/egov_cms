package com.cms.sys.menu.service;

import java.util.List;

import com.cms.sys.menu.vo.MenuVO;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface MenuService {
	List<EgovMap> selectMenuList(MenuVO vo);
}
