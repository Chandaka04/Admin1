package com.cg.admin.service;



import com.cg.admin.dto.AdminDTO;
import com.cg.admin.dto.AdminLoginDto;
import com.cg.admin.entity.Admin;
import com.cg.admin.exceptions.AdminException;

import java.util.List;

import javax.validation.Valid;

public interface IAdminService {
  public Admin createAdmin(@Valid AdminDTO admindto) throws AdminException;

  public Admin updateAdmin(Admin admin) throws AdminException;

  public Admin deleteAdmin(int id) throws AdminException;

  public Admin viewAdmin(int id) throws AdminException;

  public List<Admin> viewAllAdmin() throws AdminException;

  public Boolean adminLogin(AdminLoginDto adminLoginDto) throws AdminException;
}