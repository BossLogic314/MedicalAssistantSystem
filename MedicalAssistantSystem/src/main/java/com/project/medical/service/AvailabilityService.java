package com.project.medical.service;

import java.util.List;

import com.project.medical.model.Availability;

public interface AvailabilityService {

	public List<String> getAvailableDates();
	
	public List<Availability> getAvailableSlotsForDate(String date);
}
