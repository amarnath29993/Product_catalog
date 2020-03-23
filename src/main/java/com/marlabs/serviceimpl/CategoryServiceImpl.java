package com.marlabs.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlabs.dao.CategoryDao;
import com.marlabs.dto.CategoryDto;
import com.marlabs.model.Category;
import com.marlabs.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao dao;

	@Override
	public Category mapDtoToEntity(CategoryDto dto) {
		/*
		 * Category cat=new Category(); cat.setCategoryId(dto.getCategoryId());
		 * cat.setCategoryName(dto.getCategoryName());
		 * cat.setCategoryDesc(dto.getCategotyDesc());
		 */
		return null;
	}

	@Override
	public CategoryDto mapEntityToDto(Iterator<Category> iterator) {
		/*
		 * CategoryDto cdto=new CategoryDto(); cdto.setCategoryId(((CategoryDto)
		 * iterator).getCategoryId()); cdto.setCategoryName(((CategoryDto)
		 * iterator).getCategoryName()); cdto.setCategotyDesc(((Category)
		 * iterator).getCategoryDesc());
		 */
		return null;
	}

	@Override
	public CategoryDto addCategory(CategoryDto dto) {
		Category cat = mapDtoToEntity(dto);
		cat = dao.addCategory(cat);
		return mapEntityToDto(cat);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto dto) {
		Category cat = mapDtoToEntity(dto);
		cat = dao.updateCategory(cat);
		dto = mapEntityToDto(cat);
		return dto;
	}

	@Override
	public CategoryDto getCategoryById(Integer id) {
		Category cat = dao.getCategoryById(id);
		CategoryDto cdto = mapEntityToDto(cat);
		return cdto;
	}

	@Override
	public CategoryDto deleteCategoryById(Integer id) {
		Category cat = dao.deleteCategoryById(id);
		CategoryDto cdto = mapEntityToDto(cat);
		return cdto;
	}

	@Override
	public List<CategoryDto> getAllCategories() {
		/*
		 * List<Category> list=dao.getAllCategories(); List<CategoryDto>
		 * listdto=mapEntityToDto(list.iterator()); for(int i=0;i<list.size();i++) {
		 * CategoryDto cdto=new CategoryDto(); BeanUtils.copyProperties(listdto, cdto);
		 * }
		 */
		return null;
	}

	public List<CategoryDto> mapEntitiesToDto(Iterator<Category> CategorysList) {
		List<CategoryDto> Categorydtos = null;

		if (CategorysList != null) {
			Categorydtos = new ArrayList<CategoryDto>();
			while (CategorysList.hasNext()) {
				Categorydtos.add(mapEntityToDto(CategorysList.next()));
			}
		}

		return Categorydtos;
	}

	@Override
	public CategoryDto mapEntityToDto(Category entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
