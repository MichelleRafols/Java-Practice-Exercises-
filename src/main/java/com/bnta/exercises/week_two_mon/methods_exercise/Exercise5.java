package com.bnta.exercises.week_two_mon.methods_exercise;

public class Exercise5 {
    /*
    Write a method which takes a string as an argument, capitalises the first letter and returns the capitalised string.
  HINT: The .toUpperCase() method will capitalise the whole string. Investigate how to split the first letter from the string, capitalise that, then join the pieces back together
    */
    public static void main(String[] args) {
        String str = "food is good";

//      capitalising the first letter of the string
        String output = str.substring(0,1).toUpperCase() + str.substring(1);

        System.out.println(output);

    }
}
