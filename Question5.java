import java.util.*;
public class Question5
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int y = sc.nextInt();
        boolean a = (y%4) ==0;
        boolean b = (y%100) !=0;
        boolean c = ((y%100==0) && (y%400==0));
        if(a&& (b||c))
        {
            System.out.println(y+" is a leap year");
        }
        else
        {
            System.out.println(y+" is not a leap year");
        }
    }
}