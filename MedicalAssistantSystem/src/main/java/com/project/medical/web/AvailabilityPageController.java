package com.project.medical.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/availabilityPage")
public class AvailabilityPageController {

	@GetMapping
	public String getAppointmentPage() {
		return "Availability";
	}
	
	@PostMapping
	public String getDoctorDetailsPage() {
		return "redirect:/doctorDetailsPage";
	}
}
