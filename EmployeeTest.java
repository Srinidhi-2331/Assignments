package com.training.assignment;

import java.util.ArrayList;

public class EmployeeTest {
	public static void main(String args[])
	{
		Employee emp=new Employee(101,20000,12);
		@SuppressWarnings("Unchecked")
		ArrayList<Double>resList=( ArrayList<Double>)emp.calculate();
		System.out.println("PF: "+resList.get(0));
		System.out.println("Home Allowance :  "+resList.get(1));
		System.out.println("Car Allowance :  "+resList.get(2));
		System.out.println("Total Salary :  "+resList.get(3));
	
		
	}

}
