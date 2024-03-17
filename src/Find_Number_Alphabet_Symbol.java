// 14. Enter any value and the find out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;

public class Find_Number_Alphabet_Symbol
{
        public static void main(String[] args)
        {
            //creat object for scanner class
            Scanner scanner = new Scanner(System.in);
            // press any key from keyboard
            System.out.println("Press Any Key To Any Value");
            char value = scanner.next().charAt(0);
            //enter first contion
            if(value>='0' && value<='9') // 1ST Conditio
            {
                 System.out.println("Enter value "+value + " is A Number " );
            }
            else if((value>='a' && value<='z') ||  (value>='A' && value<='Z')) //2nd condition
            {
                System.out.println("Enter value "+value +" is An Alphabet");
            }
            else
            {
                System.out.println("Enter value "+value +" is A Symbol"); // if both condition is false
            }
        }
}
