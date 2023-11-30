//Part 2: Movie Discounts
//A movie cinema does price discounting depending on a customer's age.
//The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
//Age range	Ticket Price
//Normal ticket	7 Euros
//Below 5	60% Discount
//Over 60	55% Discount
//Write the app so that the conditions above are met and the correct ticket price is returned.

package controlFlow;
import java.util.Scanner;

public class MovieDiscounts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr your Age :");
		int age=sc.nextInt();
		double ticket;
		if(age<5)
		{
			ticket=7*0.60;
		}
		else if(age>60)
		{
			ticket=7*0.55;
		}
		else
		{
			ticket=7;
		}
		System.out.println("Your ticket price is "+ticket+" Euros");
	}

}
