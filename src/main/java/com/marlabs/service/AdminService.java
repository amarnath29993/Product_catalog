package com.marlabs.service;

import java.util.List;

import com.marlabs.dao.BaseDao;
import com.marlabs.dto.AdminDto;
import com.marlabs.model.Admin;

public interface AdminService extends BaseDao<AdminDto, Admin> {
	public AdminDto addAdmin(AdminDto adminDto);

	public AdminDto updateAdmin(AdminDto adminDto);

	public AdminDto getAdminById(Integer id);

	public AdminDto deleteAdminById(Integer id);

	public List<AdminDto> getAllAdmins();
}
