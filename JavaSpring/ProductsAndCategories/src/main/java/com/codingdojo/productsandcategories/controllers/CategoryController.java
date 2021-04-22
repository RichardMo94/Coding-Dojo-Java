package com.codingdojo.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.services.ProductCategoryService;

@Controller
public class CategoryController {
	private final ProductCategoryService productCategoryService;
	
	public CategoryController(ProductCategoryService productCategoryService) {
		this.productCategoryService = productCategoryService;
	}
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute("categoryObj") Category category) {
		return "newcat.jsp";
	}
	
	@PostMapping("/addcategory")
	public String addCategpry(@Valid @ModelAttribute("categoryObj") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "categories/new";
		}else {
			productCategoryService.addCategory(category);
			return "redirect:/categories/new";
		}
	}
}
