package com.codingdojo.firstspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/coding")
public class CodingCoontroller {
	
	@RequestMapping("")
	public String coding() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java is better!";
	}
}
