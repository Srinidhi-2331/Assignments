package com.training.assignment;

public class Square extends Shape implements Area
{
	protected double side;
	
	public Square(String name,double side)
	{
		this.side=side;
		this.name=name;
		
	}

	@Override
	public void getArea() {
		 area=side*side;
		 System.out.println("Area is :"+area);
		
	}

}
