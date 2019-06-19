package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;

@RestController
public class UserController {
	@RequestMapping()
	public String ex1() {
		return "Hello World";
	}
	
	User us = new User("Krishna" , "male");
	@RequestMapping("/user")
	public User ex2() {
		return us;
	}
	@RequestMapping("/bye")
	public String Bye() {
		return "bye";
	}
}
