package org.neos.spring.ws.service;

import org.neos.spring.ws.stub.country.Country;

public interface ICountryRepository {
	
	public Country findCountry(String name);

}
