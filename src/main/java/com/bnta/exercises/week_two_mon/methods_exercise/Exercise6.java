package com.bnta.exercises.week_two_mon.methods_exercise;

public class Exercise6 {
//    Write a method which takes an array of strings as an argument and returns the number of items in the array.
    public static void main(String[] args) {
//      creating a string array
        String[] strArray = {"i", "like", "to", "eat"};
//      invoking the method that counts the number of words in the string array
        numberOfWords(strArray);
    }

    public static void numberOfWords(String[] strArray) {
        int counter = 0; // assigning a variable as a placeholder with the value of 0

        for (String item : strArray) {
            counter++; // the counter increments by 1 every the loop goes through each item in the array
        }
        System.out.println(counter);
    }
}
