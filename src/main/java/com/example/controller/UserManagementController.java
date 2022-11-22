package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.User_Dto;
import com.example.entity.User_Entity;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserManagementController {
      
	 @Autowired
	 private UserService userService;
	 
	 @PostMapping(path = "/signup")
	 public ResponseEntity<Object> userSignUp(@RequestBody User_Dto userSignupRequest){
		 
	      try {	 
		   User_Dto response_User=userService.userSignUp(userSignupRequest);
		   return new ResponseEntity<Object>(response_User,HttpStatus.OK);
		  }catch(Exception e) {
			  return new ResponseEntity<Object>(""+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	 }
	 @PostMapping(path="/signin")
	 public ResponseEntity<Object> userSignIn(@RequestBody User_Dto userSignInRequest){
		 try {
			 User_Dto res=userService.userSignIn(userSignInRequest);
			 
			 return new ResponseEntity<Object>(res,HttpStatus.OK);
		 }catch(Exception e) {
			 return new ResponseEntity<Object>(""+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		 }
	 }
	 
}
