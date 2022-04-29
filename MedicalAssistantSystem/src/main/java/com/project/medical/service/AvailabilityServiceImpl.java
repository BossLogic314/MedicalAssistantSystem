package com.project.medical.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.medical.model.Availability;
import com.project.medical.repository.AvailabilityRepository;

@Service
public class AvailabilityServiceImpl implements AvailabilityService {

	@Autowired
	private AvailabilityRepository availabilityRepository;
	
	@Override
	public List<String> getAvailableDates() {
		
		ArrayList<Date> availableDates = (ArrayList<Date>) availabilityRepository.getAvailableDates();
		
		ArrayList<String>availableDateStrings = new ArrayList<String>();
		
		for (Date availableDate : availableDates) {
			
			String date = "";
			
			date += Integer.toString(availableDate.getYear() + 1900);
			date += "/";
			date += Integer.toString(availableDate.getMonth() + 1);
			date += "/";
			date += Integer.toString(availableDate.getDate());
			
			availableDateStrings.add(date);
		}
		
		return availableDateStrings;
	}
	
	@Override
	public List<Availability> getAvailableSlotsForDate(String date) {
		return (List<Availability>) availabilityRepository.getAvailableSlotsForDate(date);
	}
}
