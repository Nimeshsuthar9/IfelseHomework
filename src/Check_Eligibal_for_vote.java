// 11. Write Java program to allow the user to input his/her age. Then the program will show if the
// person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.

import java.util.Scanner;

public class Check_Eligibal_for_vote
{
    public static void main(String[] args)
    {
        // create object for scanner class
        Scanner scanner = new Scanner(System.in);
        // enter the age of the person
        System.out.println("Enter The Age : ");
        int age = scanner.nextInt();

        if(age>=18) // Enter condition
        {
              System.out.println("Persona is Eligibal for VOTE"); // if condition is True
        }
        else
        {
              System.out.printf("Person is not Eligibal for VOTE"); // If condition is False
        }
    }
}
