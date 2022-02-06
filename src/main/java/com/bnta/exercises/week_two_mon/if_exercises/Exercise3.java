package com.bnta.exercises.week_two_mon.if_exercises;


public class Exercise3 {
    public static void main(String[] args) {
        // create a string variable using the `new` keyword
        // create a second string variable which has the same value as the first, again using the `new` keyword
        // create an `if` statement which compares the two variables and prints to the console if they are equal
        String myString = new String();
        String yourString = new String();

        if (myString == yourString) {
            System.out.println("Nice!");
        }
        else {
            System.out.println("Oops..");
        }
        if (myString.equals(yourString)) {
                System.out.println("Nice!");
            }
        }
}
