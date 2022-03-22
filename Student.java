package com.training.assignment;

public class Student
{
	int studId;
	String studName;
	int grade;
	String studAddress;
	boolean res=true;
	

		
	public Student(int studId, String studName, int grade)
	{
		this.studId=studId;
		this.studName=studName;
		this.grade=grade;
	}
	
	public boolean isEquals(Student stud2)
	{
		if(this.studName == stud2.studName && this.studId==stud2.studId && this.grade==stud2.grade)
			res=true;
		else
			res=false;
		
		return res;
	}
	
	@Override public int hashCode()
    {
		return this.studName.length() % 4;
    }
	

}
