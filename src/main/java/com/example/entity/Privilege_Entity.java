package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Privilege_Entity {

	@Id
	private int privilegeId;
	
	private boolean accessToWareHouse;
	private boolean accessToControlRoom;
	private boolean accessToKitchen; 
	private boolean accessToManageMoney;
	private boolean accessToBuyStock;

	@ManyToMany(mappedBy = "privilegesforthisrole")
	private List<Roles_Entity>listofroles;

	public int getPrivilegeId() {
		return privilegeId;
	}

	public void setPrivilegeId(int privilegeId) {
		this.privilegeId = privilegeId;
	}

	public boolean isAccessToWareHouse() {
		return accessToWareHouse;
	}

	public void setAccessToWareHouse(boolean accessToWareHouse) {
		this.accessToWareHouse = accessToWareHouse;
	}

	public boolean isAccessToControlRoom() {
		return accessToControlRoom;
	}

	public void setAccessToControlRoom(boolean accessToControlRoom) {
		this.accessToControlRoom = accessToControlRoom;
	}

	public boolean isAccessToKitchen() {
		return accessToKitchen;
	}

	public void setAccessToKitchen(boolean accessToKitchen) {
		this.accessToKitchen = accessToKitchen;
	}

	public boolean isAccessToManageMoney() {
		return accessToManageMoney;
	}

	public void setAccessToManageMoney(boolean accessToManageMoney) {
		this.accessToManageMoney = accessToManageMoney;
	}

	public boolean isAccessToBuyStock() {
		return accessToBuyStock;
	}

	public void setAccessToBuyStock(boolean accessToBuyStock) {
		this.accessToBuyStock = accessToBuyStock;
	}

	public List<Roles_Entity> getListofroles() {
		return listofroles;
	}

	public void setListofroles(List<Roles_Entity> listofroles) {
		this.listofroles = listofroles;
	}

	
}