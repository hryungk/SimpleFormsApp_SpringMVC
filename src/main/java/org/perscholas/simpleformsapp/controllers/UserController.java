package org.perscholas.simpleformsapp.controllers;

import org.perscholas.simpleformsapp.models.User;
import org.perscholas.simpleformsapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {	
	
	private UserService userService;
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping("/")
	public String showLoginPage(Model model) {
		return "login_form";
	}
	
	@PostMapping("/login") 
	public String logIn(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
		User user = userService.findByEmail(email);
		if (user != null && user.getPassword().equals(password)) { // user is found and credentials matche
			model.addAttribute("firstName", user.getFirstName());
			return showLoginSuccessPage(model);
		} else {
			if (user == null) { // user is not found
				String message = "Email address not found";
				model.addAttribute("message", message);
				return showLoginPage(model);
			} else { // user is found but password is wrong
				String message = "Password is not correct. Please try again.";
				model.addAttribute("message", message);
				return showLoginPage(model);
			}
		}
	}
	
	@GetMapping("/login_success")
	public String showLoginSuccessPage(Model model) {
		return "login_success";
		
	}

}
