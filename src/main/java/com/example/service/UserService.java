package com.example.service;

import com.example.dto.User_Dto;
import com.example.entity.User_Entity;

public interface UserService {

	public User_Dto userSignUp(User_Dto userSignupRequest);
	
	public User_Dto userSignIn(User_Dto userSignInRequest);
}
