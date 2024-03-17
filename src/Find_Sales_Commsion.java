// 9. WAP input sales id, seller's name, sales amount, salary basic and then find this sales commission
// sales amount >= 50,000 35% , sales amount >= 30,000 20% , >= 20,000 10%, >= 10,000 5% , < 10,000 2%

import java.util.Scanner;

public class Find_Sales_Commsion
{
    public static void main(String[] args)
    {
        //create object for scanner class
        Scanner scanner = new Scanner(System.in);
        // Enter Sales id,Sellers,name , sales amount, salary basic
        System.out.println("Enter the Sales id : ");
        long sales_id = scanner.nextLong();
        System.out.println("Enter the Seller's Name : ");
        char sallername = scanner.next().charAt(0);
        System.out.println("Enter the Sales Amount : ");
        long sales_amount = scanner.nextLong();
        System.out.println("Enter the Salary Basics : ");
        long salarybasics = scanner.nextLong();
        double  sales_commission;

        if(sales_amount >= 50000)
        {
            sales_commission =  sales_amount * 0.35;
            System.out.println("Sales id : "+sales_id);
            System.out.println("Seller's Name : "+sallername);
            System.out.println("Sales Amount : "+sales_amount);
            System.out.println("Salary Basics : "+salarybasics);
            System.out.println("Sales Commision : " +sales_commission);
        }
        else if(sales_amount >=30000)
        {
            sales_commission = sales_amount * 0.20;
            System.out.println("Sales id : "+sales_id);
            System.out.println("Seller's Name : "+sallername);
            System.out.println("Sales Amount : "+sales_amount);
            System.out.println("Salary Basics : "+salarybasics);
            System.out.println("Sales Commision : " +sales_commission);
        }
        else if(sales_amount >=20000)
        {
            sales_commission = sales_amount * 0.10;
            System.out.println("Sales id : "+sales_id);
            System.out.println("Seller's Name : "+sallername);
            System.out.println("Sales Amount : "+sales_amount);
            System.out.println("Salary Basics : "+salarybasics);
            System.out.println("Sales Commision : " +sales_commission);
        }
        else if(sales_amount >=10000)
        {
            sales_commission = sales_amount * 0.05;
            System.out.println("Sales id : "+sales_id);
            System.out.println("Seller's Name : "+sallername);
            System.out.println("Sales Amount : "+sales_amount);
            System.out.println("Salary Basics : "+salarybasics);
            System.out.println("Sales Commision : " +sales_commission);
        }
        else // if sales amout is >10000
        {
            sales_commission = sales_amount * 0.02;
            System.out.println("Sales id : "+sales_id);
            System.out.println("Seller's Name : "+sallername);
            System.out.println("Sales Amount : "+sales_amount);
            System.out.println("Salary Basics : "+salarybasics);
            System.out.println("Sales Commision : " +sales_commission);
        }
    }
}
