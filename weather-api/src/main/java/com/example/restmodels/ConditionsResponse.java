package com.example.restmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionsResponse {
	@JsonProperty("version")
	private String version;
	@JsonProperty("termsofService")
	private String termsofService;
	@JsonProperty("features")
	private ConditionsFeatures conditionsFeatures;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTermsofService() {
		return termsofService;
	}
	public void setTermsofService(String termsofService) {
		this.termsofService = termsofService;
	}
	public ConditionsFeatures getConditionsFeatures() {
		return conditionsFeatures;
	}
	public void setConditionsFeatures(ConditionsFeatures conditionsFeatures) {
		this.conditionsFeatures = conditionsFeatures;
	}
	@Override
	public String toString() {
		return "ConditionsResponse [version=" + version + ", termsofService=" + termsofService + ", conditionsFeatures="
				+ conditionsFeatures + "]";
	}
	
	
}
