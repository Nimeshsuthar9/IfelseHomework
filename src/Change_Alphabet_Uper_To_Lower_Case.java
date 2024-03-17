// 12. Input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;

public class Change_Alphabet_Uper_To_Lower_Case
{
    public static void main(String[] args)
    {
        // create object for scanner class
        Scanner scanner = new Scanner(System.in);
        //Enter Alphabet in Uper Case
        System.out.println("Enter Any Alphabet In Upercase");
        char Ch =scanner.next().charAt(0);
        // Enter Condition
        if (Ch >= 'A' && Ch <= 'Z')
        {
            // Convert the uppercase alphabet to lowercase by adding 32 to its ASCII value
            Ch = (char) (Ch + 32);
            System.out.println("Converted Alphabet in Lowercase is : " + Ch);
        }
        else
        {
            System.out.println("Invalid input, Please enter an uppercase alphabet."); // If condition is False
        }
    }
}
