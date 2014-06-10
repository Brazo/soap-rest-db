package com.mulesoft.demo.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Booking", namespace="http://mulesoft.com/demo/ticket")
public final class Booking {

	@XmlElement(required=true)
	public BigDecimal price;
	@XmlElement(required=true)
	public String currency;
	@XmlElement(required=true)
	private String destination;
	@XmlElement(required=true)
	private String departure;
	@XmlElement(required=true)
	private String customer;
	
	public Booking(String customer, BigDecimal price, String currency, String destination, String departure) {
		this.currency = currency;
		this.customer = customer;
		this.price = price;
		this.departure = departure;
		this.destination = destination;
	}
	
	@SuppressWarnings("unused")
	private Booking() {
	
	}
	public String getCustomer() {
		return customer;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getCurrency() {
		return currency;
	}

	public String getDestination() {
		return destination;
	}

	public String getDeparture() {
		return departure;
	}


}
