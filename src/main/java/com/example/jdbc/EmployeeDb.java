package com.example.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDb {
	public static void main(String args[]) throws SQLException, IOException
	{
		try
		{
			Class.forName("org.postgresql.Driver");
	
		String url="jdbc:postgresql://localhost:5432/testdb";
		String userName="postgres";
		String password="2331";
		Connection con =DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		//createTable(stmt);
		//insertTable(stmt);
		//deleteAllRow(stmt);
		
		if(con!=null)
			System.out.println("Succesfully connected::");
		else
			System.out.println("connection refused::");
		PreparedStatement p=con.prepareStatement("select * from Employees where emp_desg=? and emp_dept=?");
		updateTable(p);
}
	
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	

	private static void deleteAllRow(Statement stmt) {

		String deleteAll="truncate Employees";
		
		try {
			stmt.execute(deleteAll);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Deleted all rows in a Table ");
		
	}



	private static void updateTable(PreparedStatement p) throws IOException,SQLException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		System.out.println("enter emp_desg:");  
		String desg =br.readLine();  
		System.out.println("enter emp_dept:");  
		String dept =br.readLine();  
		 
		p.setString(1,desg);  
		p.setString(2, dept);
		p.execute();
		ResultSet rs=p.executeQuery();
		while(rs.next())
			{
				System.out.println("Emp_no: "+rs.getString("emp_no")+" Name: "+rs.getString("emp_name")
			+" Salary:"+rs.getString("salary")+" Emp_desg:"+rs.getString("emp_desg")+" Emp_dept:"+rs.getString("emp_dept"));
			}
		
			System.out.println("Search sucessful");
			
		
	}



	private static void createTable(Statement stmt) {
		
		  String query="create table Employees(emp_no numeric(4) primary key, "
		  		+ " emp_name varchar(20) not null,  salary numeric(8,2),emp_desg varchar(10),emp_dept varchar(8))";
					  try {
				  stmt.execute(query);
				  }
					  catch (SQLException e)
					  { // TODO Auto-generated catch
						  e.printStackTrace();
					  }
					  System.out.println("Table created");
		
	}
	private static void insertTable(Statement stmt) {
		 String query1="insert into Employees "+"values(101,'Ramesh',56799,'curator','design')";
		  String query2="insert into Employees "+"values(102,'John',25000,'SE','IT')"; 
		  String query3="insert into Employees "+"values(103,'Peter',19600,'Professor','Training')";
		  String query4="insert into Employees "+"values(104,'David',230900,'Developer','IT')";
		 
		try {
			stmt.executeUpdate(query1);
			  stmt.executeUpdate(query2); 
			  stmt.executeUpdate(query3);
			  stmt.executeUpdate(query4);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inserted into Table ");
	
	}
	
	
}
