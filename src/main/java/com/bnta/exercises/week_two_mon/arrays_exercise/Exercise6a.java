package com.bnta.exercises.week_two_mon.arrays_exercise;

import java.util.Arrays;

public class Exercise6a {
    public static void main(String[] args) {

        // using your answer to Q5, create a second array which is initialised using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare


        String[] letters = new String[]{"a", "b", "c", "d"};
        System.out.println(Arrays.toString(letters)); // prints the original values of the array
        String[] letters2 = letters;
        letters2[0] = "z";

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(letters2));
        // the value of index zero in both strings is now replaced with "z"
//        this is because the reference array in the memory stack is the same for both arrays,
//        so when either array is changed, the reference in the stack is also changed.
    }

}
