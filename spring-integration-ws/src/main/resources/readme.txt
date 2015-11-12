http://www.javacodegeeks.com/2015/09/spring-integration-fundamentals.html
http://www.javacodegeeks.com/2015/09/spring-integration-for-eai.html
http://www.javacodegeeks.com/2015/09/spring-integration-and-web-services.html#poller
http://www.javacodegeeks.com/2015/09/spring-integration-full-example.html
http://www.javaworld.com/article/2142107/spring-framework/open-source-java-projects-spring-integration.html?page=4
http://krishnasblog.com/category/java/spring/spring-integration/
http://krishnasblog.com/2012/11/14/managing-raw-soap-message-within-spring-integration/
https://trek2tech.wordpress.com/spring/spring-integration/
https://angelozerr.wordpress.com/2011/08/24/jaxwscxf_step2/
http://javarticles.com/2015/05/spring-integration-header-enricher-example.html
http://es.slideshare.net/iweinfuld/spring-integration-and-eip-introduction?next_slideshow=1
http://www.javacodegeeks.com/2012/07/spring-integration-session-2-more-hello.html
https://www.credera.com/blog/technology-insights/java/spring-integration-tip-iceberg/
http://blog.rufer.be/blog/knowledge-base/AMQP-Integration-with-spring-integration.html
http://stackoverflow.com/questions/32883858/can-we-use-axis2-with-spring-integration
http://www.javacodegeeks.com/2012/07/spring-integration-session-2-more-hello.html
https://github.com/spring-projects/spring-integration-samples/blob/master/basic/ws-outbound-gateway/src/main/resources/META-INF/spring/integration/temperatureConversion.xml
http://www.adictosaltrabajo.com/tutoriales/ejemplo-spring-integration/
http://www.adictosaltrabajo.com/tutoriales/introduccion-spring-integration/

https://github.com/autentia/esb-tutorial/blob/master/prueba-spring-integration/src/main/java/com/autentia/spring/integration/prueba_spring_integration/Entidad767Converter.java

http://www.journaldev.com/2552/spring-restful-web-service-example-with-json-jackson-and-client-program
http://www.leveluplunch.com/java/tutorials/021-consume-get-request-spring-rest-webservice-jquery/



//http://howtodoinjava.com/2015/02/20/spring-restful-client-resttemplate-example/
	/*
	 * final String uri = "http://localhost:8080/springmvc1/employee/getEmployeeById/{id}";
	     
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	  
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("id", "2");
	     
	    //ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
	    String result = restTemplate.getForObject(uri,  String.class, params);
	     
	    System.out.println(result);

	 */
	 
	 
	 /*
	 
	 final String uri = "http://localhost:8080/springmvc1/employee/getEmployeeById/0";
	     
	    RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
	     
	    System.out.println(result.getBody());
	    */

	    https://github.com/autentia/esb-tutorial/blob/master/prueba-spring-integration/src/main/resources/META-INF/spring/integration/spring-integration.xml
	    https://www.credera.com/blog/technology-insights/java/spring-integration-tip-iceberg/
	    http://howtodoinjava.com/2015/02/20/spring-restful-client-resttemplate-example/