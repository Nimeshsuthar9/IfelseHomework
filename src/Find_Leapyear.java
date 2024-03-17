// 2. WAP to input any year like 1989 and find out if it is leap year

import java.util.Scanner;

public class Find_Leapyear
{
    public static void main(String[] args)
    {
        // Crete Object for Scanner Class
        Scanner scanner = new Scanner(System.in);
        // Enter Year
        System.out.println("Please Enter Year : -  ");
        int Year = scanner.nextInt();
        // Condition for Leqap year
        if(Year%4==0)
        {
            System.out.println(Year +" Is Leap Year " ); // if condition is True
        }
        else
        {
            System.out.println( Year + " Is Not Leap Year"); // If condition is False
        }
    }

}
