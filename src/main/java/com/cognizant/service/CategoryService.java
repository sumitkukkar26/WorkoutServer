package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Category;

public interface CategoryService {
	
	public List<Category> getAllCategories();
	
	public Category addCategory(Category cat);
	
	public void deleteCategory(Category cat);
	

}