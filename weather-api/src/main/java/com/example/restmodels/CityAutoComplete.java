package com.example.restmodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CityAutoComplete {
	@JsonProperty
	private List<CityItem> RESULTS = new ArrayList<CityItem>();

	public List<CityItem> getRESULTS() {
		return RESULTS;
	}

	public void setRESULTS(List<CityItem> rESULTS) {
		RESULTS = rESULTS;
	}

	@Override
	public String toString() {
		return "CityAutoComplete [RESULTS=" + RESULTS + "]";
	}

	
}
