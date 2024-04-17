package com.blog.services;

import java.util.List;

import com.blog.entities.Category;
import com.blog.exceptions.CategoryException;

public interface CategoryService {
	
	Category createCategory(Category category) throws CategoryException;
	Category updateCategory(Category category, Integer categoryId) throws CategoryException;
	Category deleteCategory(Integer categoryId) throws CategoryException;
	Category getCategory(Integer categoryId) throws CategoryException;
	List<Category> getCategories() throws CategoryException;

}
