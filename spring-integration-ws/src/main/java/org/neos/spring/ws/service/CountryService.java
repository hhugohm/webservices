package org.neos.spring.ws.service;


import org.neos.spring.ws.client.GetCountryRequest;
import org.neos.spring.ws.client.GetCountryResponse;
import org.springframework.integration.annotation.Gateway;

public interface CountryService {

	@Gateway
	GetCountryResponse getCountry(GetCountryRequest request);
}