package prueba;

import org.neos.spring.ws.client.Country;
import org.neos.spring.ws.client.GetCountryRequest;
import org.neos.spring.ws.client.GetCountryResponse;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class TestCountry {


    private static  WebServiceTemplate webServiceTemplate;
    private final static String WSDL="http://localhost:8080/spring-ws/endpoints/ws-services.wsdl";
    private final static String COUNTRY_SERVICE="http://localhost:8080/spring-ws/endpoints/getCountryRequest";
    
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ws.xml");
		
		GetCountryRequest  request = new GetCountryRequest();
		request.setName("Spain");
		
		webServiceTemplate = (WebServiceTemplate) ctx.getBean("webServiceTemplate");
		
		
		GetCountryResponse response = (GetCountryResponse) webServiceTemplate.marshalSendAndReceive(
				WSDL,
				request,
				new SoapActionCallback(COUNTRY_SERVICE));
		Country country = response.getCountry();
		
		System.out.println(country.getName() +"-"+country.getCapital()+ "-"+ country.getPopulation()+"-"+ country.getCurrency() );
		
		ctx.close();

	}

}
