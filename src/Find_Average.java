// 7. WAP input any five number and then find average of five numbers

import java.util.Scanner;

public class Find_Average
{
    public static void main(String[] args)
    {
        // Crete Object for Scanner Class
        Scanner scanner = new Scanner(System.in);
        // Enter Five Numbers
        System.out.println("Enter Value of Number 1 ");
        double no1 = scanner.nextDouble();
        System.out.println("Enter Value of Number 2 ");
        double no2 = scanner.nextDouble();
        System.out.println("Enter Value of Number 3 ");
        double no3 = scanner.nextDouble();
        System.out.println("Enter Value of Number 4 ");
        double no4 = scanner.nextDouble();
        System.out.println("Enter Value of Number 5 ");
        double no5 = scanner.nextDouble();
        double average;
        //  Coditions for Average
        if(no1>=0 && no2>=0 && no3>=0 && no4>=0 && no5>=0)
        {
            // Equestion for Everage
            average = (no1 + no2 + no3+ no4+ no5)/5;
            System.out.println("Average of Five No is : " +average); // if condition is  True
        }
        else
        {
            System.out.println(" Please Enter Value is more then o "); // if conidtion is False
        }
    }
}
