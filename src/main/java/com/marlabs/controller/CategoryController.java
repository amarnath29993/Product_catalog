package com.marlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.dto.CategoryDto;
import com.marlabs.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	//@Autowired
	private CategoryService service;

	@PostMapping("/saveCategory")
	public ResponseEntity<CategoryDto> saveCategory(@RequestBody CategoryDto dto) {
		CategoryDto Category = service.addCategory(dto);
		return new ResponseEntity<CategoryDto>(Category, HttpStatus.OK);
	}
	@PutMapping("/updateCategory")
	public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto dto) {
		CategoryDto Category = service.updateCategory(dto);
		return new ResponseEntity<CategoryDto>(Category, HttpStatus.OK);
	}

	@DeleteMapping("/deleteCategory/{id}")
	public ResponseEntity<CategoryDto> deleteCategory(@PathVariable int id) {
		CategoryDto Category = service.deleteCategoryById(id);
		return new ResponseEntity<CategoryDto>(Category, HttpStatus.OK);
	}

}
