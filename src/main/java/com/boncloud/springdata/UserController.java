package com.boncloud.springdata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value="/users")
	public List<User> getAllUsers(){
		
		List<User> users = userService.getAllUsers();
		
		System.out.println(users.size());
		
		return users;
		
	}
	
	
}
