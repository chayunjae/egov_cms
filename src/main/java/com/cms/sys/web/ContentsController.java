package com.cms.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cms.sys.adm.vo.AdminVO;

@Controller
@SessionAttributes("USER")
public class ContentsController {
	@RequestMapping(value = "/cms/contents", method = RequestMethod.GET)
	public String contentsPage(@ModelAttribute(value = "USER") AdminVO vo) {
		return "page/contents.jsp"; 
	}
}
