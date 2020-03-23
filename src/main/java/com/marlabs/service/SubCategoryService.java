package com.marlabs.service;

import java.util.List;

import com.marlabs.dao.BaseDao;
import com.marlabs.dto.SubCategoryDto;
import com.marlabs.model.SubCategory;

public interface SubCategoryService extends BaseDao<SubCategoryDto, SubCategory> {

	public SubCategoryDto addSubCategory(SubCategoryDto dto);

	public SubCategoryDto updateSubCategory(SubCategoryDto dto);

	public SubCategoryDto getSubCategoryById(Integer id);

	public SubCategoryDto deleteSubCategoryById(Integer id);

	public List<SubCategoryDto> getAllSubCategories();

}