package com.vova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		
		model.addAttribute("greeting","Greetings from the controller!");
		return "hello"; // tied to hello.jsp
	}
	@RequestMapping(value="/goodbye")
	public String sayHello2(Model model) {
		
		model.addAttribute("greeting","Goodbye from the controller!");
		return "hello"; // tied to hello.jsp
	}
}
