// 1. Input any two number and find out its odd or even use turnery operator (? :)
import java.util.Scanner;

public class Find_Odd_Even_Number {
  public static void main(String[] args)
  {
      // Crete Object for Scanner Class
      Scanner scanner = new Scanner(System.in);
      // Enter Two Number
      System.out.println("Enter the Value of Number 1 : ");
      int no1 = scanner.nextInt();
      // condition ? True Statment : False Statment
      String msg = (no1 % 2 == 0 ) ? "The value of Numbber 1 (" + no1 +") is EVEN "  : "The Value of Number 1 (" +no1+ ") is ODD";
      System.out.println(msg);
  }
}