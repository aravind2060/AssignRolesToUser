package com.example.dto;



import com.example.entity.Roles_Entity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class User_Dto {

    private long id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private int age;
	//Json filter send only true responses
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
		return "User_Dto [id=" + id + ", email=" + email + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", roleOfUser=" + roleOfUser + "]";
	}
	
	
}
