// 13. WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find
// addition,subtraction, multiplication and division according to their symbol (using if else)

import java.util.Scanner;

public class Find_mathasformula_using_sysmbol
{
    public static void main(String[] args)
    {
        // Create object ror scanner class
        Scanner scanner = new Scanner(System.in);
         // enter two number
        System.out.println("Enter the value of Number 1 : ");
        int No1= scanner.nextInt();
        System.out.println("Enter the value of Number 2 : ");
        int No2= scanner.nextInt();
        // Enter Any Symbol
        System.out.println("Enter Symbol from +, - ,* , /  :- ");
        char symbol= scanner.next().charAt(0);
        double total;
        //Enter Conditions
        if(symbol == '+')   // 1st condoition
        {
            System.out.println("You Select Addition");
            total = No1 + No2; // enter equation
            System.out.println("Addition of " +No1 + "And "+ No2 +" is : "+total);
        }
        else if( symbol == '-') //2nd condition
        {
            System.out.println("You Select Substraction");
            total = No1 - No2; // enter equation
            System.out.println("Substraction of " +No1 + "And "+ No2 +" is : "+total);
        }
        else if( symbol == '*') //3rd condition
        {
            System.out.println("You Select Multiplication");
            total = No1 * No2; // enter equation
            System.out.println("Multiplication of " +No1 + "And "+ No2 +" is : "+total);
        }
        else if( symbol == '/') // 4th condition
        {
            System.out.println("You Select Divsion");
            total = No1 / No2; // enter equation
            System.out.println("Divsion of " +No1 + "And "+ No2 +" is : "+total);
        }
        else
        {
            System.out.println("Please Enter Valid Symbol"); // if condition is false
        }
    }
}
