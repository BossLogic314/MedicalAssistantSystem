package com.project.medical.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.medical.model.Availability;
import com.project.medical.service.AvailabilityService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class AvailabilityController {

	@Autowired
	private AvailabilityService availabilityService;
	
	@GetMapping("/getAvailableDates")
	public List<String> getAvailableDates() {
		return availabilityService.getAvailableDates();
	}
	
	@GetMapping("/getAvailableSlotsForDate")
	public List<Availability> getAvailableSlotsForDate(String date) {
		return availabilityService.getAvailableSlotsForDate(date);
	}
}
