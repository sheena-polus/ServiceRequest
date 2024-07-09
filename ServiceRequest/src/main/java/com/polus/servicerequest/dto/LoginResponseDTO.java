package com.polus.servicerequest.dto;


import java.util.Date;
import java.util.List;

public class LoginResponseDTO {
	private int userid;
	private String firstName;
	private String lastName;
	private String designation;
	private String email;
	private Date createdAt;
	private String country;
	private String state;
	private String address;
	private String phone_no;
	private List<RolesDTO> roles;

	public LoginResponseDTO(int userid, String firstname, String lastname, String designation, String email,
			Date created_at, String country, String state, String address, String phone_no,
			List<RolesDTO> roles) {
		super();
		this.userid = userid;
		this.firstName = firstname;
		this.lastName = lastname;
		this.designation = designation;
		this.email = email;
		this.createdAt = created_at;
		this.country = country;
		this.state = state;
		this.address = address;
		this.phone_no = phone_no;
		this.roles = roles;
	}

	public LoginResponseDTO() {
		super();
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public Date getCreated_at() {
		return createdAt;
	}

	public void setCreated_at(Date created_at) {
		this.createdAt = created_at;
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

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public List<RolesDTO> getRoles() {
		return roles;
	}

	public void setRoles(List<RolesDTO> roles) {
		this.roles = roles;
	}

	

}
