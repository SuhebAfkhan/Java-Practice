//************WHILE loop****************
//Part 1: While loops
//Open your IDE and create a new Java class named Table
//Copy the following code into your Java class Table and verify it works
//Implement a while loop that prints out the multiplication table of the given input number.
package Loops;
import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = sc.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        int i=1;
	      while(i<=10)
	      {
	    	  System.out.println(num+" * "+i+" = "+num*i);
	    	  i++;
	      }
	}
}
