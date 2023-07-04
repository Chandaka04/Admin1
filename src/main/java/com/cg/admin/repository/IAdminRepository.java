package com.cg.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.admin.dto.AdminDTO;
import com.cg.admin.entity.Admin;



public interface IAdminRepository extends JpaRepository<Admin, Integer> {
    public Admin findByAdminUsername(String adminUsername);

	public Admin save(AdminDTO admindto);
}
