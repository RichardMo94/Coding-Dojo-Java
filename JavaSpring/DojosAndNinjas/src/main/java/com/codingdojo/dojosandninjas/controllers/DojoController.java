package com.codingdojo.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.services.DojoNinjaService;

@Controller
public class DojoController {
	private final DojoNinjaService dojoNinjaService;
	
	public DojoController(DojoNinjaService dojoNinjaService) {
		this.dojoNinjaService = dojoNinjaService;
	}
	
	@GetMapping("/dojo/new")
	public String newDojo(@ModelAttribute("dojoObject") Dojo dojo) {
		return "newdojo.jsp";
	}
	
	@PostMapping("/adddojo")
	public String addDojo(@Valid @ModelAttribute("dojoObject") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newdojo.jsp";
		}
		else {
			dojoNinjaService.addDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") long id, Model model) {
		Dojo dojo = dojoNinjaService.oneDojo(id);
		model.addAttribute("dojo", dojo);
		return "show.jsp";
	}
	
	
	
}
