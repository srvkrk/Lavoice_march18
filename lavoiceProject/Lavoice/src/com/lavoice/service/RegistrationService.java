package com.lavoice.service;

import com.lavoice.bean.RegistrationRequest;

public interface RegistrationService {
	String insertUser(RegistrationRequest user);
	String verifyUser(String mailLink);
}
