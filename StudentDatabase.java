package com.training.assignment;

import java.util.Scanner;

import org.w3c.dom.ranges.RangeException;

public class StudentDatabase {
	
	//private static final Exception RangeException = null;
	public static String name;
	StudentDatabase()
	{
		
	}
	public static void main(String args[]) throws  RangeException
	{
		double marks[]=new double[6];
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the name ");
		name=sc.nextLine();
		System.out.println("Enter the marks in 6 subjects");
		for(int i=0;i<6;i++)
		{
			marks[i]=sc.nextDouble();
		}
		double sum=0;
		try
		{
		  for(int i=0;i<6;i++)
		{
			if(marks[i]>=0 && marks[i]<=50)
			{
				
				sum+=marks[i];
				
			}
			else
				{
					//System.out.println("Marks cant be lesser than 0 or be greater than 50");
					throw new RangeException((short)0,"invalid marks");
					
				}
		}
		}
		catch(RangeException e) {
			System.out.println(e.getMessage());
		}

		double p;
		p=(sum/3);
		System.out.println("Total marks: "+sum);
		System.out.println("Percentage: ");
		System.out.format("%.4f %n",+p);
	}

	
	
}
