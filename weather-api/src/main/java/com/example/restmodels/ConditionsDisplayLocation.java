package com.example.restmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionsDisplayLocation {

	@JsonProperty("full")
	private String full;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("state_name")
	private String stateName;
	@JsonProperty("country")
	private String country;
	@JsonProperty("country_iso3166")
	private String countryIso3166;
	@JsonProperty("zip")
	private String zip;
	@JsonProperty("latitude")
	private String latitude;
	@JsonProperty("longitude")
	private String longitude;
	@JsonProperty("elevation")
	private String elevation;
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
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
		return "ConditionsDisplayLocation [full=" + full + ", city=" + city + ", state=" + state + ", stateName="
				+ stateName + ", country=" + country + ", countryIso3166=" + countryIso3166 + ", zip=" + zip
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", elevation=" + elevation + "]";
	}
	
	
}
