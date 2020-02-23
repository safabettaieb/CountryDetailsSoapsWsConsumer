package com.safa.country.soap.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.safa.country.soap.ws.countrydetails.CountryDetailsRequest;
import com.safa.country.soap.ws.countrydetails.GetCountryResponse;
import com.safa.country.soap.ws.services.CountryService;

@RestController
public class TestSoap {
	@Autowired
	private CountryService service;
	
	
	@PostMapping("ws/country/details")
	public GetCountryResponse testConsume(@RequestBody CountryDetailsRequest request) {
		return service.getCountryDetails(request);
		
	}

}
