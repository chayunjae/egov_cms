package com.cms.sys.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cms.sys.adm.service.AdminService;
import com.cms.sys.adm.vo.AdminVO;
import com.cms.sys.auth.service.AuthService;
import com.cms.sys.role.service.RoleService;

@RestController
@SessionAttributes("USER")
public class AdminController {

	@Resource(name = "adminService")
	private AdminService adminService;

	@Resource(name = "authService")
	private AuthService authService;

	@Resource(name = "roleService")
	private RoleService roleService;

	/*
	 * 
	 * @param menuSiteMapVO
	 * 
	 * @return List<AdminVO>
	 * 
	 * @throws Exception
	 * 
	 * 관리자 조회 메서드
	 */
	public List<AdminVO> getAdminList(AdminVO searchVO) throws Exception {
		return adminService.adminList(searchVO);
	}
}
