
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:\n 1.Addition\n2.Substraction\n3.Multiplication \n4.Division\n5.maximum\n6.minimum");
        int choice=sc.nextInt();
        System.out.println("Enter a value : ");
        int a = sc.nextInt();
        System.out.println("Enter b value : ");
        int b=sc.nextInt();
        if(choice==1)
         System.out.println("Ans is : "+add(a, b));
        else if(choice==2)
                  System.out.println("Ans is : "+sub(a, b));

        else if(choice==3)
                  System.out.println("Ans is : "+mul(a, b));

        else if(choice==4)
                  System.out.println("Ans is : "+div(a, b));
        else if(choice==5)
                  System.out.println("Ans is : "+maximum(a, b));
        else if(choice==6)
                  System.out.println("Ans is : "+minimum(a, b));

        


      
}
//1
    public static int add(int a,int b)
    {
        return a+b;
    }
//2
    public static int sub(int a,int b)
    {
        return a-b;
    }
//3
    public static int mul(int a,int b)
    {
        return a*b;
    }
//4
    public static int div(int a,int b)
    {
        return a/b;
    }
   
 //5  
    public static int maximum(int a,int b)
    {
        return Math.max(a, b);
    }
//6
    public static int minimum(int a,int b)
    {
        return Math.min(a, b);
    }


@Test
public void Test1()
{
    assertEquals("Done!!!",100,add(30, 70));
}

@Test
public void Test2()
{
    assertEquals("Done!!!",10,sub(50, 40));
}

@Test
public void Test3()
{
    assertEquals("Done!!!",100,mul(10, 10));
}

@Test
public void Test4()
{
    assertEquals("Done!!!",2,div(100, 50));
}

@Test
public void Test5()
{
    assertEquals("Done!!!",50,maximum(10, 50));
}

@Test
public void Test6()
{
    assertEquals("Done!!!",10,minimum(10, 50));
}


}
