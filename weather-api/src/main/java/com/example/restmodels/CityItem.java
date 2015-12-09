package com.example.restmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityItem {

	private String name; // Name of city
	private String type; // response type (city or hurricane)
	private String c;    // Country
	private String zmw;
	private String tz;   // time zone
	private String tzs;  // time zone code
	private String l;    // URL path and query string for result
	private String ll;   // Combined lat + lon
	private String lat;
	private String lon;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getZmw() {
		return zmw;
	}
	public void setZmw(String zmw) {
		this.zmw = zmw;
	}
	public String getTz() {
		return tz;
	}
	public void setTz(String tz) {
		this.tz = tz;
	}
	public String getTzs() {
		return tzs;
	}
	public void setTzs(String tzs) {
		this.tzs = tzs;
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	public String getLl() {
		return ll;
	}
	public void setLl(String ll) {
		this.ll = ll;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	@Override
	public String toString() {
		return "CityItem [name=" + name + ", type=" + type + ", c=" + c + ", zmw=" + zmw + ", tz=" + tz + ", tzs=" + tzs
				+ ", l=" + l + ", ll=" + ll + ", lat=" + lat + ", lon=" + lon + "]";
	}
	
	
	/*
	"name": "San Francisco, California", 
	"type": "city", 
	"c": "US",
	"zmw": "94101.1.99999",
	"tz": "America/Los_Angeles",
	"tzs": "PST",
	"l": "/q/zmw:94101.1.99999",
	"ll": "37.775009 -122.418259",
	"lat": "37.775009",
	"lon": "-122.418259"

    */
}
