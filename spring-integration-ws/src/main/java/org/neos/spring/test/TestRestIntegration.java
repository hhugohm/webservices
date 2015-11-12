package org.neos.spring.test;


import java.util.HashMap;
import java.util.Map;

import org.neos.spring.ws.service.GatewayRest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRestIntegration {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/integration/spring-rest.xml");
	
		GatewayRest gateway = context.getBean("inboundGateway",GatewayRest.class);
		Map<String, Integer> requestMap = new HashMap<String, Integer>();
		requestMap.put("id",1);
		String reply = gateway.sendAndReceive(requestMap);
		System.out.println(reply);
		context.close();
			
	}
	
	//http://stackoverflow.com/questions/28747348/spring-integration-4-1-4-exception-unable-to-locate-namespacehandler-for-xml

}
