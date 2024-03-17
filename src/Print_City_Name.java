// 10. Input any alphabet from a to f and print their city name accordingly (use if else) any other
// alphabet should be invalid entry

import java.util.Scanner;

public class Print_City_Name
{
    public static void main(String[] args)
    {
        // Create object for scanner class
        Scanner scanner = new Scanner(System.in);

        // Enter Any Alfabet
        System.out.println("Enter Any Alfabet");
        char alfabet = scanner.next().charAt(0);

    if (alfabet <= 'a' && alfabet <= 'A' && alfabet >= 'f' && alfabet >= 'F')
    {
          if (alfabet == 'a' || alfabet == 'A') // Enter 1st Condition
          {
                System.out.println("City Name From A is : Acton ");
          }
          else if (alfabet == 'b' || alfabet == 'B') // Enter 2nd Condition
          {
                 System.out.println("City Name From B is : Bristol");
          }
          else if (alfabet == 'c' || alfabet == 'C') // Enter 3rd Condition
          {
                System.out.println("City Name From C is : Cornwall");
          }
          else if (alfabet == 'd' || alfabet == 'D') // Enter 4th Condition
          {
                System.out.println("City Name From D is : Danstable");
          }
          else if (alfabet == 'e' || alfabet == 'E') // Enter 5th Condition
          {
              System.out.println("City Name From E is : Edgware");
          }
          else if (alfabet == 'f' || alfabet == 'F') // Enter 6th Condition
          {
            System.out.println("City Name From F is : Finchaly ");
          }
          else
          {
            System.out.println("Invalid Entery"); //If condition is False
          }
    }
    else
    {
      System.out.println("Invalid Entery"); // if Condition is False
    }
  }
}