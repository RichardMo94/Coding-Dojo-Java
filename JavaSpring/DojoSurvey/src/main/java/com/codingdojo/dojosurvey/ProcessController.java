package com.codingdojo.dojosurvey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ProcessController {
	@RequestMapping(value="/results", method=RequestMethod.POST)
	public String results(@RequestParam(value="name") String name, 
						  @RequestParam(value="location") String location, 
						  @RequestParam(value="language") String language, 
						  @RequestParam(value="comment") String comment, 
						  HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		
		if(session.getAttribute("language").equals("java")) {
			return "WEB-INF/java.jsp";
		}
		else {
			return "WEB-INF/results.jsp";
		}
		
		
	}
}
