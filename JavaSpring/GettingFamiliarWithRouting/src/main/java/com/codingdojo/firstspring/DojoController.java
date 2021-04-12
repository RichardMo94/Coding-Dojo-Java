package com.codingdojo.firstspring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	
	@RequestMapping("/{input}")
	public String dojo(@PathVariable("input") String input) {
		if(input.equals("dojo")) {
			return "The Dojo is awesome";
		}
		else if(input.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		else if(input.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		return "Choose a location";
		
	}
	
}
