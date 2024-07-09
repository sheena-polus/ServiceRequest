package com.polus.servicerequest.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "emp_id")
	    private int empId;

	    @Column(name = "firstname", nullable = false)
	    private String firstname;

	    @Column(name = "lastname", nullable = false)
	    private String lastname;

	    @Column(name = "designation")
	    private String designation;

	    @Column(name = "email", unique = true, nullable = false)
	    private String email;

	    @Column(name = "emp_password")
	    private String empPassword;

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

		public int getEmpId() {
			return empId;
		}

		
		
		public User(int empId, String firstname, String lastname, String designation, String email, String empPassword,
				LocalDateTime createdAt, String country, String state, String address, String phoneNo) {
			super();
			this.empId = empId;
			this.firstname = firstname;
			this.lastname = lastname;
			this.designation = designation;
			this.email = email;
			this.empPassword = empPassword;
			this.createdAt = createdAt;
			this.country = country;
			this.state = state;
			this.address = address;
			this.phoneNo = phoneNo;
		}



		



		public User() {
			super();
		}



		public void setEmpId(int empId) {
			this.empId = empId;
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

		public String getEmpPassword() {
			return empPassword;
		}

		public void setEmpPassword(String empPassword) {
			this.empPassword = empPassword;
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



		@Override
		public String toString() {
			return "User [empId=" + empId + ", firstname=" + firstname + ", lastname=" + lastname + ", designation="
					+ designation + ", email=" + email + ", empPassword=" + empPassword + ", createdAt=" + createdAt
					+ ", country=" + country + ", state=" + state + ", address=" + address + ", phoneNo=" + phoneNo
					+ "]";
		}
      
	    
	}


