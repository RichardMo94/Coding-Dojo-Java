package com.codingdojo.firstspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainConrtroller {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
}
