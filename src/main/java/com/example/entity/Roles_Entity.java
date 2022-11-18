package com.example.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Roles_Entity {

	@Id
	private int roleId;
	
	private String roleName;
	
//	@OneToMany(mappedBy = "roleOfUser")
//	private List<User_Entity> userforthisrole;
	
	@ManyToMany
	private List<Privilege_Entity> privilegesforthisrole;

	public List<Privilege_Entity> getPrivilegesforthisrole() {
		return privilegesforthisrole;
	}

	public void setPrivilegesforthisrole(List<Privilege_Entity> privilegesforthisrole) {
		this.privilegesforthisrole = privilegesforthisrole;
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

//	public List<User_Entity> getUserforthisrole() {
//		return userforthisrole;
//	}
//
//	public void setUserforthisrole(List<User_Entity> userforthisrole) {
//		this.userforthisrole = userforthisrole;
//	}

	

	

	
	
    
}
