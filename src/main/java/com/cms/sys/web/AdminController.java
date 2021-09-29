package com.cms.sys.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cms.sys.adm.service.AdminService;
import com.cms.sys.adm.vo.AdminVO;
import com.cms.sys.auth.service.AuthService;
import com.cms.sys.auth.vo.AuthVO;
import com.cms.sys.role.service.RoleService;
import com.cms.sys.role.vo.RoleVO;

@RestController
@SessionAttributes("USER")
public class AdminController {

	@Resource(name = "adminService")
	private AdminService adminService;

	@Resource(name = "authService")
	private AuthService authService;

	@Resource(name = "roleService")
	private RoleService roleService;

}
