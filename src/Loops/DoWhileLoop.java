//*****************Do while loop**********************
//Create a new Java class with a main method(so you can run your code) called Fibonacci
//
//The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."
//
//The beginning of the sequence is thus:
//
//0 1 1 2 3 5 8 13 21 34 55 89 ...
//
//Add the following import to be able to capture user input n
//  import java.util.Scanner;
//Implement a Do While loop that calculates Fibonacci(n)
//
//n	Fibonacci(n)
//0	0
//1	1
//2	1
//3	2
//4	3
//5	5
//6	8
//7	13
//...	...
package Loops;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		 System.out.print("Enter the number : ");
		 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int i=0,j=1;
	        int fib;
	        num-=2;
	        do
	        {
	        	fib=i+j;
	        	i=j;
	        	j=fib;
	        	num--;
	        }while(num>0);
	        System.out.print("Fibonacci sum is "+fib);
	}

}
