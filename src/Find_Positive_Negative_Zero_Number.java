//8. WAP to input any number and fid our if it is positive , negative or zero
import java.util.Scanner;

public class Find_Positive_Negative_Zero_Number
{
    public  static  void  main(String[] args)
    {
        // Crete Object for Scanner Class
        Scanner scanner = new Scanner(System.in);
        // Enter the Number 1
        System.out.println("Please Enter Number 1  : -  ");
        int no1 = scanner.nextInt();
        //Enter 1st condition
        if (no1>0)
        {
             //if 1st condition is true
             System.out.println("Enter the Value of Number 1 is Positive");
        }
        // Enter 2nd condition
        else if (no1<0)
        {
              // if 2nd condition is true
              System.out.println("Enter the value of Number 1 is negative");
        }
        else
        {
              // if both 1st and 2nd condition is False
              System.out.println("Enter the value of Number is Zero");
        }
    }
}