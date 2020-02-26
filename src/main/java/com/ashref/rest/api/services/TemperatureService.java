package com.ashref.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashref.rest.api.payload.requests.TemperatureRequest;
import com.ashref.rest.api.payload.responses.TemperatureResponse;

@Service
public class TemperatureService {
	@Autowired
	private RestTemplate template;
	private final String URL = "http://localhost:8081/api/temperature";
	
	public TemperatureResponse consumeMin(TemperatureRequest request) {
		return template.postForObject(URL+"/min", request, TemperatureResponse.class);
	}
	
}
