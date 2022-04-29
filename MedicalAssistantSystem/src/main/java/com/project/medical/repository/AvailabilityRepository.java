package com.project.medical.repository;

import java.sql.Date;

import com.project.medical.model.Availability;

public interface AvailabilityRepository {

	public Iterable<Date> getAvailableDates();
	
	public Iterable<Availability> getAvailableSlotsForDate(String date);
}
