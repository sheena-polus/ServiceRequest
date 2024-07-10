package com.polus.servicerequest.dto;

public class RolesDTO {
	private int roleId;
	private String roleName;
	private String roleDescription;

	public RolesDTO() {
		super();
	}

	public RolesDTO(int roleid, String rolename, String roledescription) {
		super();
		this.roleId = roleid;
		this.roleName = rolename;
		this.roleDescription = roledescription;
	}

	public int getRoleid() {
		return roleId;
	}

	public void setRoleid(int roleid) {
		this.roleId = roleid;
	}

	public String getRolename() {
		return roleName;
	}

	public void setRolename(String rolename) {
		this.roleName = rolename;
	}

	public String getRoledescription() {
		return roleDescription;
	}

	public void setRoledescription(String roledescription) {
		this.roleDescription = roledescription;
	}

}
