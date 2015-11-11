package org.neos.spring.ws.service;

import org.springframework.integration.annotation.Gateway;

public interface GatewayAxis {
	  @Gateway
	  String sendAndReceive(String out);
}
