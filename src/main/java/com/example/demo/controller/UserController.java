package com.example.demo.controller;
import java.util.LinkedList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/user")


public class UserController {       
	@Autowired
	UserService Userservice;
	@GetMapping("/name/{id}")
	public Optional<User> GetUserById(@PathVariable("id") long Id) {
		return Userservice.GetUserById(Id);
	}
	
	LinkedList list1 = new LinkedList();
	@PostMapping("/")
	public LinkedList createuser(@RequestBody User user) {
			return Userservice.createuser(user);
			
	}
	@DeleteMapping("/remove/{name}")
	public LinkedList<User> Deleteuser(@RequestBody User user) {
		list1.remove(user);
		return list1;
	}
	@PutMapping("/")
	public LinkedList<User> Modifyuser(@RequestBody User user) {
		list1.set(list1.size()-1,user);
		return list1;
	}
}
