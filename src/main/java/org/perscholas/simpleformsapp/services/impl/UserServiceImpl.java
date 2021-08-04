package org.perscholas.simpleformsapp.services.impl;

import org.perscholas.simpleformsapp.models.User;
import org.perscholas.simpleformsapp.repositories.UserRepository;
import org.perscholas.simpleformsapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}


	@Override
	public User add(User user) {
		return userRepository.save(user);
	}

}
