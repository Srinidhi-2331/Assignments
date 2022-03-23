package com.training.assignment;

public class Sphere extends Circle implements Volume
{

	public Sphere( String name,double radius) {
		super(name, radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getVolume() {
		volume=(4.0/3.0)*Math.PI*(radius*radius*radius);
		System.out.println("Volume is :"+volume);
		
	}

}
