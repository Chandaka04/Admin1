package com.cg.admin.controller;




import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.admin.dto.AdminDTO;
import com.cg.admin.dto.AdminLoginDto;
import com.cg.admin.entity.Admin;
import com.cg.admin.exceptions.AdminException;
import com.cg.admin.service.IAdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

  @Autowired
  IAdminService iAdminService;

  @PostMapping("/createAdmin")
  public ResponseEntity<Admin> saveAdmin(@Valid @RequestBody AdminDTO admindto)
    throws AdminException {
    Admin savedAdmin = iAdminService.createAdmin(admindto);
    return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
  }

 

  @DeleteMapping(value = "/deleteAdmin/{adminId}")
  public ResponseEntity<Admin> deleteAdmin(
    @PathVariable("adminId") int adminId
  ) throws AdminException {
    Admin deleteAdmin = iAdminService.deleteAdmin(adminId);
    return new ResponseEntity<>(deleteAdmin, HttpStatus.OK);
  }

  @GetMapping(value = "/viewAlladmin")
  public ResponseEntity<List<Admin>> getAdmin() throws AdminException {
    List<Admin> viewAlladmin = iAdminService.viewAllAdmin();
    return new ResponseEntity<>(viewAlladmin, HttpStatus.OK);
  }

  @GetMapping(value = "/viewAdmin/{adminId}")
  public ResponseEntity<Admin> getAdminById(@PathVariable int adminId)
    throws AdminException {
    Admin viewAdmin = iAdminService.viewAdmin(adminId);
    return new ResponseEntity<>(viewAdmin, HttpStatus.OK);
  }

  @PostMapping("/adminLogin")
  public ResponseEntity<Boolean> adminLogin(@RequestBody AdminLoginDto adminLoginDto) throws AdminException{
    return new ResponseEntity<>(iAdminService.adminLogin(adminLoginDto), HttpStatus.OK);
  }
}
