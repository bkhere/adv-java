package com.registration.service;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.customer.dto.CustomerDTO;
import com.registration.bo.*;
import com.registration.dao.RegistrationDaoImp;
public class RegistrationServiceImpl implements RegistrationService{
	private CustomerBO customer;
	public RegistrationServiceImpl() {
		customer = new CustomerBO();
	}
	@Override
	public String prosessResult(CustomerDTO dto) throws NamingException, SQLException
	{
			customer.setName(dto.getName().toUpperCase());
			customer.setCity(dto.getCity().toUpperCase());
			customer.setId(dto.getName()+dto.getSubscriptionType());
			customer.setSubscriptionType(dto.getSubscriptionType().toUpperCase());
			customer.setGender(dto.getGender().toUpperCase());
			RegistrationDaoImp dao = new RegistrationDaoImp();
			int count = dao.registerToDb(customer);
			return (count == 0) ? "Registration failed" : dto.getName()+" has successfully got registered";
	}
	
}
