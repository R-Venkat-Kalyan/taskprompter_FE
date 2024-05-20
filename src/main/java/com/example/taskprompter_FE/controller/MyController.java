package com.example.taskprompter_FE.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
	
	
	@GetMapping("/")
	public String Home() {
		return "index";
	}

	@GetMapping("/error")
	public String login() {
		return "error";
	}

	



}
