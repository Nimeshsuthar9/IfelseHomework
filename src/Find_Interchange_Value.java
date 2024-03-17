// 5. WAP to input any two numbers and then print their interchanged value

import java.util.Scanner;

public class Find_Interchange_Value
{
    public static void main(String[] args)
    {
        // Crete Object for Scanner Class
        Scanner scanner = new Scanner(System.in);
        // User Have to enter no1
        System.out.println("Please Enter Number 1  : -  ");
        int no1 = scanner.nextInt();
        // User Have to enter no2
        System.out.println("Plese Enter Number 2 : - ");
        int no2 = scanner.nextInt();
        int temp;

        if(no1!=no2) // Enter Condition for Interchange the value of two numbers
        {
            System.out.println("Value of No1 is Before Inergange is : " +no1);
            System.out.println("Value of No2 is Before Inergange is : " +no2);
            // equation for interchange the value of two numbers
            temp = no1;
            no1 = no2;
            no2 = temp;
            // if condition is True
            System.out.println("Value of No1 is After Inergange is : " +no1);
            System.out.println("Value of No2 is After Inergange is : " +no2);
        }
        else
        {
            // if condition is False
            System.out.println("Value of No1 and No2 is Equal so we can not interchange the value ");
        }
    }
}