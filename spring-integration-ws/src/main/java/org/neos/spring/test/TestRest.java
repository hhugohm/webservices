package org.neos.spring.test;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class TestRest {

	public static void main(String[] args) {

		final String uri = "http://localhost:8080/springmvc1/employee/getEmployeeById/{id}";
		RestTemplate restTemplate = new RestTemplate();

		Map<String, String> params = new HashMap<String, String>();
		params.put("id", "2");
		String result = restTemplate.getForObject(uri, String.class, params);

		System.out.println(result);

	}

	// http://howtodoinjava.com/2015/02/20/spring-restful-client-resttemplate-example/

}
