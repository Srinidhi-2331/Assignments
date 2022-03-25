package com.training.assignment;

public class ThreadDemoTest {
	public static void main(String args[])
	{
		 ThreadDemo t1=new ThreadDemo("thread-1");
			t1.go();
			ThreadDemo t2=new ThreadDemo("thread-2");
			t2.go();
			ThreadDemo t3=new ThreadDemo("thread-3");
			t3.go();
	}

}
