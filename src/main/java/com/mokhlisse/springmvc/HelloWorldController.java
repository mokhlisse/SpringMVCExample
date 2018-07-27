package com.mokhlisse.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String hello(Model model) {

		String helloWorldMessage = "Hello world from java2blog!";
		model.addAttribute("message", helloWorldMessage);
		return "helloworld";
	}
}
