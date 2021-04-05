package main;

import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;

/**
 * This program demontrates a <code>/while</code> loop.
 * @author RF
 */
public class Retirement2
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("how much money will you contribute every year? ");
        double payment =  scan.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = scan.nextDouble();

        double balance = 0;
        int year = 0;

        String input;


        //update account balance while user isn't ready to retire
        do
        {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate /100;
            balance += interest;

            year++;

            //print current balance 
            System.out.printf("after years %d, your balance is %,.2f%n", year , balance);

            // ask if ready to retire and get input
            System.out.print("Ready to retire? (Y/N) ");
            input = scan.next();
        }
        while (input.equals("N"));

        scan.close();
        Scanner scan2= new Scanner(System.in);
        
        input = scan2.next();
        
        scan.close();
        scan2.close();
    }
}