package com.polus.servicerequest.dto;

public class UserDTO {
	

	    private String firstname;
	    private String lastname;
	    private String designation;
	    private String email;
	    private String empPassword;
	    private String country;
	    private String state;
	    private String address;
	    private String phoneNo;
		public UserDTO(String firstname, String lastname, String designation, String email, String empPassword,
				String country, String state, String address, String phoneNo) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.designation = designation;
			this.email = email;
			this.empPassword = empPassword;
			this.country = country;
			this.state = state;
			this.address = address;
			this.phoneNo = phoneNo;
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
