package com.marlabs.serviceimpl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlabs.dao.SubCategoryDao;
import com.marlabs.dto.CategoryDto;
import com.marlabs.dto.SubCategoryDto;
import com.marlabs.model.Category;
import com.marlabs.model.SubCategory;
import com.marlabs.service.SubCategoryService;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	@Autowired
	private SubCategoryDao sCDao;

	@Override
	public SubCategory mapDtoToEntity(SubCategoryDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubCategoryDto mapEntityToDto(SubCategory entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubCategoryDto addSubCategory(SubCategoryDto dto) {
		SubCategory sc = mapDtoToEntity(dto);
		sc = sCDao.addSubCategory(sc);
		return mapEntityToDto(sc);
	}

	@Override
	public SubCategoryDto updateSubCategory(SubCategoryDto dto) {
		SubCategory sc = mapDtoToEntity(dto);
		sc = sCDao.updateSubCategory(sc);
		return mapEntityToDto(sc);
	}

	@Override
	public SubCategoryDto getSubCategoryById(Integer id) {
		SubCategory sc = sCDao.getSubCategoryById(id);
		SubCategoryDto scdto = mapEntityToDto(sc);
		return scdto;
	}

	@Override
	public SubCategoryDto deleteSubCategoryById(Integer id) {
		SubCategory sc = sCDao.deleteSubCategoryById(id);
		SubCategoryDto scdto = mapEntityToDto(sc);
		return scdto;
	}

	@Override
	public List<SubCategoryDto> getAllSubCategories() {

		return null;
	}

	@Override
	public CategoryDto mapEntityToDto(Iterator<Category> iterator) {
		// TODO Auto-generated method stub
		return null;
	}

}
