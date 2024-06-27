package com.cybage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.Model.User;
import com.cybage.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public User addUser(User user) {
		
		return userRepository.save(user);
	}

}
