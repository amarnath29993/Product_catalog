package com.marlabs.dao;

import java.util.List;

import com.marlabs.model.SubCategory;

public interface SubCategoryDao {
	public SubCategory addSubCategory(SubCategory subCategory);

	public SubCategory updateSubCategory(SubCategory subCategory);

	public SubCategory getSubCategoryById(Integer id);

	public SubCategory deleteSubCategoryById(Integer id);

	public List<SubCategory> getAllSubCategories();

}
