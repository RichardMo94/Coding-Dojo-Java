package com.codingdojo.language.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.language.models.Language;
import com.codingdojo.language.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	private LanguageService languageService;
	
	@GetMapping("/languages")
	public String index(@ModelAttribute("language") Language language, Model model) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("allLanguages", languages);
		return "index.jsp";
	}
	
	@PostMapping("/languages/new")
	public String newLanguage(@Valid @ModelAttribute("language") Language language, BindingResult results) {
		if(results.hasErrors()) {
			return "index.jsp";
		}else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id){
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}
	
	@RequestMapping("languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}
	
	@RequestMapping(value="/languages/edit/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			languageService.updateLanguage(language.getId(), language.getName(), language.getCreator(), language.getVersion());
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "show.jsp";
	}
	
	
	
	
	
	
	
	
}
