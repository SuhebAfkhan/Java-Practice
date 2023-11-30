//Activity 3: Variable Naming and Type Casting
//Open your IntelliJ Idea IDE and follow the instructions below
//Create a project on IntelliJ. This time feel free to give it an appropriate name. hint We're going to be finding the area and perimeter of a circle.
//Write a java application that prompts a user to enter the diameter of a circle and calculates the area and perimeter of the circle.
//Perform a widening casting operation (integer to double) when storing the result of the operations.
//Print out the results of the two operations in the console.

package myinput;
import java.util.Scanner;
public class Circle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Diameter of the circle : ");
		int diameter=sc.nextInt();
		double r=(diameter/2);
		System.out.println("Area of the circle : "+3.14*(r*r));
//		System.out.println("perimeter of the circle is "+);
		
	}

}
