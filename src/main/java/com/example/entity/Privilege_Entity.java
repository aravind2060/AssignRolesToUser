package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name="Unqiue_Combinations_of_privileges_constraint",columnNames = {"accessToWareHouse","accessToControlRoom","accessToKitchen","accessToManageMoney","accessToBuyStock"})} )
public class Privilege_Entity {

	@Id
	@GeneratedValue
	private int privilegeId;
	
	private boolean accessToWareHouse;
	private boolean accessToControlRoom;
	private boolean accessToKitchen; 
	private boolean accessToManageMoney;
	private boolean accessToBuyStock;



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

	

	
}