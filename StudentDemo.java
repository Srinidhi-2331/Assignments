package com.training.assignment;

public class StudentDemo
{
	public static void main(String args[])
	{
		Student stud1=new Student(101,"John",87);
		Student stud2=new Student(103,"Walt",90);
		
		System.out.println("Student 1: Student Id: "+stud1.studId+"Student Name: "
		+stud1.studName+" Grade :"+stud1.grade);
		System.out.println("Student 2: Student Id: "+stud2.studId+"Student Name: "
				+stud2.studName+" Grade :"+stud2.grade);
		
	
		if(stud1.hashCode()==stud2.hashCode())
		System.out.println(stud1.isEquals(stud2));
	}

}



//  Student stud3=new Student(103,"Walt",90); 
//  Student stud4=new Student(104,"Jimmy",98);
//  Student stud5=new Student(105,"David",88);
 