package com.example.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dto.User_Dto;
import com.example.entity.User_Entity;

@Component
public class UserEntityToDtoConverter {

	@Autowired
	private ModelMapper modelMapper;
	
	public User_Entity convertUserdtoToUserEntity(User_Dto user) {
		
		return this.modelMapper.map(user, User_Entity.class);
	}
	
	public User_Dto convertUserEntityToUserDto(User_Entity user) {
		return this.modelMapper.map(user, User_Dto.class);
	}
}
