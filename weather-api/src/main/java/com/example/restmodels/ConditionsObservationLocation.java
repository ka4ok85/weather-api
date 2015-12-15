package com.example.restmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionsObservationLocation {

	@JsonProperty("full")
	public String full;
	@JsonProperty("city")
	public String city;
	@JsonProperty("state")
	public String state;
	@JsonProperty("country")
	public String country;
	@JsonProperty("country_iso3166")
	public String countryIso3166;
	@JsonProperty("latitude")
	public String latitude;
	@JsonProperty("longitude")
	public String longitude;
	@JsonProperty("elevation")
	public String elevation;
	public String getFull() {
		return full;
	}
	public void setFull(String full) {
		this.full = full;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryIso3166() {
		return countryIso3166;
	}
	public void setCountryIso3166(String countryIso3166) {
		this.countryIso3166 = countryIso3166;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getElevation() {
		return elevation;
	}
	public void setElevation(String elevation) {
		this.elevation = elevation;
	}
	@Override
	public String toString() {
		return "ConditionsObservationLocation [full=" + full + ", city=" + city + ", state=" + state + ", country="
				+ country + ", countryIso3166=" + countryIso3166 + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", elevation=" + elevation + "]";
	}
	
	
}
