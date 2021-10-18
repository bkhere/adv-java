package com.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.registration.bo.CustomerBO;

public class RegistrationDaoImp implements RegistrationDao {
	private  static final String   insertData="INSERT INTO customerdetails  VALUES(?,?,?,?,?)";

//	DataSource ds;
	
	public RegistrationDaoImp() {
	//	InitialContext ic= new InitialContext();
	//	ds = (DataSource) ic.lookup("first");
		
		
	}
	public int registerToDb(CustomerBO customer) throws SQLException
	{
	//	Connection conn = getPooledJdbcConnection();
	//	PreparedStatement query= conn.prepareStatement(insertData);
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"SYSTEM",
				"root");
		PreparedStatement query= con.prepareStatement(insertData);
		query.setString(1, customer.getId());
		query.setString(2, customer.getName());
		query.setString(3, customer.getCity());
		query.setString(4, customer.getGender());
		query.setString(5, customer.getSubscriptionType());
		int result = query.executeUpdate();
		return result;
	}
//	public Connection getPooledJdbcConnection() throws SQLException
//	{
		
//		Connection con = ds.getConnection();
//		return conn; 
//	}
}
