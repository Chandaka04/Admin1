package com.rps.demo;

import org.junit.jupiter.api.Test;

import com.cg.admin.dto.AdminLoginDto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

 class AdminDtoTest {
	 @Test
	    void testAdminDtoEmptyConstructor() {
	        AdminLoginDto adminDto = new AdminLoginDto();

	        assertNull(adminDto.getUsername());
	        assertNull(adminDto.getPassword());
	    }

	    @Test
	    void testAdminDtoParameterizedConstructor() {
	        String username = "admin";
	        String password = "password123";

	        AdminLoginDto adminDto = new AdminLoginDto(username, password);

	        assertEquals(username, adminDto.getUsername());
	        assertEquals(password, adminDto.getPassword());
	    }

	    @Test
	    void testAdminDtoSettersAndGetters() {
	        AdminLoginDto adminDto = new AdminLoginDto();

	        String username = "admin";
	        String password = "password123";

	        adminDto.setUsername(username);
	        adminDto.setPassword(password);

	        assertEquals(username, adminDto.getUsername());
	        assertEquals(password, adminDto.getPassword());
	    }


}
