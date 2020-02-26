package com.ashref.rest.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashref.rest.api.payload.requests.TemperatureRequest;
import com.ashref.rest.api.payload.responses.TemperatureResponse;
import com.ashref.rest.api.services.TemperatureService;

@RestController
@RequestMapping("/test")
public class TemperatureController {
	@Autowired
	private TemperatureService service;
	
	@PostMapping("/min")
	public TemperatureResponse testConsumeMin(@RequestBody TemperatureRequest request) {
		return service.consumeMin(request);
	}
	
	@PostMapping("/max")
	public TemperatureResponse testConsumeMax(@RequestBody TemperatureRequest request) {
		return service.consumeMax(request);
	}
	
	@PostMapping("/avg")
	public TemperatureResponse testConsumeAvg(@RequestBody TemperatureRequest request) {
		return service.consumeAvg(request);
	}
}
