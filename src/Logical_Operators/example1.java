//Part 1: Class Grader
//Open IntelliJ Idea App and create a project called ClassGrader
//Write a program where a user enters the grade of a student and the program returns a grade based on the following conditions
//Failed if they scored 3 or less
//Insufficient if they scored > 3 but less than 5. (5 included)
//Good if they scored > 5 but less than 8. (8 included)
//Excellent Grade if they scored 10.


package Logical_Operators;

import java.util.Scanner;
public class example1 {

	public static void main(String[] args) {
		

		System.out.print("Enter grade between 1-10 : ");
		 Scanner sc = new Scanner(System.in);
		 int grade=sc.nextInt();
		 if(grade<=3)
			 System.out.print("Failed");
		 else if(grade>3 && grade <=5)
			 System.out.print("Insufficient");
		 else if(grade>5 && grade <=8)
			 System.out.print("Good");
		 else if(grade==10)
			 System.out.print("Excellent");
	}

}

