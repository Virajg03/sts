package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControlller {
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a = 50;
		int b = 60;
		int c = 110;
		return "this is testing" + (a + b + c);
	}
}
