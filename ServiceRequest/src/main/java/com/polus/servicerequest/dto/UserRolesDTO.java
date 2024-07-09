package com.polus.servicerequest.dto;

public class UserRolesDTO {
	private int empId;

	
	public UserRolesDTO(int empId) {
		super();
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
}
