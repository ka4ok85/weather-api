package com.example.restmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionsFeatures {
	
	@JsonProperty("conditions")
	private Integer conditions;

	public Integer getConditions() {
		return conditions;
	}

	public void setConditions(Integer conditions) {
		this.conditions = conditions;
	}

	@Override
	public String toString() {
		return "ConditionsFeatures [conditions=" + conditions + "]";
	}
	
	
	
}
