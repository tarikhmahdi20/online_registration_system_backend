package com.user.registration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class RegController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/")
	public String viewHome() {
		return "User Registration Home";
	}
	
	@GetMapping("/user")
	 public List<User> service(){
		return service.listAll();
	}
	
	
	@PostMapping("/userCreate")
	public User saveUser(@RequestBody User user) {
		return service.saveData(user);
	}
	
	}


