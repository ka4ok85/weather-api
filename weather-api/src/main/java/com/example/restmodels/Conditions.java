package com.example.restmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Conditions {

	@JsonProperty("response")
	private ConditionsResponse conditionsResponse;
	@JsonProperty("current_observation")
	private ConditionsCurrentObservation conditionsCurrentObservation;
	
	public ConditionsResponse getConditionsResponse() {
		return conditionsResponse;
	}
	public void setConditionsResponse(ConditionsResponse conditionsResponse) {
		this.conditionsResponse = conditionsResponse;
	}
	public ConditionsCurrentObservation getConditionsCurrentObservation() {
		return conditionsCurrentObservation;
	}
	public void setConditionsCurrentObservation(ConditionsCurrentObservation conditionsCurrentObservation) {
		this.conditionsCurrentObservation = conditionsCurrentObservation;
	}
	@Override
	public String toString() {
		return "Conditions [conditionsResponse=" + conditionsResponse + ", conditionsCurrentObservation="
				+ conditionsCurrentObservation + "]";
	}
	
	
}
