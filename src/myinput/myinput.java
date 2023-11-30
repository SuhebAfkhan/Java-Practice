//Activity 1 (Introduction): My First Input
//Open your IntelliJ Idea IDE and follow the instructions below
//Create a project called 'MyFirstInput'
//Create a class called MyFirstInput
//Add a main method to your app.
//Make your code looks like the file shown below


package myinput;
import java.util.Scanner;

public class myinput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=sc.next();
		System.out.println("My name is "+name);
	}

}
