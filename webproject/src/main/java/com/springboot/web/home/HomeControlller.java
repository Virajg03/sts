package com.springboot.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControlller {
	@RequestMapping("/")
	public String home() {
		System.out.println("this is home page");
		return "home";
	}
	@RequestMapping("/contect")
	public String contect() {
		System.out.println("this is contact page");
		return "contect";
	}
}
