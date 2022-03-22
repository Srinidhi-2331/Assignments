package com.training.assignment;

import java.util.ArrayList;

public class Employee {
	
	 int  empId;
	 double basicSalary;
	 double pfPercent;
	 double pf;
	double totalSalary;
	double homeAllow;
	double carAllow;
	
	public Employee( int  empId, double basicSalary, double pfPercent)
	{
		this.empId=empId;
		this.basicSalary=basicSalary;
		this.pfPercent=pfPercent;
		
	}
	
	public Employee(Employee emp)
	{
		this.empId=emp.empId;
		this.basicSalary=emp.basicSalary;
		this.pfPercent=emp.pfPercent;
		
	}

	public Object calculate()
	{
		
		pf=(basicSalary*(pfPercent/100));
		
		homeAllow=0.45*basicSalary;
		carAllow=0.15*basicSalary;
		
		totalSalary=pf+homeAllow+carAllow+basicSalary;
		ArrayList<Double>myList=new ArrayList<>();
		myList.add(pf);
		myList.add(homeAllow);
		myList.add(carAllow);
		myList.add(totalSalary);
		return myList;
		
	}
	

}
