package com.cybage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.Model.User;
import com.cybage.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	public ResponseEntity<User> addser(@RequestBody User user)
	{
		User addedUser =userService.addUser(user);
		return new ResponseEntity<>(addedUser,HttpStatus.CREATED);
	}

}
