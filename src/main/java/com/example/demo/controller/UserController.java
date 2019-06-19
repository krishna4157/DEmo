package com.example.demo.controller;

import java.util.LinkedList;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.User;
@RestController
@RequestMapping("/user")
public class UserController {
User us = new User("Krishna" , "male");
//	@RequestMapping("/user")
//	public User ex2() {
//		return us;
//	}
	@GetMapping("/{name}/{gender}")
	public User GetUserByName(@PathVariable("name") String name,@PathVariable("gender") String gender) {
		User user = null;
		if(name.equals("john")){
			user = new User("john","male");
		}
		return user;
	}
	
	LinkedList list1 = new LinkedList();
	@PostMapping("/")
	public LinkedList createuser(@RequestBody User user) {
			if(list1.contains(user)) {
				
				System.out.println("User already exist");
				return list1;
			}
			else {
				list1.add(user);
				return list1;
			}
	}
	@DeleteMapping("/remove/{name}")
	public LinkedList Deleteuser(@RequestBody User user) {
		list1.remove(user);
		return list1;
	}
	@PutMapping("/")
	public LinkedList Modifyuser(@RequestBody User user) {
		list1.set(list1.size()-1,user);
		return list1;
	}
}
