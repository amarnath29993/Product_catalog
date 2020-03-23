package com.marlabs.dao;

import java.util.List;

import com.marlabs.model.Admin;

public interface AdminDao {
	public Admin addAdmin(Admin admin);
	
	public Admin updateAdmin(Admin admin);
	public Admin getAdminById(Integer id);
	public Admin deleteAdminById(Integer id);
	
	public List<Admin> getAllAdmins();

}
