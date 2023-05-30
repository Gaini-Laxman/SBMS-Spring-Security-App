package com.klinnovations.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	
	@GetMapping("/loginCheck")
	public String login() {
		
		return "Login Page LOading.......";

	}
	
	@GetMapping("/contact")
	public String contact() {
		
		return "Call Us :: +91 93 92 29 17 18";
	}
	
	@GetMapping("/hi")
	public String SayHi() {
		
		return "Hi, How Are You ?";
	}

	@GetMapping("/hello")
	public String SayHello() {
		
		return "Hello, How Are You ?";
	}

}
