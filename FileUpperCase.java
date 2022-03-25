package com.training.assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class FileUpperCase 
{
	public static void main(String args[])throws IOException
	{
	try
	{
		//to write in file
	Writer w = new FileWriter("C:\\Users\\Chandu\\Desktop\\fileupper.txt");  
    String content ; 
    Scanner sc=new Scanner(System.in);
	System.out.println("Give data to write in file");
	content=sc.nextLine();
    content=content.toUpperCase();//into uppercase
    w.write(content);  
    w.close();  
    System.out.println("Done"); 
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	//to read the file
	try {  
        Reader reader = new FileReader("C:\\Users\\Chandu\\Desktop\\fileupper.txt");  
        int data = reader.read();  
        while (data != -1) {  
            System.out.print((char) data);  
            data = reader.read();  
        }  
        reader.close();  
    } catch (IOException e) {  
    	e.printStackTrace();
    }  
	
	}

}
