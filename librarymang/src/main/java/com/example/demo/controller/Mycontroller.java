package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class Mycontroller {

	@RequestMapping(value="/login")
	public String login() 
	
	{		
	
		return "login";	
		
	}
	@RequestMapping(value="/Home")
	public String home() 
	
	{		
	
		return "Home";	
		
	}
	
	
}


