/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calculator;

import java.util.Scanner;

/**
 *
 * @author Rashu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number:");
            int x = input.nextInt();
            System.out.println("Enter second number:");
            int y = input.nextInt();
            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Div");
            System.out.println("4.Mul");
            System.out.println("5.Max");
            System.out.println("6.Min");
            System.out.println("7.Power");
            System.out.println("8.MultiplicationTable");
            System.out.println("9.Exit");
            System.out.println("Enter your choice [1-9]:");
            int choice = input.nextInt();
            int total = 0;
            int power = 1;
            int max,min;

            switch (choice) {
                case 1:
                    total = x + y;
                    System.out.println("Total is:" + total);
                    break;

                case 2:
                    total = x - y;
                    System.out.println("Total is:" + total);
                    break;

                case 3:
                    total = x / y;
                    System.out.println("Total is:" + total);
                    break;

                case 4:
                    total = x * y;
                    System.out.println("Total is:" + total);
                    break;

                case 5:
                    max = ((x > y) ? x : y);
                    System.out.println("Maximum is:" + max);
                    break;

                case 6:
                    min = ((x < y) ? x : y);
                    System.out.println("Minimum is:" + min);
                    break;

                case 7:
                    if (y != 0) {
                        
                        for (int i = 1; i <= y; i++) {
                            power *= x;
                            
                        }
                    }
                   System.out.println("Power is:" + power);
                    break;

                case 8:
                    System.out.println("Multiplication table is :-");
 
                      for ( int i = 1 ; i <= y ; i++ )
                      System.out.println(x+"*"+i+" = "+(x*i));
                    break;
               
                case 9:
                    System.exit(0);
                    break;
            }
            System.out.println("Do you want to continue[Y/N]?");
            String ch=input.next();
            if(ch.equalsIgnoreCase("n")){
                System.exit(0);
            }
            
            

        }
        
    }

}
