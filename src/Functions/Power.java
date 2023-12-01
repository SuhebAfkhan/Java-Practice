//*************Finding the power of a number***********************
package Functions;
import java.util.Scanner;
import java.lang.Math;

import java.util.Scanner;

public class Power {
	public static void power(int a,int b)
	{
		System.out.println("Power of "+a+" and "+b+" is "+Math.pow(a, b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b values : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		power(a,b);
	}

}
