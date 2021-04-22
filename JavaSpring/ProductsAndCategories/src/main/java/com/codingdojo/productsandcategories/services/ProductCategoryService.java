package com.codingdojo.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.models.CategoryProduct;
import com.codingdojo.productsandcategories.models.Product;
import com.codingdojo.productsandcategories.repositories.CategoryRepository;
import com.codingdojo.productsandcategories.repositories.ProductCategoryRepository;
import com.codingdojo.productsandcategories.repositories.ProductRepository;

@Service
public class ProductCategoryService {
	private final ProductRepository productRepo;
	private final CategoryRepository categoryRepo;
	private final ProductCategoryRepository catProdRepo;
	
	public ProductCategoryService(ProductRepository productRepo, CategoryRepository categoryRepo, ProductCategoryRepository catProdRepo) {
		this.productRepo = productRepo;
		this.categoryRepo = categoryRepo;
		this.catProdRepo = catProdRepo;
	}
	public void addProduct(Product product) {
		productRepo.save(product);
	}
	
	public void setCat(Category category) {
	}
	public Product oneProduct(Long id) {
		Optional<Product> product = productRepo.findById(id);
		if(product.isPresent()) {
			return product.get();
		}else {
			return null;
		}
	}
	public Iterable<Product> availableProductsForCategory(Category category){
		return productRepo.findByCategoriesNotContains(category);
	}
	public void addCategory(Category category) {
		categoryRepo.save(category);
	}
	public List<Category> getAllCat(){
		return categoryRepo.findAll();
	}
	public List<Category> availableCategoriesForProduct(Product product){
		return categoryRepo.findByProductsNotContains(product);
	}
	public void addProductToCategory(CategoryProduct categoryProduct) {
		catProdRepo.save(categoryProduct);
	}
	
	public Category oneCategory(Long id) {
		Optional<Category> category = categoryRepo.findById(id);
		if(category.isPresent()) {
			return category.get();
		}else {
			return null;
		}
	}
	
	
	
	
	
}
