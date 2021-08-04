package org.perscholas.simpleformsapp.repositories;

import org.perscholas.simpleformsapp.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
	User findByEmail(String email);
}
