package com.polus.servicerequest.dto;

public class LoginDTO {

	private String email;
    private String userdtopassword;
    
    public LoginDTO(String email, String userpassword) {
		super();
		this.email = email;
		this.userdtopassword = userpassword;
	}
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getUserpassword() {
		return userdtopassword;
	}

	public void setUserpassword(String userpassword) {
		this.userdtopassword = userpassword;
	}

	public LoginDTO() {
		super();
	}

	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", emp_password=" + userdtopassword + "]";
	}
	
	
    
    
}
