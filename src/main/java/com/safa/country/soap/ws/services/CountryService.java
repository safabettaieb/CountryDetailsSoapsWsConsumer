package com.safa.country.soap.ws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.safa.country.soap.ws.countrydetails.CountryDetailsRequest;
import com.safa.country.soap.ws.countrydetails.GetCountryResponse;

@Service
public class CountryService {
	@Autowired
	private Jaxb2Marshaller marshaller;
	private WebServiceTemplate template;

	private final String URL = "http://localhost:8081/ws";

	public GetCountryResponse getCountryDetails(CountryDetailsRequest request) {
		template = new WebServiceTemplate(marshaller);
		GetCountryResponse response = (GetCountryResponse) template.marshalSendAndReceive(URL, request);
		return response;
	}

}
