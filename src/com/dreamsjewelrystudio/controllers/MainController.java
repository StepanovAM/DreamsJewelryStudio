package com.dreamsjewelrystudio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String getHomePage() {
		
		return "index";
	}
	
	@GetMapping("/aboutUs")
	public String getAboutUsPage() {
		return "new";
	}
	
	@GetMapping("/404")
	public String return404(Model model) {
		model.addAttribute("exceptionMsg", "Something went wrong!");
		return "404";
	}
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		e.printStackTrace();
		return "404";
	}
}
