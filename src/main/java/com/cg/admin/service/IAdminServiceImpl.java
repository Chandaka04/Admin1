package com.cg.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.admin.dto.AdminDTO;
import com.cg.admin.dto.AdminLoginDto;
import com.cg.admin.entity.Admin;
import com.cg.admin.exceptions.AdminException;
import com.cg.admin.repository.IAdminRepository;

@Service
public class IAdminServiceImpl implements IAdminService {

  @Autowired
  private IAdminRepository iAdminRepository;

  @Override
  public Admin createAdmin(AdminDTO admindto) throws AdminException {
    Admin existingAdmin = iAdminRepository.findByAdminUsername(
      admindto.getAdminUsername()
    );

    if (existingAdmin != null) throw new AdminException(
      "Admin already registered with this Username!"
    );

    return iAdminRepository.save(admindto);
  }

  @Override
  public Admin updateAdmin(Admin admin) throws AdminException {
    return iAdminRepository.save(admin);
  }

  @Override
  public Admin deleteAdmin(int adminId) throws AdminException {
      Optional<Admin> optionalAdmin = iAdminRepository.findById(adminId);
      Admin admin = optionalAdmin.orElseThrow(() -> new AdminException("Admin with id " + adminId + " not found!!"));
      iAdminRepository.deleteById(admin.getAdminId());
      return admin;
  }

  @Override
  public Admin viewAdmin(int adminId) throws AdminException {
      return iAdminRepository.findById(adminId)
              .orElseThrow(() -> new AdminException("Admin with id " + adminId + " not found!!"));
  }


  @Override
  public List<Admin> viewAllAdmin() throws AdminException {
    List<Admin> a = iAdminRepository.findAll();
    if (a.isEmpty()) {
      throw new AdminException("Sorry! No admin found!!");
    } else {
      return a;
    }
  }

  @Override
  public Boolean adminLogin(AdminLoginDto adminLoginDto) throws AdminException{
    
    Admin admin = iAdminRepository.findByAdminUsername(adminLoginDto.getUsername());
    if(admin.getAdminId() != 0){
      //check for password
      if(admin.getAdminPassword().equals(adminLoginDto.getPassword())){
        return true;
      }else{
        throw new AdminException("Incorrect password");
      }
    }else{
      throw new AdminException("Admin not found");
    }
    
  }
}