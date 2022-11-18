package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.User_Dao;
import com.example.dto.User_Dto;
import com.example.entity.User_Entity;
import com.example.util.UserEntityToDtoConverter;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private User_Dao userdao;
	
	@Autowired
	private UserEntityToDtoConverter userentityConverter;
	
	@Override
	public User_Dto userSignUp(User_Dto userSignupRequest) {
		
		User_Entity rawRequest=userentityConverter.convertUserdtoToUserEntity(userSignupRequest);
		
		User_Entity response=userdao.userSignUp(rawRequest);
		
		return userentityConverter.convertUserEntityToUserDto(response);
	}

	@Override
	public User_Dto userSignIn(User_Dto userSignInRequest) {
		
	   User_Entity raw=userentityConverter.convertUserdtoToUserEntity(userSignInRequest);
	  
	   User_Entity response=userdao.userSignIn(raw);

	   return userentityConverter.convertUserEntityToUserDto(response);
	}
 
}
