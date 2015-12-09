package com.example.mvcmodels;

import javax.validation.constraints.Size;

public class City {

	@Size(min=3, max=20)
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
