import java.util.*;

public class Question1
{
// Java program to take a number as input and print whether positive of negative
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to know whether it is positive or negative : ");
    double a = sc.nextDouble();
    if(a>0)
    {
        System.out.println("The number " + a + " is positive");
    }
    else if(a<0)
    {
        System.out.println("The number " + a + " is negative");
    }
    else
    {
        System.out.println("The number " + a + " is zero");
    }
    }

}
