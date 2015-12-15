package com.example.restmodels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionsCurrentObservation {

	@JsonProperty("image")
	private ConditionsImage conditionsImage;
	@JsonProperty("display_location")
	private ConditionsDisplayLocation conditionsDisplayLocation;
	@JsonProperty("observation_location")
	private ConditionsObservationLocation conditionsObservationLocation;
	@JsonProperty("estimated")
	private ConditionsEstimated conditionsEstimated;
	@JsonProperty("station_id")
	private String stationId;
	@JsonProperty("observation_time")
	private String observationTime;
	@JsonProperty("observation_time_rfc822")
	private String observationTimeRfc822;
	@JsonProperty("observation_epoch")
	private String observationEpoch;
	@JsonProperty("local_time_rfc822")
	private String localTimeRfc822;
	@JsonProperty("local_epoch")
	private String localEpoch;
	@JsonProperty("local_tz_short")
	private String localTzShort;
	@JsonProperty("local_tz_long")
	private String localTzLong;
	@JsonProperty("local_tz_offset")
	private String localTzOffset;
	@JsonProperty("weather")
	private String weather;
	@JsonProperty("temperature_string")
	private String temperatureString;
	@JsonProperty("temp_f")
	private Double tempF;
	@JsonProperty("temp_c")
	private Double tempC;
	@JsonProperty("relative_humidity")
	private String relativeHumidity;
	@JsonProperty("wind_string")
	private String windString;
	@JsonProperty("wind_dir")
	private String windDir;
	@JsonProperty("wind_degrees")
	private Integer windDegrees;
	@JsonProperty("wind_mph")
	private Double windMph;
	@JsonProperty("wind_gust_mph")
	private String windGustMph;
	@JsonProperty("wind_kph")
	private Double windKph;
	@JsonProperty("wind_gust_kph")
	private String windGustKph;
	@JsonProperty("pressure_mb")
	private String pressureMb;
	@JsonProperty("pressure_in")
	private String pressureIn;
	@JsonProperty("pressure_trend")
	private String pressureTrend;
	@JsonProperty("dewpoint_string")
	private String dewpointString;
	@JsonProperty("dewpoint_f")
	private Integer dewpointF;
	@JsonProperty("dewpoint_c")
	private Integer dewpointC;
	@JsonProperty("heat_index_string")
	private String heatIndexString;
	@JsonProperty("heat_index_f")
	private String heatIndexF;
	@JsonProperty("heat_index_c")
	private String heatIndexC;
	@JsonProperty("windchill_string")
	private String windchillString;
	@JsonProperty("windchill_f")
	private String windchillF;
	@JsonProperty("windchill_c")
	private String windchillC;
	@JsonProperty("feelslike_string")
	private String feelslikeString;
	@JsonProperty("feelslike_f")
	private String feelslikeF;
	@JsonProperty("feelslike_c")
	private String feelslikeC;
	@JsonProperty("visibility_mi")
	private String visibilityMi;
	@JsonProperty("visibility_km")
	private String visibilityKm;
	@JsonProperty("solarradiation")
	private String solarradiation;
	@JsonProperty("UV")
	private String UV;
	@JsonProperty("precip_1hr_string")
	private String precip1hrString;
	@JsonProperty("precip_1hr_in")
	private String precip1hrIn;
	@JsonProperty("precip_1hr_metric")
	private String precip1hrMetric;
	@JsonProperty("precip_today_string")
	private String precipTodayString;
	@JsonProperty("precip_today_in")
	private String precipTodayIn;
	@JsonProperty("precip_today_metric")
	private String precipTodayMetric;
	@JsonProperty("icon")
	private String icon;
	@JsonProperty("icon_url")
	private String iconUrl;
	@JsonProperty("forecast_url")
	private String forecastUrl;
	@JsonProperty("history_url")
	private String historyUrl;
	@JsonProperty("ob_url")
	private String obUrl;
	public ConditionsImage getConditionsImage() {
		return conditionsImage;
	}
	public void setConditionsImage(ConditionsImage conditionsImage) {
		this.conditionsImage = conditionsImage;
	}
	public ConditionsDisplayLocation getConditionsDisplayLocation() {
		return conditionsDisplayLocation;
	}
	public void setConditionsDisplayLocation(ConditionsDisplayLocation conditionsDisplayLocation) {
		this.conditionsDisplayLocation = conditionsDisplayLocation;
	}
	public ConditionsObservationLocation getConditionsObservationLocation() {
		return conditionsObservationLocation;
	}
	public void setConditionsObservationLocation(ConditionsObservationLocation conditionsObservationLocation) {
		this.conditionsObservationLocation = conditionsObservationLocation;
	}
	public ConditionsEstimated getConditionsEstimated() {
		return conditionsEstimated;
	}
	public void setConditionsEstimated(ConditionsEstimated conditionsEstimated) {
		this.conditionsEstimated = conditionsEstimated;
	}
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getObservationTime() {
		return observationTime;
	}
	public void setObservationTime(String observationTime) {
		this.observationTime = observationTime;
	}
	public String getObservationTimeRfc822() {
		return observationTimeRfc822;
	}
	public void setObservationTimeRfc822(String observationTimeRfc822) {
		this.observationTimeRfc822 = observationTimeRfc822;
	}
	public String getObservationEpoch() {
		return observationEpoch;
	}
	public void setObservationEpoch(String observationEpoch) {
		this.observationEpoch = observationEpoch;
	}
	public String getLocalTimeRfc822() {
		return localTimeRfc822;
	}
	public void setLocalTimeRfc822(String localTimeRfc822) {
		this.localTimeRfc822 = localTimeRfc822;
	}
	public String getLocalEpoch() {
		return localEpoch;
	}
	public void setLocalEpoch(String localEpoch) {
		this.localEpoch = localEpoch;
	}
	public String getLocalTzShort() {
		return localTzShort;
	}
	public void setLocalTzShort(String localTzShort) {
		this.localTzShort = localTzShort;
	}
	public String getLocalTzLong() {
		return localTzLong;
	}
	public void setLocalTzLong(String localTzLong) {
		this.localTzLong = localTzLong;
	}
	public String getLocalTzOffset() {
		return localTzOffset;
	}
	public void setLocalTzOffset(String localTzOffset) {
		this.localTzOffset = localTzOffset;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getTemperatureString() {
		return temperatureString;
	}
	public void setTemperatureString(String temperatureString) {
		this.temperatureString = temperatureString;
	}
	public Double getTempF() {
		return tempF;
	}
	public void setTempF(Double tempF) {
		this.tempF = tempF;
	}
	public Double getTempC() {
		return tempC;
	}
	public void setTempC(Double tempC) {
		this.tempC = tempC;
	}
	public String getRelativeHumidity() {
		return relativeHumidity;
	}
	public void setRelativeHumidity(String relativeHumidity) {
		this.relativeHumidity = relativeHumidity;
	}
	public String getWindString() {
		return windString;
	}
	public void setWindString(String windString) {
		this.windString = windString;
	}
	public String getWindDir() {
		return windDir;
	}
	public void setWindDir(String windDir) {
		this.windDir = windDir;
	}
	public Integer getWindDegrees() {
		return windDegrees;
	}
	public void setWindDegrees(Integer windDegrees) {
		this.windDegrees = windDegrees;
	}
	public Double getWindMph() {
		return windMph;
	}
	public void setWindMph(Double windMph) {
		this.windMph = windMph;
	}
	public String getWindGustMph() {
		return windGustMph;
	}
	public void setWindGustMph(String windGustMph) {
		this.windGustMph = windGustMph;
	}
	public Double getWindKph() {
		return windKph;
	}
	public void setWindKph(Double windKph) {
		this.windKph = windKph;
	}
	public String getWindGustKph() {
		return windGustKph;
	}
	public void setWindGustKph(String windGustKph) {
		this.windGustKph = windGustKph;
	}
	public String getPressureMb() {
		return pressureMb;
	}
	public void setPressureMb(String pressureMb) {
		this.pressureMb = pressureMb;
	}
	public String getPressureIn() {
		return pressureIn;
	}
	public void setPressureIn(String pressureIn) {
		this.pressureIn = pressureIn;
	}
	public String getPressureTrend() {
		return pressureTrend;
	}
	public void setPressureTrend(String pressureTrend) {
		this.pressureTrend = pressureTrend;
	}
	public String getDewpointString() {
		return dewpointString;
	}
	public void setDewpointString(String dewpointString) {
		this.dewpointString = dewpointString;
	}
	public Integer getDewpointF() {
		return dewpointF;
	}
	public void setDewpointF(Integer dewpointF) {
		this.dewpointF = dewpointF;
	}
	public Integer getDewpointC() {
		return dewpointC;
	}
	public void setDewpointC(Integer dewpointC) {
		this.dewpointC = dewpointC;
	}
	public String getHeatIndexString() {
		return heatIndexString;
	}
	public void setHeatIndexString(String heatIndexString) {
		this.heatIndexString = heatIndexString;
	}
	public String getHeatIndexF() {
		return heatIndexF;
	}
	public void setHeatIndexF(String heatIndexF) {
		this.heatIndexF = heatIndexF;
	}
	public String getHeatIndexC() {
		return heatIndexC;
	}
	public void setHeatIndexC(String heatIndexC) {
		this.heatIndexC = heatIndexC;
	}
	public String getWindchillString() {
		return windchillString;
	}
	public void setWindchillString(String windchillString) {
		this.windchillString = windchillString;
	}
	public String getWindchillF() {
		return windchillF;
	}
	public void setWindchillF(String windchillF) {
		this.windchillF = windchillF;
	}
	public String getWindchillC() {
		return windchillC;
	}
	public void setWindchillC(String windchillC) {
		this.windchillC = windchillC;
	}
	public String getFeelslikeString() {
		return feelslikeString;
	}
	public void setFeelslikeString(String feelslikeString) {
		this.feelslikeString = feelslikeString;
	}
	public String getFeelslikeF() {
		return feelslikeF;
	}
	public void setFeelslikeF(String feelslikeF) {
		this.feelslikeF = feelslikeF;
	}
	public String getFeelslikeC() {
		return feelslikeC;
	}
	public void setFeelslikeC(String feelslikeC) {
		this.feelslikeC = feelslikeC;
	}
	public String getVisibilityMi() {
		return visibilityMi;
	}
	public void setVisibilityMi(String visibilityMi) {
		this.visibilityMi = visibilityMi;
	}
	public String getVisibilityKm() {
		return visibilityKm;
	}
	public void setVisibilityKm(String visibilityKm) {
		this.visibilityKm = visibilityKm;
	}
	public String getSolarradiation() {
		return solarradiation;
	}
	public void setSolarradiation(String solarradiation) {
		this.solarradiation = solarradiation;
	}
	public String getUV() {
		return UV;
	}
	public void setUV(String uV) {
		UV = uV;
	}
	public String getPrecip1hrString() {
		return precip1hrString;
	}
	public void setPrecip1hrString(String precip1hrString) {
		this.precip1hrString = precip1hrString;
	}
	public String getPrecip1hrIn() {
		return precip1hrIn;
	}
	public void setPrecip1hrIn(String precip1hrIn) {
		this.precip1hrIn = precip1hrIn;
	}
	public String getPrecip1hrMetric() {
		return precip1hrMetric;
	}
	public void setPrecip1hrMetric(String precip1hrMetric) {
		this.precip1hrMetric = precip1hrMetric;
	}
	public String getPrecipTodayString() {
		return precipTodayString;
	}
	public void setPrecipTodayString(String precipTodayString) {
		this.precipTodayString = precipTodayString;
	}
	public String getPrecipTodayIn() {
		return precipTodayIn;
	}
	public void setPrecipTodayIn(String precipTodayIn) {
		this.precipTodayIn = precipTodayIn;
	}
	public String getPrecipTodayMetric() {
		return precipTodayMetric;
	}
	public void setPrecipTodayMetric(String precipTodayMetric) {
		this.precipTodayMetric = precipTodayMetric;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getForecastUrl() {
		return forecastUrl;
	}
	public void setForecastUrl(String forecastUrl) {
		this.forecastUrl = forecastUrl;
	}
	public String getHistoryUrl() {
		return historyUrl;
	}
	public void setHistoryUrl(String historyUrl) {
		this.historyUrl = historyUrl;
	}
	public String getObUrl() {
		return obUrl;
	}
	public void setObUrl(String obUrl) {
		this.obUrl = obUrl;
	}
	@Override
	public String toString() {
		return "ConditionsCurrentObservation [conditionsImage=" + conditionsImage + ", conditionsDisplayLocation="
				+ conditionsDisplayLocation + ", conditionsObservationLocation=" + conditionsObservationLocation
				+ ", conditionsEstimated=" + conditionsEstimated + ", stationId=" + stationId + ", observationTime="
				+ observationTime + ", observationTimeRfc822=" + observationTimeRfc822 + ", observationEpoch="
				+ observationEpoch + ", localTimeRfc822=" + localTimeRfc822 + ", localEpoch=" + localEpoch
				+ ", localTzShort=" + localTzShort + ", localTzLong=" + localTzLong + ", localTzOffset=" + localTzOffset
				+ ", weather=" + weather + ", temperatureString=" + temperatureString + ", tempF=" + tempF + ", tempC="
				+ tempC + ", relativeHumidity=" + relativeHumidity + ", windString=" + windString + ", windDir="
				+ windDir + ", windDegrees=" + windDegrees + ", windMph=" + windMph + ", windGustMph=" + windGustMph
				+ ", windKph=" + windKph + ", windGustKph=" + windGustKph + ", pressureMb=" + pressureMb
				+ ", pressureIn=" + pressureIn + ", pressureTrend=" + pressureTrend + ", dewpointString="
				+ dewpointString + ", dewpointF=" + dewpointF + ", dewpointC=" + dewpointC + ", heatIndexString="
				+ heatIndexString + ", heatIndexF=" + heatIndexF + ", heatIndexC=" + heatIndexC + ", windchillString="
				+ windchillString + ", windchillF=" + windchillF + ", windchillC=" + windchillC + ", feelslikeString="
				+ feelslikeString + ", feelslikeF=" + feelslikeF + ", feelslikeC=" + feelslikeC + ", visibilityMi="
				+ visibilityMi + ", visibilityKm=" + visibilityKm + ", solarradiation=" + solarradiation + ", UV=" + UV
				+ ", precip1hrString=" + precip1hrString + ", precip1hrIn=" + precip1hrIn + ", precip1hrMetric="
				+ precip1hrMetric + ", precipTodayString=" + precipTodayString + ", precipTodayIn=" + precipTodayIn
				+ ", precipTodayMetric=" + precipTodayMetric + ", icon=" + icon + ", iconUrl=" + iconUrl
				+ ", forecastUrl=" + forecastUrl + ", historyUrl=" + historyUrl + ", obUrl=" + obUrl + "]";
	}
	
	
}




