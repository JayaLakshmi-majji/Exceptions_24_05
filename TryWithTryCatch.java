package Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

class TryWithTryCatch{
	   private static int k;

	public static void main(String args[]){
	      try{
	    	  
	        try{
	        	Scanner sc=new Scanner(System.in);
	            try{
	            	int arr[]= {1,2,3,4};
	            	System.out.println("enter the index  value");
	            	int l=sc.nextInt();
	            	System.out.println(arr[l]);

	            	
	            	  
	            }catch(NumberFormatException e){
		        	
	 	           System.out.print("NumberFormat Exception");
	 	           System.out.println(" handled in try-block2");
	 	        }
	            try{
	            	int i=7,j;

	            	  
		        	System.out.println("enter j value");
		        	j=sc.nextInt();
		        	k = i/j;
		        	k=k+1;
	            	sc.close();
	            }catch(NumberFormatException e){
		        	
	 	           System.out.print("NumberFormat Exception");
	 	           System.out.println(" handled in try-block2");
	 	        }
	        }
	        
	        
	        catch(ArithmeticException e){
            	
            	System.out.print("Arithmetic Exception");
            	System.out.println(" handled in try-block3");
            }
	    }
	      
	    catch(InputMismatchException e3){
	    	
	    	System.out.print("InputMismatch Exception");
	     	System.out.println(" handled in main try-block");
	    }
	    catch(ArrayIndexOutOfBoundsException e4){
	    	
	    	System.out.print("ArrayIndexOutOfBoundsException");
	     	System.out.println(" handled in main try-block");
	    }
	      catch(Exception e5){
		    	
		    	System.out.print("Exception");
		     	System.out.println(" handled in main try-block");
		     }
	      System.out.print("Thank you");
	 
	  }
	}
