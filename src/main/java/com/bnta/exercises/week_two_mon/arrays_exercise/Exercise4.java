package com.bnta.exercises.week_two_mon.arrays_exercise;

import java.util.Arrays;

public class Exercise4 {// QUESTION 4

    public static void main(String[] args) {

        // adding onto your code from questions 1-3, reassign the second value in the array to the number `17`
        // print the array to the console

//      declaring a new array
        int[] intArray = new int[3];
//      filling the array with an input of an integer value of 4
        Arrays.fill(intArray, 4);
//      within the same array, we are replacing the input value of the 1st index with an input of 17;
        intArray[1] = 17;
//      since the functions above are all applied within the same array, we can simply print the string of the integer array
        System.out.println(Arrays.toString(intArray)); // output = [4, 17, 4]
    }


}
