package com.training.assignment;

import java.util.Scanner;

public class GeometricTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
		System.out.println("Enter the shape");
		String name=sc.next();
		
		switch(name) {
		case "square":
		{
			System.out.println("Enter the side");
			double side=sc.nextDouble();
			Square sq=new Square(name,side);
			 sq.getArea();
			 break;
		}
		case "circle":
		{
			System.out.println("Enter the radius:");
			double radius=sc.nextDouble();
			Circle cr=new Circle(name,radius);
			 cr.getArea();
			 break;
		}
		case "cube":
		{
			System.out.println("Enter the side");
			double side=sc.nextDouble();
			Cube cu=new Cube(name,side);
			 cu.getVolume();
			 break;
		}
		case "sphere":
		{
			System.out.println("Enter the radius:");
			double radius=sc.nextDouble();
			Sphere sp=new Sphere(name,radius);
			 sp.getVolume();
			 break;
		}
		case "cylinder":
		{
			System.out.println("Enter the radius:");
			double radius=sc.nextDouble();
			System.out.println("Enter the height :");
			double height=sc.nextDouble();
			Cylinder cy=new Cylinder(name,radius,height);
			 cy.getVolume();
			 break;
		}
		case "glome":
		{
			System.out.println("Enter the radius:");
			double radius=sc.nextDouble();
			Glome gl=new Glome(name,radius);
			 gl.getVolume();
			 break;
		}
		
		}
		}
		
	}

}
