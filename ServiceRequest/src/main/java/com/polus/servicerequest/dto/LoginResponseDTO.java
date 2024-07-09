package com.polus.servicerequest.dto;

import java.time.LocalDateTime;
import java.util.List;

public class LoginResponseDTO {
	private int userid;
    private String firstname;
    private String lastname;
    private String designation;
    private String email;
    private LocalDateTime created_at;
    private String country;
    private String state;
    private String address;
    private String phone_no;
    private List<RolesDTO> roles;
	public LoginResponseDTO(int userid, String firstname, String lastname, String designation, String email,
			LocalDateTime created_at, String country, String state, String address, String phone_no,
			List<RolesDTO> roles) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
		this.email = email;
		this.created_at = created_at;
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
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
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
	@Override
	public String toString() {
		return "LoginResponseDTO [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", designation=" + designation + ", email=" + email + ", created_at=" + created_at + ", country="
				+ country + ", state=" + state + ", address=" + address + ", phone_no=" + phone_no + ", roles=" + roles
				+ "]";
	}
    

}
