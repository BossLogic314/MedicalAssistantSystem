package com.project.medical.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/homePage")
public class HomePageController {

	@GetMapping
	public String getHomePage() {
		return "Home";
	}
	
	@PostMapping
	public String postHomePage() {
		return "redirect:/availabilityPage";
	}
}
