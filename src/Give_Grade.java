// WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result
// if he is pass or fail on basis of percentage (pass>=35) and also give them grade >= 80 A+ ,>= 60 A ,>= 50 B ,>= 35 C

import java.util.Scanner;

public class Give_Grade
{
    public static void main(String[] args)
    {
        // Create object for scanner class
        Scanner scanner = new Scanner(System.in);
        // Enter student name, roll no, 3 subjects marks
        System.out.println("Enter Student Roll No : ");
        int roll_no =scanner.nextInt();
        System.out.println("Enter Student Name : ");
        char stu_name =scanner.next().charAt(0);
        System.out.println("Enter Marks For Science: ");
        int sci =scanner.nextInt();
        System.out.println("Enter Marks For Maths : ");
        int maths =scanner.nextInt();
        System.out.println("Enter Marks For English : ");
        int eng =scanner.nextInt();

        double total,per;

        total = sci + maths +eng; // find total marks for subjects
        per = total/3.0; // find percentqge of total marks


       if(per>=80)
       {
           System.out.println("Student Roll No : "+roll_no);
           System.out.println("Student Name : " +stu_name);
           System.out.println("Marks Of Science :" +sci);
           System.out.println("Marks of Maths :"+maths);
           System.out.println("Marks Of English:"+eng);
           System.out.println("Total of Subject : "+ total);
           System.out.println("Percentage :"+per);
           System.out.println("Grade is : A+ ");
           System.out.println("Result : Pass");
       }
       else if(per>=60)
       {
           System.out.println("Student Roll No : "+roll_no);
           System.out.println("Student Name : " +stu_name);
           System.out.println("Marks Of Science :" +sci);
           System.out.println("Marks of Maths :"+maths);
           System.out.println("Marks Of English:"+eng);
           System.out.println("Total of Subject : "+ total);
           System.out.println("Percentage :"+per);
           System.out.println("Grade is : A");
           System.out.println("Result : Pass");
       }
       else if(per>=50)
       {
           System.out.println("Student Roll No : "+roll_no);
           System.out.println("Student Name : " +stu_name);
           System.out.println("Marks Of Science :" +sci);
           System.out.println("Marks of Maths :"+maths);
           System.out.println("Marks Of English:"+eng);
           System.out.println("Total of Subject : "+ total);
           System.out.println("Percentage :"+per);
           System.out.println("Grade is : B");
           System.out.println("Result : Pass");
       }
       else if(per>=35)
       {
           System.out.println("Student Roll No : "+roll_no);
           System.out.println("Student Name : " +stu_name);
           System.out.println("Marks Of Science :" +sci);
           System.out.println("Marks of Maths :"+maths);
           System.out.println("Marks Of English:"+eng);
           System.out.println("Total of Subject : "+ total);
           System.out.println("Percentage :"+per);
           System.out.println("Grade is : c");
           System.out.println("Result : Pass");
       }
       else
       {
           System.out.println("Student Roll No : "+roll_no);
           System.out.println("Student Name : " +stu_name);
           System.out.println("Marks Of Science :" +sci);
           System.out.println("Marks of Maths :"+maths);
           System.out.println("Marks Of English:"+eng);
           System.out.println("Total of Subject : "+ total);
           System.out.println("Percentage :"+per);
           System.out.println("Result : Fail");
       }
    }
}
