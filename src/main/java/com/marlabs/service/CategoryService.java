package com.marlabs.service;

import java.util.List;

import com.marlabs.dao.BaseDao;
import com.marlabs.dto.CategoryDto;
import com.marlabs.model.Category;

public interface CategoryService extends BaseDao<CategoryDto, Category> {
	public CategoryDto addCategory(CategoryDto dto);

	public CategoryDto updateCategory(CategoryDto dto);

	public CategoryDto getCategoryById(Integer id);

	public CategoryDto deleteCategoryById(Integer id);

	public List<CategoryDto> getAllCategories();

}
