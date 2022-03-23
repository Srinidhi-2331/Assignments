package com.training.assignment;

public class Circle extends Shape implements Area 
{
	protected double radius;
	
	
	public Circle(String name,double radius )
	{
		this.radius=radius;
		this.name=name;
		
	}


	@Override
	public void getArea() {
		area=Math.PI*radius*radius;
		System.out.println("Area is :"+area);
	}

	
}
