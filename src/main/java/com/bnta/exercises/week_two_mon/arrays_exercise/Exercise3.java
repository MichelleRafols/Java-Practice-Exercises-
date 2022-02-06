package com.bnta.exercises.week_two_mon.arrays_exercise;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {

        // using your array from Q1, fill it with the number `4`
        // print the array to the console
        int[] intArray = {4, 4, 4};
//        calling the toString function to print the values of the array.
//        without the toString function, we will simply get an unintelligible code
        System.out.println(Arrays.toString(intArray));

//      or another solution from the exercise solutions
//      calling on the fill method for arrays to input an integer value of '4' into "intArray" itself.
//      note: from the arrays fill dropdown, select the (integer array, value) option
        Arrays.fill(intArray, 4);
        System.out.println(Arrays.toString(intArray));

    }
}
