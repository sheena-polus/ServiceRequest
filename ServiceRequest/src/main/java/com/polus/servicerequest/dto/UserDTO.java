package com.polus.servicerequest.dto;

public class UserDTO {

	private String firstName;
	private String lastName;
	private String designation;
	private String email;
	private String userPassword;
	private String country;
	private String state;
	private String address;
	private String phoneNo;

	public UserDTO() {
		super();
	}

	public UserDTO(String firstname, String lastname, String designation, String email, String userPassword,
			String country, String state, String address, String phoneNo) {
		super();
		this.firstName = firstname;
		this.lastName = lastname;
		this.designation = designation;
		this.email = email;
		this.userPassword = userPassword;
		this.country = country;
		this.state = state;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
