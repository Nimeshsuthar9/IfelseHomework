// 6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
// HRA = basic salary 10% // DA = Basic salary 8%
// TA = Basic salary 9% // PF= Basic salary 20% // Gross salary = basic salary + HRA + TA + DA -PF

import java.util.Scanner;

public class Find_Gross_salary
{
   public static void main(String[] args)
   {
       //Create Object for scanner class
       Scanner scanner = new Scanner(System.in);
       // Enter Employ id, Name , Basic Salary
       System.out.println("Enter Employ Id : ");
       int Emp_Id = scanner.nextInt();
       System.out.println("Enter Employ Name : ");
       char Emp_Name = scanner.next().charAt(0);
       System.out.println("Enter Employ Basic Salary : ");
       double Bs = scanner.nextDouble();
       double Hra,Ta,Da,Pf,Gs;

       if(Emp_Id!=0 && Emp_Name!=' '&& Bs!=0)
       {

            System.out.println("Employ Details is : ");
            System.out.println("Employ Id : "+Emp_Id);
            System.out.println("Employ Name : "+Emp_Name);
            System.out.println("Employ Basic Salary : "+Bs);
            Hra = Bs*0.10;
            System.out.println("Employ HRA : "+Hra);
            Ta = Bs*0.09;
            System.out.println("Employ TA : "+Ta);
            Da= Bs*0.08;
            System.out.println("Employ DA : "+Da);
            Pf=Bs*0.20;
            System.out.println("Employ PF : "+Pf);
            Gs = Bs + Hra + Ta + Da - Pf ;
            System.out.println("Employ Gross Salary : "+Gs);
       }
       else
       {
           System.out.println("Please Enter Details");
       }
   }
}
