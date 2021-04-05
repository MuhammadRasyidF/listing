package main;

import java.util.*;

/**
 * this program demonstrates a <code>while</code> loop.
 * @author RF
 */
public class Retirement{
    public static void main(String[] args){
        //read inputs
        Scanner in = new Scanner(System.in);

        System.out.print("how much money do you need to retire? ");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.print("interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        //update account balance while goal isn't reached
        while (balance < goal)
        {
            //add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate /100;
            balance += interest;
            years++;   
            
            // balance += payment;
            // balance += balance * interestRate/100;
            // years++;
        }
        
        System.out.println("you can retire " + years + " years") ;
        System.out.println("you'll get " + balance + "dollar") ;
        
        in.close();
    }
}