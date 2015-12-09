package com.example.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
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
import com.example.restmodels.CityAutoComplete;
import com.example.restmodels.CityItem;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

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
    public String checkPersonInfo(@Valid City city, BindingResult bindingResult, Model model) {
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
                		//new MediaType("application", "json", MappingJackson2HttpMessageConverter.DEFAULT_CHARSET),
                		//new MediaType("text", "javascript", MappingJackson2HttpMessageConverter.DEFAULT_CHARSET)
                );
            }
        }
        
        
/*
ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(urlGETList, Object[].class);
Object[]=responseEntity.getBody();
MediaType contentType = responseEntity.getHeaders().getContentType();
HttpStatus statusCode = responseEntity.getStatusCode();         
 */
        //CityAutoComplete cityResponse = restTemplate.getForObject("http://autocomplete.wunderground.com/aq?query=San%20F", CityAutoComplete.class);
        //log.info(cityResponse.toString());
        String url ="http://autocomplete.wunderground.com/aq?query=atlan"; 
        //CityItem[] forNow = restTemplate.getForObject("http://autocomplete.wunderground.com/aq?query=San%20F", CityItem[].class);
        //ResponseEntity<CityItem[]> responseEntity = restTemplate.getForEntity(url, CityItem[].class);
        //ResponseEntity<ArrayList<CityItem>> responseEntity = restTemplate.getForEntity(url, ArrayList<CityItem>.class);

    	
        
/*
 //Map<List> w/o parent
        Map<String,List<CityItem>> myDomainListMap = restTemplate.getForObject(url, Map.class);
        log.info(myDomainListMap.toString());
        log.info(myDomainListMap.getClass().toString());
        
        List<CityItem> myDomainList = myDomainListMap.get("RESULTS");
        log.info(myDomainList.toString());
        log.info(myDomainList.getClass().toString());
        
        
        //log.info((String)myDomainList.size());
        log.info(myDomainList.get(0).toString());
        
        //List<CityItem> myDomainList = restTemplate.getForObject(url, List.class);
*/
        
        //restTemplate.exchange(url, method, requestEntity, responseType)
        

        /*
        ResponseEntity<CityAutoComplete> response = restTemplate.exchange(
        		url,HttpMethod.GET, null, CityAutoComplete.class);
        log.info(response.toString());
        log.info(response.getClass().toString());    
        CityAutoComplete x = response.getBody();
        log.info(x.toString());
        
        */
        
        //ObjectNode objectNode = restTemplate.getForObject(url, ObjectNode.class);
        //JsonNode highDepth = objectNode.get("RESULTS");
        //log.info(highDepth.toString()); 
        
        //ResponseEntity<List<MyBean>> response = template.exchange(
        		//"http://example.com",HttpMethod.GET, null, myBean);
         
        //log.info((String)myDomainList.size());
        //log.info(myDomainList.get(0).toString());
        
        /*
        for (CityItem city1 : myDomainList) {
        	System.out.println(city1.toString());
        	log.info(city1.toString());
        }
        */
        /*
        for (CityItem city1: myDomainList) {
        	 System.out.print(city1.toString());
        	 log.info(city1.toString());
        }
        */
    
       //CityItem[] cc = responseEntity.getBody();

 // CityAutoComplete usage

      CityAutoComplete cityAutoComplete = restTemplate.getForObject(url, CityAutoComplete.class);
      log.info(cityAutoComplete.toString());
      
 /*
       ArrayList<CityItem> items = (ArrayList<CityItem>) cityAutoComplete.getRESULTS();

      CityItem[] a = null;
      items.toArray(a);
      
      log.info(a.toString());
      */      
        //ResponseEntity<ArrayList<CityItem> responseEntity = restTemplate.getForEntity(url, ArrayList.class);
        model.addAttribute("city", city);

        return "citylist";
    }

}