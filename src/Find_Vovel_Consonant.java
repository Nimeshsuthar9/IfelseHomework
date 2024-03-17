//16. Write a Java program that takes the user to provide a single character from the alphabet.
// Print Vowel or Consonant, depending on the user input.
import java.util.Scanner;

public class Find_Vovel_Consonant
{
    public static void main(String[] args)
    {
        // Create object fpr scanner class
        Scanner scanner = new Scanner(System.in);
        // Enter Any Character
        System.out.println("Please enter any Charecter : ");
        char alphabet =scanner.next().charAt(0);

        //enter condition
        if(alphabet == 'a' || alphabet== 'e' || alphabet=='i' || alphabet=='o' ||alphabet=='u'
                || alphabet == 'A' || alphabet== 'E' || alphabet=='I' || alphabet=='O' ||alphabet=='U')
        {
            System.out.println("Entered Charecter "+ alphabet +" is Vovel");// if condition is true
        }
        else
        {
            System.out.println("Entered Charecter "+ alphabet +" is consonant"); // if condition is false
        }
    }
}
