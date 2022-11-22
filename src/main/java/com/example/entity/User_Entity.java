package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class User_Entity {

	@Id
	@SequenceGenerator(name="user_sequence",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "user_sequence")
	private long id;
	
	@Column(name = "email",unique = true)
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private int age;
	/*Cascade is pending*/
	@ManyToOne()
	@JoinColumn(name="role_id")
	private Roles_Entity roleOfUser;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Roles_Entity getRoleOfUser() {
		return roleOfUser;
	}

	public void setRoleOfUser(Roles_Entity roleOfUser) {
		this.roleOfUser = roleOfUser;
	}

	@Override
	public String toString() {
		return "User_Entity [id=" + id + ", email=" + email + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", roleOfUser=" + roleOfUser + "]";
	}

	
	
}
