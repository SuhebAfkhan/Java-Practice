//Part 1:
//Download the project and import it into IntelliJ Idea
//Implement the following functions:
//    private static void printNameLength( String name )
//    {
//      //TODO implement this code
//    }
//
//    private static void printNameCharacters( String name )
//    {
//      //TODO implement this code
//    }
//Test your code with 5 different names and verify that the behaviour is correct.
//Modify your code to also capture from the user the last name.
//Implement an additional function that prints the FUll name of the person.

package Functions;

import java.util.Scanner;

public class FirstLastName {

	private static void printNameLength( String name )
  {
    System.out.println(name.length());
  }

  private static void printNameCharacters( String name )
  {
    for(int i=0;i<name.length();i++)
    {
    	System.out.print(name.charAt(i)+"  ");
    }
  }
  private static void firstLast( String name1,String name2 )
  {
	  System.out.println("\nname: "+name1+" "+name2);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		System.out.println("Enter your Last name : "); 
		String lname=sc.next();
		printNameLength(name);
		printNameCharacters(name);
		firstLast(name,lname);
		
	}

}
