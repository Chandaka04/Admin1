package com.cg.admin.dto;



public class AdminTokenDto {
    private String token;

    public AdminTokenDto(){}

    public AdminTokenDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

