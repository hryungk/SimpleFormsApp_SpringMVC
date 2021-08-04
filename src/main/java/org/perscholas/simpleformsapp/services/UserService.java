package org.perscholas.simpleformsapp.services;

import org.perscholas.simpleformsapp.models.User;

public interface UserService {
	User findByEmail(String email);
	User add(User user);
}
