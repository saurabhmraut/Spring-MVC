package com.spring;


public class Address {
	private String street;
	private String city;
	private String state;
	
	private String zip;
	private String country;
	public Address(String street, String city, String state, String zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	public Address() {
		super();
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}

	public void setZaip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public void printAddressDetail(){
		 
	    System.out.println("Address Street \t\t: " + street);
	    System.out.println("Address City \t\t: " + city);
	    System.out.println("Address State \t\t: " + state);
	    System.out.println("Address Zip Code \t: " + zip);
	    System.out.println("Address Zip Code \t: " + country);
	}

}