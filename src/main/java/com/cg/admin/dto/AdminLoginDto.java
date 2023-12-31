package com.cg.admin.dto;

public class AdminLoginDto {
    private String username;
    private String password;
    public AdminLoginDto() {
    }
    public AdminLoginDto(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "UserLoginDto [username=" + username + ", password=" + password + "]";
    }
}