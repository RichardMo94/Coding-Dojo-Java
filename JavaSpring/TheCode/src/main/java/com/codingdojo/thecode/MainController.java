package com.codingdojo.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class MainController {
	@RequestMapping("/")
	public String index() {
		return "/WEB-INF/index.jsp";
	}
}
