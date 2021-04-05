package main;

import java.util.*;

/**
 * this program demonstrates console input
 * @author RF
 */
public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        //get first input
        System.out.print("what is your name?");
        String name = in.nextLine();

        //get second input
        System.out.print("How old are ypu?");
        int age = in.nextInt() ;

        //display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1 ));
        
        in.close();
    }
}