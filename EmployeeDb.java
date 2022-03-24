package com.training.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeDb {
	public static void main(String args[]) throws SQLException
	{
		try
		{
			Class.forName("org.postgresql.Driver");
	
		String url="jdbc:postgresql://localhost:5432/testdb";
		String userName="postgres";
		String password="2331";
		Connection con =DriverManager.getConnection(url,userName,password);
		
		
		if(con!=null)
			System.out.println("Succesfully connected::");
		else
			System.out.println("connection refused::");
			
}
	
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
}
