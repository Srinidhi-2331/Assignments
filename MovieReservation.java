package com.training.assignment;

import java.util.Scanner;

public class MovieReservation {

	public static void main(String args[]) {
	 System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
     System.out.println("---------1.list of movies and their prices--------- \n-------"
     		+ "2.acces and book tickets through theaters---");

     System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
     
   
     Scanner sc=new Scanner(System.in);
     int ch;
     ch=sc.nextInt();
     switch(ch)
     {
     	case 1:
     	{
     		 System.out.println("The Movies available are");
 	        System.out.println("1.RRR-------- Rs.40 \n "
 	        		+ "2.BatMan - Rs.50 \n"
 	        		+ " 3.Wonder Woman  ---- Rs.60 \n"
 	        		+ " 4.James----- Rs.70 ");
 	        break;
     	}
     	case 2:
     	{
     		System.out.println("**the theaters available are** \n "
     				+ "1.karunya th \n 2.anna th");
     		int th;
     		th=sc.nextInt();
     		if(th==1)
     		{
     			 System.out.println("**karunya theater**");
		         System.out.println("**select a movie**");
		         System.out.println("movie available are \n 1.RRR\n 2.BatMan ");
		         int m=sc.nextInt();
		         if(m==1)
		         {
		        	 int amount =40;
		             System.out.println("RRR @ kaurnya theater");
		                System.out.println("Enter the number of tickets to be booked");
		                int tic=sc.nextInt();
		                System.out.println("to continue to book for this movie prees 1");
		                int confirm=sc.nextInt();
		                if(confirm==1)
		                {
		                	  System.out.println("******************");
			                    System.out.println("theater ------------------- karunya theater");
			                    System.out.println("movie --------------------- RRR");
			                    System.out.println("cost ---------------------- Rs."+amount*tic);
			                    System.out.println("******************");
		                }
	
		         }
		         else if(m==2)
		         {
		        	 int amount =50;
		             System.out.println("BatMan @ kaurnya theater");
		                System.out.println("Enter the number of tickets to be booked");
		                int tic=sc.nextInt();
		                System.out.println("to continue to book for this movie prees 1");
		                int confirm=sc.nextInt();
		                if(confirm==1)
		                {
		                	  System.out.println("******************");
			                    System.out.println("theater ------------------- karunya theater");
			                    System.out.println("movie --------------------- RRR");
			                    System.out.println("cost ---------------------- Rs."+amount*tic);
			                    System.out.println("******************");
		                }
		         }
		         else {
		        	 System.out.println("Invalid Movie Name");
		         }
		        	 
     		}
     		else if (th==2)
     		{

    			 System.out.println("**Anna theater**");
		         System.out.println("**select a movie**");
		         System.out.println("movie available are \n 1.Wonder Woman\n 2.James ");
		         int m=sc.nextInt();
		         if(m==1)
		         {
		        	 int amount =60;
		             System.out.println("Wonder Woman @ Anna theater");
		                System.out.println("Enter the number of tickets to be booked");
		                int tic=sc.nextInt();
		                System.out.println("to continue to book for this movie prees 1");
		                int confirm=sc.nextInt();
		                if(confirm==1)
		                {
		                	  System.out.println("******************");
			                    System.out.println("theater ------------------- Anna theater");
			                    System.out.println("movie --------------------- Wonder Woman");
			                    System.out.println("cost ---------------------- Rs."+amount*tic);
			                    System.out.println("******************");
		                }
	
		         }
		         else if(m==2)
		         {
		        	 int amount =70;
		             System.out.println("James @ Anna theater");
		                System.out.println("Enter the number of tickets to be booked");
		                int tic=sc.nextInt();
		                System.out.println("to continue to book for this movie prees 1");
		                int confirm=sc.nextInt();
		                if(confirm==1)
		                {
		                	  System.out.println("******************");
			                    System.out.println("theater ------------------- Anna theater");
			                    System.out.println("movie --------------------- James");
			                    System.out.println("cost ---------------------- Rs."+amount*tic);
			                    System.out.println("******************");
		                } 
		         }
     		}
     	}
     
     
     }
	}
}
