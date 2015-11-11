package org.neos.spring.test;

import org.neos.spring.ws.client.Country;
import org.neos.spring.ws.client.GetCountryRequest;
import org.neos.spring.ws.client.GetCountryResponse;
import org.neos.spring.ws.service.CountryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringWS {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/integration/spring-ws.xml");
		
		CountryService service = (CountryService) context.getBean("channelCountry");
		GetCountryRequest  request = new GetCountryRequest();
		request.setName("Spain");
		GetCountryResponse response= service.getCountry(request);
		Country country = response.getCountry();
		
		System.out.println(country.getName() +"-"+country.getCapital()+ "-"+ country.getPopulation()+"-"+ country.getCurrency() );
		context.close();

	}

}
