//Object Oriented Programming - Fundamentals
//
//
//Part 1: Exploring the School System Project
//Create a new Java project using IntelliJ Idea.
//Create a Student class. This class must have the following attributes:
//   public class Student {
//       String firstName;
//       String lastName;
//       int registration;
//       int grade;
//       int year;
//   }
//Now, make the Student class implement the following methods:
//   public void printFullName(){
//      //TODO implement
//   }
//
//   public void isApproved(){
//       //TODO implement: should return true if grade >= 60
//   }
//
//   public int changeYearIfApproved(){
//       //TODO implement: the student should advance to the next year if he/she grade is >= 60
//       // Make year = year + 1, and print "Congragulations" if the student has been approved
//       return 0;
//   }
//Add constructors to your Student class:
//
//Make the class with at least three different constructors.

//Add on to the main method and call enroll with a list of students. Verify that your implementation works.


package objectOrientedProgramming;
import java.util.*;

class Student{
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    Student(){}
    Student(String fname,String lname,int reg)
    {
    	this.firstName=fname;
    	this.lastName=lname;
    	this.registration=reg;
    }
    Student(int grade,int year)
    {
    	this.grade=grade;
    	this.year=year;
    }
    
    public void printFullName()
    {
    	System.out.println("Full name : "+firstName+" "+lastName);
   }

   public boolean isApproved(){
       //TODO implement: should return true if grade >= 60
	  return grade>=60;
   }

   public void changeYearIfApproved(){
     
	   if(grade>=60)
	   {
		   year+=1;
		   System.out.println("Congragulations");
		   
	   }
      
   }
}

public class TestOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1=new Student("Virat","Kohli",18);
		
		  Student[] studentsArray = {
		            new Student("John", "Abraham",19),
		            new Student("Alice", "Mark",20),
		            new Student("Bob","Alice",21 )
		            // Add more students if needed
		        };
		  studentsArray[0].grade=95;
		  studentsArray[1].grade=85;
		  studentsArray[2].grade=47;
//		  studentsArray[3].grade=55;
		  studentsArray[0].year=2016;
		  studentsArray[1].year=2016;
		  studentsArray[0].year=2016;
		  studentsArray[0].year=2016;
		  
		  studentsArray[0].printFullName();
		  studentsArray[0].isApproved();
		  studentsArray[0].changeYearIfApproved();

	

}
}
