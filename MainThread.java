package com.training.assignment;

public class MainThread {

	public static void main(String[] args) {
		MyThread main=new MyThread();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main  thread is running for "+i+"time");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
