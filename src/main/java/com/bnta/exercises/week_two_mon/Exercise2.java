package com.bnta.exercises.week_two_mon;

import java.util.Locale;

public class Exercise2 {
    /*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */
    public static void main(String[] args) {
        String input = "   b ri   ght net   work  ";
       // System.out.println(input.trim());
        /*if((input.trim().length()>0))
            System.out.println("Bright Network");*/
        input = input.replace(" ", "");
        input = input.replace("b", "B");
        input = input.replace("n", " N");
        System.out.println(input);
    }

    }
