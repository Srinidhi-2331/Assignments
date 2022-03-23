package com.training.assignment;

public class Cylinder extends Circle implements Volume{
	
	
	private double height;
	
	public Cylinder(String name,double height,double radius ) {
		super(name, radius);
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getVolume() {
		volume=Math.PI*radius*radius*height;
		System.out.println("Volume is :"+volume);
		
	}


}
