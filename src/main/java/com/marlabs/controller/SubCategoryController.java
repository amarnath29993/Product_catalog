package com.marlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.dto.SubCategoryDto;
import com.marlabs.service.SubCategoryService;

@RestController

public class SubCategoryController {

//	@Autowired
	private SubCategoryService service;

	@PostMapping("/save/subCategory")
	public ResponseEntity<SubCategoryDto> saveCategory(@RequestBody SubCategoryDto dto) {
		SubCategoryDto Category = service.addSubCategory(dto);
		return new ResponseEntity<SubCategoryDto>(Category, HttpStatus.OK);
	}
	

	@PutMapping("/updateCategory")
	public ResponseEntity<SubCategoryDto> updateCategory(@RequestBody SubCategoryDto dto) {
		SubCategoryDto Category = service.updateSubCategory(dto);
		return new ResponseEntity<SubCategoryDto>(Category, HttpStatus.OK);
	}

	@DeleteMapping("/deleteCategory/{id}")
	public ResponseEntity<SubCategoryDto> deleteCategory(@PathVariable int id) {
		SubCategoryDto Category = service.deleteSubCategoryById(id);
		return new ResponseEntity<SubCategoryDto>(Category, HttpStatus.OK);
	}
}
