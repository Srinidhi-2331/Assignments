package com.training.assignment;

public class Box {
	
	private int length;
	private int breadth;
	private int height;

	public Box() { // TODO Auto-generated constructor stub
		  }
	
	public Box(Object obj)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		
	}
	
	
	
	 public Box(int length,int breadth,int height)
	 {
		 this.length =length;
		 this.breadth=breadth;
		 this.height=height;
	}
	 
	public int volume()
	{
		int vol;
		vol=length*breadth*height;
		return vol;
	}
	
	
}
