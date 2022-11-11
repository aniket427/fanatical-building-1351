package com.flywheelcabs.services;

import java.time.LocalDate;
import java.util.List;

import com.flywheelcabs.exceptions.AdminException;
import com.flywheelcabs.exceptions.BookingException;
import com.flywheelcabs.exceptions.CustomerException;
import com.flywheelcabs.exceptions.LoginException;
import com.flywheelcabs.modules.Admin;
import com.flywheelcabs.modules.TripDetails;

public interface AdminServices {
   
	
	public Admin insertAdmin(Admin admin) throws AdminException;
	
	public Admin updateAdmin(Admin admin) throws AdminException, LoginException;
	
	public Admin deleteAdminById(Integer adminId) throws AdminException, LoginException;
	
    public List<TripDetails> getAllTrips(Integer customerId) throws AdminException, LoginException,
    CustomerException;
    
	public List<TripDetails> getTripCabwise(String carType) throws AdminException,BookingException;
	
	public List<TripDetails> getTripCustomerwise(Integer customerId) throws AdminException, CustomerException;
	
	public List<TripDetails> getAllTripsForDays(Integer customerId,LocalDate fromDate ,LocalDate toDate) throws AdminException, CustomerException;

	public List<TripDetails> getTripDatewise(LocalDate date) throws AdminException, CustomerException;

}
