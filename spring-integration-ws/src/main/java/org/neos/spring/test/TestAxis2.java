package org.neos.spring.test;


import org.neos.spring.ws.service.GatewayAxis;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAxis2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/integration/spring-axis2-message.xml");
		//DestinationResolver<MessageChannel> channelResolver = new BeanFactoryChannelResolver(context);
		
		GatewayAxis gateway = context.getBean(GatewayAxis.class);

		String requestXml = 
				"<getMessageService xmlns=\"http://service.ws.axis2.neos.org\">" + 
						"<name>HUGO</name>"
				+ "</getMessageService>";

		// Create the Message object
		//Message<String> message = MessageBuilder.withPayload(requestXml).build();

		// Send the Message to the handler's input channel
		//MessageChannel channel = channelResolver.resolveDestination("messageChannelIN");
		//channel.send(message);
		String reply = gateway.sendAndReceive(requestXml);
		System.out.println(reply);
			
	}

}
