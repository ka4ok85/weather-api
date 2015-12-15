package com.example.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.WeatherApiApplication;
import com.example.mvcmodels.City;
import com.example.mvcmodels.CityCountry;
import com.example.restmodels.CityAutoComplete;
import com.example.restmodels.CityItem;
import com.example.restmodels.Conditions;
import com.example.service.CommandCityAutoCompleteFailure;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class WelcomeController {
	@Value("${weather.key}")
    private String apiKey;
	
	private static final Logger log = LoggerFactory.getLogger(WeatherApiApplication.class);

    @RequestMapping(value="/welcome", method=RequestMethod.GET)
    public String welcomeForm(Model model) {
        model.addAttribute("city", new City());

        return "welcome";
    }

    @RequestMapping(value="/welcome", method=RequestMethod.POST)
    public String checkCity(@Valid City city, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "welcome";
        }    	

        String url ="http://autocomplete.wunderground.com/aq?query=" + city.getCity(); 
        log.info(url);

        CityAutoComplete body = new CommandCityAutoCompleteFailure(url).execute();
        log.info(body.toString());

        ArrayList<CityItem> cityList = (ArrayList<CityItem>) body.getRESULTS();

        model.addAttribute("city", city);
        model.addAttribute("cityList", cityList);

        return "citylist";
    }

    
    @RequestMapping(value="/details", method=RequestMethod.GET)
    public String checkPersonInfo(@Valid CityCountry cityCountry, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "welcome";
        }
        
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> converters = restTemplate.getMessageConverters();
        
        List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
        supportedMediaTypes.add(new MediaType("application", "json", MappingJackson2HttpMessageConverter.DEFAULT_CHARSET));
        supportedMediaTypes.add(new MediaType("text", "html", MappingJackson2HttpMessageConverter.DEFAULT_CHARSET));
        
        for (HttpMessageConverter<?> converter : converters) {
            if (converter instanceof MappingJackson2HttpMessageConverter) {
                MappingJackson2HttpMessageConverter jsonConverter = (MappingJackson2HttpMessageConverter) converter;
                jsonConverter.setObjectMapper(new ObjectMapper());
                jsonConverter.setSupportedMediaTypes(
                		supportedMediaTypes
                );
            }
        }
        
        String url ="http://api.wunderground.com/api/" + apiKey + "/conditions/q/" + cityCountry.getCountry() + "/" + cityCountry.getCity() + ".json";
        log.info(url);
        
        ResponseEntity<Conditions> responseEntity = restTemplate.getForEntity(url, Conditions.class);
        Conditions body = responseEntity.getBody();
        log.info(body.toString());
        
        model.addAttribute("city", cityCountry);        
        model.addAttribute("conditions", body);
        
        return "weather";
    }
}