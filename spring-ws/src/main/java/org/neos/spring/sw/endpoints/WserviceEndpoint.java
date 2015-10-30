package org.neos.spring.sw.endpoints;

import org.neos.spring.ws.service.AccountService;
import org.neos.spring.ws.service.ICountryRepository;
import org.neos.spring.ws.stub.account.Account;
import org.neos.spring.ws.stub.account.AccountDetailsRequest;
import org.neos.spring.ws.stub.account.AccountDetailsResponse;
import org.neos.spring.ws.stub.country.GetCountryRequest;
import org.neos.spring.ws.stub.country.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class WserviceEndpoint {
	private static final String TARGET_NAMESPACE_ACCOUNT = "http://neos.org/spring/ws/stub/account";
	private static final String TARGET_NAMESPACE_CITY = "http://neos.org/spring/ws/stub/country";

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private ICountryRepository countryRepository;


	/**
	 * Gets the account details.
	 *
	 * @param accountNumber
	 *            the account number
	 * @return the account details
	 */
	@PayloadRoot(localPart = "AccountDetailsRequest", namespace = TARGET_NAMESPACE_ACCOUNT)
	@ResponsePayload
	public  AccountDetailsResponse getAccountDetails(@RequestPayload AccountDetailsRequest request) {
		AccountDetailsResponse response = new AccountDetailsResponse();
		Account account = accountService.getAccountDetails(request.getAccountNumber());
		response.setAccountDetails(account);
		return response;
	}

	@PayloadRoot(localPart = "getCountryRequest", namespace = TARGET_NAMESPACE_CITY)
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
		System.out.println("EN EL METODO COUNTRY......");
		GetCountryResponse response = new GetCountryResponse();
		response.setCountry(countryRepository.findCountry(request.getName()));

		return response;
	}

}