package com.cg.admin.dto;

public class AdminDTO {
	private String adminUsername;
	private String adminPassword;
	public AdminDTO(String adminUsername, String adminPassword) {
		super();
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
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
		return "AdminDTO [adminUsername=" + adminUsername + ", adminPassword=" + adminPassword + "]";
	}
	
	
}
