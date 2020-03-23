package com.marlabs.dao;

import java.util.List;

import com.marlabs.model.Category;

public interface CategoryDao {
	public Category addCategory(Category category);

	public Category updateCategory(Category category);

	public Category getCategoryById(Integer id);

	public Category deleteCategoryById(Integer id);

	public List<Category> getAllCategories();

}
