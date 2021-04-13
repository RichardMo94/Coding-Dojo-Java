package com.codingdojo.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class SucsessController {
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String sucess(@RequestParam(value="code") String code, RedirectAttributes errormsg) {
		if(code.equals("bushido")) {
			return "/WEB-INF/code.jsp";
		}
		else {
			errormsg.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
}
