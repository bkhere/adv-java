package com.registration.service;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.customer.dto.CustomerDTO;

public interface RegistrationService {
	public String prosessResult(CustomerDTO dto) throws NamingException , SQLException;
}
