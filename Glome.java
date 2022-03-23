package com.training.assignment;

public class Glome extends Sphere implements Volume
{

	public Glome(String name,double radius) {
		super(name, radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getVolume() {
		volume=2*(Math.PI*Math.PI)*radius*radius*radius;
		System.out.println("Volume is :"+volume);
	}
}
