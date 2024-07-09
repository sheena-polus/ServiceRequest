package com.polus.servicerequest.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Roles")
public class Roles {


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "role_id")
	    private int roleId;

	    @Column(name = "role_name", nullable = false)
	    private String roleName;

	    @Column(name = "role_description", nullable = false)
	    private String roleDescription;

	    @OneToMany(mappedBy = "role")
	    private List<UserRoles> userRoles;

		public Roles(int roleId, String roleName, String roleDescription, List<UserRoles> userRoles) {
			super();
			this.roleId = roleId;
			this.roleName = roleName;
			this.roleDescription = roleDescription;
			this.userRoles = userRoles;
		}

		public int getRoleId() {
			return roleId;
		}

		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getRoleDescription() {
			return roleDescription;
		}

		public void setRoleDescription(String roleDescription) {
			this.roleDescription = roleDescription;
		}

		public List<UserRoles> getUserRoles() {
			return userRoles;
		}

		public void setUserRoles(List<UserRoles> userRoles) {
			this.userRoles = userRoles;
		}

	   
	}


