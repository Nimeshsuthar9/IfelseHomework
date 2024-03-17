//15. WAP input any number, the print Day name of the week accordingly by using if else
import java.util.Scanner;

public class Print_Day_From_Number
{
    public static void main(String[] args)
    {
        //Create object for scanner class
        Scanner scanner =new Scanner(System.in);
        // Enter number From 1 to 7;
        System.out.println("Please Enter number from 1 To 7 : ");
        int No = scanner.nextInt();
        if(No==1) //1st condition
        {
              System.out.println("1St Day of Week is MONDAY ");
        }
        else if(No==2) //2nd condition
        {
            System.out.println("2Nd Day of Week is TUSEDAY ");
        }
        else if(No==3) //3rd condition
        {
            System.out.println("3Rd Day of Week is WEDNUSDAY ");
        }
        else if(No==4) //4th condition
        {
            System.out.println("4th Day of Week is THURSDAY ");
        }
        else if(No==5) //5th condition
        {
            System.out.println("5Th Day of Week is FRIDAY ");
        }
        else if(No==6) //6th condition
        {
            System.out.println("6th Day of Week is SATURDAY ");
        }
        else if(No==7) //7th condition
        {
            System.out.println("7Th Day of Week is SUNDAY ");
        }
        else
        {
            System.out.println("Plese Enter Valid Number"); //If condition is false
        }
    }
}
