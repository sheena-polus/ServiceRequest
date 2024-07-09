package com.polus.servicerequest.dto;

public class RolesDTO {
	 private int roleid;
	    private String rolename;
	    private String roledescription;
	    
	    
		public RolesDTO() {
			super();
		}
		public RolesDTO(int roleid, String rolename, String roledescription) {
			super();
			this.roleid = roleid;
			this.rolename = rolename;
			this.roledescription = roledescription;
		}
		public int getRoleid() {
			return roleid;
		}
		public void setRoleid(int roleid) {
			this.roleid = roleid;
		}
		public String getRolename() {
			return rolename;
		}
		public void setRolename(String rolename) {
			this.rolename = rolename;
		}
		public String getRoledescription() {
			return roledescription;
		}
		public void setRoledescription(String roledescription) {
			this.roledescription = roledescription;
		}
	    
}
