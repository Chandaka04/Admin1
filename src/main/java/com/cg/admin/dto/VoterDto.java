package com.cg.admin.dto;

public class VoterDto {
	 private String username;
	    private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public VoterDto(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
		@Override
		public String toString() {
			return "VoterDto [username=" + username + ", password=" + password + "]";
		}
	    

}
