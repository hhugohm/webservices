package org.neos.spring.ws.service;

import java.util.Map;

import org.springframework.integration.annotation.Gateway;

public interface GatewayRest {
	  @Gateway
	 public String sendAndReceive(Map<String, Integer> request);
}
