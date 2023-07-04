package com.cg.mediaplayer.admin.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.admin.dto.VoterDto;
import com.cg.admin.exceptions.AdminException;


@FeignClient(name="users-app",url="http://localhost:9191/users-app/api/user")
public interface VoterClient {
	
	@PostMapping("/addVoterRecord")
	public List<VoterDto> addUser(@RequestBody VoterDto userDto) throws AdminException;
		
	
	@PutMapping("/updateVoterRecord")
	public List<VoterDto> updateUser(@RequestBody VoterDto userDto) throws AdminException;
		
	  
	@DeleteMapping("/deleteUserRecord/{userLoginId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable Integer userLoginId) throws AdminException ;
		
	
	@GetMapping("/viewAllUsers")
	public List<VoterDto> viewAllUsers() throws AdminException ;
		
	
	@GetMapping("/getUserByUsername")
	public VoterDto getVoterByUsername(@PathVariable String username) throws AdminException ;
	
}
