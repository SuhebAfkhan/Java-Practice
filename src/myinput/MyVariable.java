//Activity 2: My First Variable Naming
//Open your IntelliJ Idea IDE and follow the instructions below
//Create a project called MyFirstVariableNaming
//Create a class titled "UserProfile"
//Write code so that the app stores a users name, age, gender, job preference, nationality and blood type
//Think about what variable names you want to assign to the properties above and variable name conventions to be followed.
//Use the age to calculate the year when a user was born.
//Print the values back to a user's console.

package myinput;
import java.util.Scanner;

public class MyVariable {

	public static void main(String[] args) {
		String name;
		int age;
		String gender;
		String jobPreference;
		String nationality;
		String bloodType;
		
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		age=sc.nextInt();
		gender=sc.next();
		jobPreference=sc.next();
		nationality=sc.next();
		bloodType=sc.next();
		System.out.println("Details :");
		System.out.println("Nmae :"+name);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
		System.out.println("nationality :"+nationality);
		System.out.println("bloodType :"+bloodType);

	}

}
