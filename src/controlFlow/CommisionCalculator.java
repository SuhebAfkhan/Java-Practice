//Part 1: Commission Calculator
//Using IntelliJ, write a Java app that takes numerical input from a user
//The app should calculate commission based on this chart used by the retail store.
//Sales Range	Commission
//above 10000$	30%
//5001 - 9999$	20%
//1001 - 4999$	10%
//below 1000$	N/A
//Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%.
package controlFlow;
import java.util.Scanner;

public class CommisionCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		if(money<1000)
		{
			System.out.println("Commision is N/A");
		}
		if(money>1000&&money<5000)
		{
			System.out.println("Commision is "+(money/100)*10);
		}
		if(money>5000&&money<10000)
		{
			System.out.println("Commision is "+(money/100)*20);
		}
		if(money>10000)
		{
			System.out.println("Commision is "+(money/100)*30);
		}
		
		
	}

}
