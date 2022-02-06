package com.bnta.exercises.week_two_mon.methods_exercise;

public class Exercise2 {
 /*
   Exercise 2: A method which takes a number as an argument and returns that number negated, e.g. passing 5 as
   an argument should return -5; passing -10 should return 10.
 */
    public static void main(String[] args) {
//      2. assigning a value to the 'negateNumber' method, so it can return a value
        int x = negateNumber(10);
//      4. calling the printNumber method
        printNumber(x);
    }

//    1. adding a method that returns a negative integer.
//    the object is passed in the method as we are keeping the same reference throughout the method.
//    the value of the object can be changed within the method
    private static int negateNumber(int number) {
        return number * -1;
    }

//    3. adding a method that simply prints the value but does not return a value
    private static void printNumber(int number) {
        System.out.println(number);
    }
}

