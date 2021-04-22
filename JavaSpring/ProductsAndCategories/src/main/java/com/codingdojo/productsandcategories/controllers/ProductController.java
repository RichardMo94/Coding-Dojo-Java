package com.codingdojo.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.models.CategoryProduct;
import com.codingdojo.productsandcategories.models.Product;
import com.codingdojo.productsandcategories.services.ProductCategoryService;

@Controller
public class ProductController {
	private final ProductCategoryService productCategoryService;
	
	public ProductController(ProductCategoryService productCategoryService) {
		this.productCategoryService = productCategoryService;
	}
	
	@GetMapping("products/new")
	public String newProduct(@ModelAttribute("productObj") Product product) {
		return "newproduct.jsp";
	}
	@PostMapping("/addproduct")
	public String addProduct(@Valid @ModelAttribute("productObj") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newProduct.jsp";
		}else {
			productCategoryService.addProduct(product);
			return "redirect:/products/new";
		}
	}
	
	@GetMapping("product/{prodid}")
	public String showProduct(@PathVariable("prodid") Long prodid, @ModelAttribute("categoryProductObj") CategoryProduct categoryProduct, Model model) {
		Product product = productCategoryService.oneProduct(prodid);
		model.addAttribute("product", product);
		model.addAttribute("categories", productCategoryService.availableCategoriesForProduct(product));
		return "showproduct.jsp";
	}
	
	@PostMapping("/attachcategory")
	public String attachCategory(@ModelAttribute("categoryProductObj") CategoryProduct categoryProduct) {
		System.out.println(categoryProduct.getCategory().name());
		System.out.println(categoryProduct.getProduct().getName());
		productCategoryService.addProductToCategory(categoryProduct);
		return "redirect:/products/" + categoryProduct.getProduct().getId();
	}
	
	@GetMapping("categories/{catid}")
	public String showCategory(@PathVariable("catid") Long catid, @ModelAttribute("categoryProductObj") CategoryProduct categoryProduct, Model model) {
		Category category = productCategoryService.oneCategory(catid);
		model.addAttribute("category", category);
		model.addAttribute("products", productCategoryService.availableProductsForCategory(category));
		return "showcategory.jsp";
	}
	
	@PostMapping("/attachproduct")
	public String attachProduct(@ModelAttribute("categoryProductObj") CategoryProduct categoryProduct) {
		productCategoryService.addProductToCategory(categoryProduct);
		return "redirect:/categories/" + categoryProduct.getId();
	}
	
	
	
	
	
	
}
