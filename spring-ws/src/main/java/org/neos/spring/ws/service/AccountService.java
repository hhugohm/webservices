package org.neos.spring.ws.service;

import org.neos.spring.ws.stub.account.Account;

public interface AccountService {

	public Account getAccountDetails(String accountNumber);
}
