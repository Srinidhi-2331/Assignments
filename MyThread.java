package com.training.assignment;

public class MyThread extends Thread {
	MyThread(){
	super("Child Thread");
	start();
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread is running for "+i+"time");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
