package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("What is the order amount? ");
        Scanner sc = new Scanner(System.in);
        float amount = Float.parseFloat(sc.nextLine());
        System.out.println("What state do you live in? ");
        String state = sc.nextLine();
        System.out.println("What county do you live in? ");
        String county = sc.nextLine();
        if(state.equals("Wisconsin")){
            if(county.equals("Dunn")){
                float tax = (float)(amount * .0054);
                float total = amount + tax;
                System.out.printf("The tax is $%02f.", tax);
                System.out.printf("The total is $02f.", total);
            }else{
                float tax = (float)(amount * (.05));
                float total = amount+tax;

                System.out.print("The tax is $"+ tax);
                System.out.print("\nThe total is $"+ total);
            }
        }else if(state.equals("Illinois")){
            float tax = (float)(amount * .008);
            float total = amount + tax;
            System.out.println("The tax is $"+ tax+ ".");
            System.out.println("\nThe total is $"+ total+ ".");
        }else{
            System.out.println("The total is $"+ amount+ ".");
        }
    }
}
