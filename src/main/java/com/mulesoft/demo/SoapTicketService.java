package com.mulesoft.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.mulesoft.demo.model.Booking;

@WebService(serviceName="TicketService")
public class SoapTicketService {
	
	@WebMethod()
	public void createBooking(Booking booking) {
		
	}
}
