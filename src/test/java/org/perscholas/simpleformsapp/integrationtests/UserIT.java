package org.perscholas.simpleformsapp.integrationtests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.perscholas.simpleformsapp.config.WebAppConfig;
import org.perscholas.simpleformsapp.models.User;
import org.perscholas.simpleformsapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {WebAppConfig.class})
@WebAppConfiguration("WebContent")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserIT {
	private UserService userService;
	private User expected;
	
	@Autowired
	public UserIT(UserService userService) {
		this.userService = userService;
	}
	
	@BeforeAll
	void setUp() {
		User u = new User("johnId", "John", "Doe", "johndoe@email.com", "john1234");
		expected = userService.add(u);
	}
	
	@Test
	void testFindByEmail() {
		User actual = userService.findByEmail(expected.getEmail());
		assertEquals(expected, actual);
	}
}
