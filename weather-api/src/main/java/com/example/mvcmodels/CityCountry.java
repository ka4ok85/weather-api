package com.example.mvcmodels;

import javax.validation.constraints.Size;

public class CityCountry {

	@Size(min=3, max=20)
	private String city;
	
	@Size(min=2, max=30)
	private String country;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "CityCountry [city=" + city + ", country=" + country + "]";
	}
	
	
	
}
