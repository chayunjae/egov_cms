package com.cms.sys.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
public class UserController {
	
	@Resource(name = "adminService")
	private AdminService adminService;

	@Resource(name = "authService")
	private AuthService authService;

	@Resource(name = "roleService")
	private RoleService roleService;

	
	@RequestMapping(value = "/cms/user", method = RequestMethod.GET)
	public ModelAndView adminPage(AdminVO searchVo) throws Exception {
		ModelAndView mav = new ModelAndView();

		List<AdminVO> admList = adminService.adminList(searchVo);
		AuthVO authParam = new AuthVO();
		authParam.setSeq("AUTH0003");
		List<AuthVO> authList = authService.authList(authParam);
		RoleVO roleParam = new RoleVO();
		roleParam.setAuthCode("AUTH0003");
		List<RoleVO> roleList = roleService.roleList(roleParam);

		int listTotalLength = admList.size();

		mav.addObject("adminList", admList);
		mav.addObject("authList", authList);
		mav.addObject("roleList", roleList);
		mav.addObject("totalCount", listTotalLength);
		mav.addObject("curpage", 1);

		mav.setViewName("page/admin.jsp");

		return mav;
	}

	@ResponseBody
	@RequestMapping(value = "/cms/user", method = RequestMethod.POST)
	public String test(@RequestBody AdminVO testVO,@RequestParam String a_mode) throws Exception {
		System.out.println("==========================");
		System.out.println(a_mode);
		System.out.println(testVO.getName());
		System.out.println("==========================");
		return "OK";
	}
}
