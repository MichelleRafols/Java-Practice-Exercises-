package com.bnta.exercises.week_two_mon;

import java.util.Scanner;

public class Exercise3 {
    /*
      Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
      You might compile and run the program via command line or by editing configuration and pass program arguments
    */
    public static void main(String[] args) {
        // args should contain numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is an even number");
        else
            System.out.println(num + " is an odd number");
    }

}
