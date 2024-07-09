package com.polus.servicerequest.dto;

public class LoginDTO {

	private String email;
	private String userPassword;

//constructors

	public LoginDTO() {
		super();
	}

	public LoginDTO(String email, String userpassword) {
		super();
		this.email = email;
		this.userPassword = userpassword;
	}

//getters and setters

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserpassword() {
		return userPassword;
	}

	public void setUserpassword(String userpassword) {
		this.userPassword = userpassword;
	}

	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", emp_password=" + userPassword + "]";
	}

}
