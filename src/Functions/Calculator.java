//Part 2:
//Create a new Java class that will have the following functionality:
//
//Name should be CalculatorBrain
//Implement a function for each aritmetic operation
//Addition
//Subtraction
//Multiplication
//Division
//Add some code to the main method to invoke the aritmetic functions defined and verify it works as expected.

package Functions;
import java.util.Scanner;

public class Calculator {

	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b values : ");

		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition of "+a+" and "+b+" is "+add(a,b));
		System.out.println("Substraction of "+a+" and "+b+" is "+sub(a,b));
		System.out.println("Multiplication of "+a+" and "+b+" is "+mul(a,b));
		System.out.println("Division of "+a+" and "+b+" is "+div(a,b));
	}

}
