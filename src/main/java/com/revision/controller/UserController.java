package com.revision.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
	
	@GetMapping("/welcome")
	public String welcome(){
		return "This is welcome page";
	}
	
	
	@GetMapping("/")
	public String Home(){
		return "Welcome to Homepage....";
	}

	

}
