package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Roles_Entity {

	@Id
	@GeneratedValue
	private int roleId;
	
	@Column(unique = true)
	private String roleName;
	
	@OneToOne
	@JoinColumn(name = "privilegeId",nullable = false)
	private Privilege_Entity privilegeId;

	public Privilege_Entity getPrivilegesforthisrole() {
		
		return privilegeId;
	}

	public void setPrivilegesforthisrole(Privilege_Entity privilegeId) {
		this.privilegeId = privilegeId;
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

	@Override
	public String toString() {
		return "Roles_Entity [roleId=" + roleId + ", roleName=" + roleName + ", privilegeId=" + privilegeId + "]";
	}
	
    
}
