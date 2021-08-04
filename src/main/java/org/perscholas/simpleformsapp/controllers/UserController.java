package org.perscholas.simpleformsapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {	
	
	@GetMapping("/")
	public String showLoginPage() {
		return "login_form";
	}
	
	@PostMapping("/login") 
	public String logIn(@RequestParam("email") String email, @RequestParam("password") String password) {
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
		return "redirect:/";
	}

}
