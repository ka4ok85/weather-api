package com.example.restmodels;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityAutoComplete {
	private List<CityItem> RESULTS;

	public List<CityItem> getRESULTS() {
		return RESULTS;
	}

	public void setRESULTS(List<CityItem> rESULTS) {
		RESULTS = rESULTS;
	}

	@Override
	public String toString() {
		return "CityAutoComplete [RESULTS=" + RESULTS + RESULTS.size() + "]";
	}

	
}
