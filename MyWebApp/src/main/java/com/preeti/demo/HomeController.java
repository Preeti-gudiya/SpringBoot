package com.preeti.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("home")
	
	public String home()
	{
		System.out.println("Hello Everyone");
		return "home.jsp";
	}
}
