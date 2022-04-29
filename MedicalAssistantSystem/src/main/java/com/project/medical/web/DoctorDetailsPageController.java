package com.project.medical.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/doctorDetailsPage")
public class DoctorDetailsPageController {

	@GetMapping
	public String getDoctorDetailsPage() {
		return "DoctorDetails";
	}
	
	@PostMapping
	public String postDoctorDetailsPage() {
		return "redirect:/availabilityPage";
	}
}
