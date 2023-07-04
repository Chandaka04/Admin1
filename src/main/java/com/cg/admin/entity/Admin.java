package com.cg.admin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Admin {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int adminId;

  @NotNull(message = "Username Cannot be Empty")
  @NotBlank(message = "Username cannot be blank")
  private String adminUsername;

  @NotNull(message = "Password Cannot be Empty")
  @NotBlank(message = "Password cannot be blank")
  @Pattern(
    regexp = "[A-Za-z0-9!@#$%^&*_]{8,20}",
    message = "Password should be 8-20 characters long."
  )
  private String adminPassword;

  

  public Admin() {
  }
  

  public Admin(int adminId,
      @NotNull(message = "Username Cannot be Empty") @NotBlank(message = "Username cannot be blank") String adminUsername,
      @NotNull(message = "Password Cannot be Empty") @NotBlank(message = "Password cannot be blank") @Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,20}", message = "Password should be 8-20 characters long.") String adminPassword) {
    this.adminId = adminId;
    this.adminUsername = adminUsername;
    this.adminPassword = adminPassword;
  }


  public int getAdminId() {
    return adminId;
  }

  public void setAdminId(int adminId) {
    this.adminId = adminId;
  }

  public String getAdminUsername() {
    return adminUsername;
  }

  public void setAdminUsername(String adminUsername) {
    this.adminUsername = adminUsername;
  }

  public String getAdminPassword() {
    return adminPassword;
  }

  public void setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
  }


  @Override
  public String toString() {
    return "Admin [adminId=" + adminId + ", adminUsername=" + adminUsername + ", adminPassword=" + adminPassword + "]";
  }


  
}