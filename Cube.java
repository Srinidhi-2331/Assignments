package com.training.assignment;

public class Cube extends Square implements Volume
{

	public Cube( String name,double side) {
		super(name,side);
	this .side=side;
	}

	@Override
	public void getVolume() {
		
		volume=side*side*side;
		System.out.println("Volume is :"+volume);
		
	}

}
