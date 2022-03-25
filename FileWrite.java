package com.training.assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.IOException;


public abstract class FileWrite extends OutputStream{
	
	public static void main(String args[]) throws IOException 
	{
		File file = new File("C:\\Users\\Chandu\\Desktop\\file.txt");
		boolean val=false; 
		
		try {
			val = file.createNewFile();	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		if(val)
		{
			System.out.println("File created Successfully");
		}
		else
		{
			System.out.println("File not created ");
		}
	
		
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Give data to write in file");
		str=sc.nextLine();
		byte []arr=str.getBytes();
		
		
		
		OutputStream out = new FileOutputStream("C:\\Users\\Chandu\\Desktop\\file.txt");	
		out.write(arr);
		System.out.println("Successfully wrote into the file");
		
		out.close();

	};

}
