package com.polus.servicerequest.entity;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USERID")
	private int userId;

	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;

	@Column(name = "LASTNAME", nullable = false)
	private String lastName;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "EMAIL", unique = true, nullable = false)
	private String email;

	@Column(name = "USERPASSWORD")
	private String userPassword;

	@LastModifiedDate
	@Column(name = "CREATED_AT", nullable = false)
	private Date createdAt;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "PHONE_NO")
	private String phoneNo;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserRoles> userRoles = new ArrayList<>();

	public User() {
		super();
	}

	public User(int userId, String firstName, String lastName, String designation, String email, String userPassword,
			Date createdAt, String country, String state, String address, String phoneNo, List<UserRoles> userRoles) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.email = email;
		this.userPassword = userPassword;
		this.createdAt = createdAt;
		this.country = country;
		this.state = state;
		this.address = address;
		this.phoneNo = phoneNo;
		this.userRoles = userRoles;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstName) {
		this.firstName = firstName;
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
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

	public List<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}

}
