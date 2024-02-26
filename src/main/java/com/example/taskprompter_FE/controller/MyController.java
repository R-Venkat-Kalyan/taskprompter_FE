package com.example.taskprompter_FE.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
	
	
	@GetMapping("/")
	public String Home() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "Login";
	}

	@GetMapping("/register")
	public String register() {
		return "Register";
	}

	@GetMapping("/user")
	public String dashboard() {
		return "DashBoard";
	}

	@GetMapping("/addTask")
	public String addTask() {
		return "AddTask";
	}



}
