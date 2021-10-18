package com.registration.dao;

import com.registration.bo.CustomerBO;

public interface RegistrationDao {
	public int registerToDb(CustomerBO customer) throws Exception;
}
