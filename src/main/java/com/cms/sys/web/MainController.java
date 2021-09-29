package com.cms.sys.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.cms.sys.adm.service.AdminService;
import com.cms.sys.adm.vo.AdminVO;
import com.cms.sys.menu.service.MenuService;

@RestController
@SessionAttributes("USER")
public class MainController {
	@Resource(name = "menuService")
	private MenuService menuService;

	@Resource(name = "adminService")
	private AdminService adminService;
	
	@Autowired
	AdminController adminMethod;

	@RequestMapping(value = "/cms", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request, HttpSession session,
			@RequestParam(value = "page", required = false) String page) throws Exception {
		ModelAndView mav = new ModelAndView();
		AdminVO sessionInfo = (AdminVO) session.getAttribute("USER");
		if (sessionInfo != null) {
			if (page == null) {
				session.setMaxInactiveInterval(100 * 60);
				mav.addObject("page_value", "dashboard");
			} else {
				mav.addObject("page_value", page);
			}
			mav.setViewName("admin/main.jsp");
		} else {
			mav.addObject("loginResult", "None");
			mav.setViewName("login.jsp");
		}
		return mav;
	}

	@RequestMapping(value = "/cms/login", method = RequestMethod.POST)
	public ModelAndView loginCheck(AdminVO req, HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		AdminVO re = adminService.adminCheck(req);
//		로그인 정보 세션 저장
//		암호화 작업 필요함
		if (re != null) {
			session.setAttribute("USER", re);
			session.setAttribute("LOGIN_STATUS", "SUCCESS");
		} else {
			session.setAttribute("LOGIN_STATUS", "FAILED");
			session.setAttribute("ID_SAVE", req.getId());
		}

		mav.setViewName("redirect:/cms");
		return mav;
	}

	@RequestMapping(value = "/cms/logout")
	public ModelAndView logout(SessionStatus session) {
		session.setComplete();
		return new ModelAndView("redirect:/cms");
	}


}
