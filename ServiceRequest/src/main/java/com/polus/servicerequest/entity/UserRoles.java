package com.polus.servicerequest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserRoles")
public class UserRoles {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;

	    @ManyToOne
	    @JoinColumn(name = "emp_id", nullable = false)
	    private User user;

	    @ManyToOne
	    @JoinColumn(name = "role_id", nullable = false)
	    private Roles role;

		public UserRoles(int id, User user, Roles role) {
			super();
			this.id = id;
			this.user = user;
			this.role = role;
		}

		public UserRoles() {
			// TODO Auto-generated constructor stub
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Roles getRole() {
			return role;
		}

		public void setRole(Roles role) {
			this.role = role;
		}

		@Override
		public String toString() {
			return "UserRoles [id=" + id + ", user=" + user + ", role=" + role + "]";
		}

		public void setEmpId(int empId) {
			// TODO Auto-generated method stub
			
		}

	    
	

}
