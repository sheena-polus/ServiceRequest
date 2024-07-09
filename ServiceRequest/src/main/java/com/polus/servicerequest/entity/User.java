package com.polus.servicerequest.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	    @Column(name = "userid")
	    private int userId;

	    @Column(name = "firstname", nullable = false)
	    private String firstname;

	    @Column(name = "lastname", nullable = false)
	    private String lastname;

	    @Column(name = "designation")
	    private String designation;

	    @Column(name = "email", unique = true, nullable = false)
	    private String email;

	    @Column(name = "userpassword")
	    private String userPassword;

	    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	    private LocalDateTime createdAt;

	    @Column(name = "country")
	    private String country;

	    @Column(name = "state")
	    private String state;

	    @Column(name = "address")
	    private String address;

	    @Column(name = "phone_no")
	    private String phoneNo;

	    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<UserRoles> userRoles = new ArrayList<>();




		public User() {
			super();
		}
		


		public User(int userId, String firstname, String lastname, String designation, String email,
				String userPassword, LocalDateTime createdAt, String country, String state, String address,
				String phoneNo, List<UserRoles> userRoles) {
			super();
			this.userId = userId;
			this.firstname = firstname;
			this.lastname = lastname;
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



		public String getUserPassword() {
			return userPassword;
		}



		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}



		public LocalDateTime getCreatedAt() {
			return createdAt;
		}



		public void setCreatedAt(LocalDateTime createdAt) {
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



		@Override
		public String toString() {
			return "User [userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname + ", designation="
					+ designation + ", email=" + email + ", userPassword=" + userPassword + ", createdAt=" + createdAt
					+ ", country=" + country + ", state=" + state + ", address=" + address + ", phoneNo=" + phoneNo
					+ ", userRoles=" + userRoles + "]";
		}






		
      
	    
	}


