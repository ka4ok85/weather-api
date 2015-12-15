package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.example.restmodels.CityAutoComplete;
import com.example.restmodels.CityItem;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class CommandCityAutoCompleteFailure extends HystrixCommand<CityAutoComplete> {

	private final String url;

    public CommandCityAutoCompleteFailure(String url) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.url = url;
    }

    @Override
    protected CityAutoComplete run() {
        //throw new RuntimeException("this command always fails");
    	
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

        ResponseEntity<CityAutoComplete> responseEntity = restTemplate.getForEntity(url, CityAutoComplete.class);
        CityAutoComplete body = responseEntity.getBody();
        
        return body;
            	
    }

    @Override
    protected CityAutoComplete getFallback() {
    	CityAutoComplete cityAutoComplete = new CityAutoComplete();
    	
    	CityItem cityItem = new CityItem();
    	cityItem.setName("Error, Error");
    	cityItem.setC("Error");
    	
    	List<CityItem> results = new ArrayList<CityItem>();
    	results.add(cityItem);

    	cityAutoComplete.setRESULTS(results);
    	
    	return cityAutoComplete;
    }
}