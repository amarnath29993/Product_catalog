package com.marlabs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marlabs.dto.AdminDto;
import com.marlabs.dto.SubCategoryDto;
import com.marlabs.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	//@Autowired
	private AdminService service;
	
	@GetMapping("/hello")
	public String gethello() {
		
		return "Hello.html";
	}
	
	@PostMapping("/save")
	public ResponseEntity<AdminDto>save(@RequestBody AdminDto dto){
		AdminDto adminDto=service.addAdmin(dto);
		return new ResponseEntity<AdminDto>(adminDto,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<AdminDto>update(@RequestBody AdminDto dto){
		AdminDto adminDto=service.updateAdmin(dto);
		return new ResponseEntity<AdminDto>(adminDto,HttpStatus.OK);
	}
	@DeleteMapping("/deleteCategory/{id}")
	public ResponseEntity<SubCategoryDto> deleteCategory(@PathVariable int id) {
		AdminDto admin = service.deleteAdminById(id);
		return new ResponseEntity<SubCategoryDto>(HttpStatus.OK);
	}
}
