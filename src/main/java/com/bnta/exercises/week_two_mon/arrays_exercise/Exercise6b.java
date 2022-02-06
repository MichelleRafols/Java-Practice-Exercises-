package com.bnta.exercises.week_two_mon.arrays_exercise;

import java.util.Arrays;

public class Exercise6b {
    public static void main(String[] args) {

        // using your answer to Q5, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare

        String[] letters = new String[]{"a", "b", "c", "d"};
        System.out.println(Arrays.toString(letters));

        String[] copy = Arrays.copyOf(letters, letters.length); //note: subtracting from the length of the array outputs a reduction in the values of the array from the last index
        copy[0] = "z";
        System.out.println(Arrays.toString(copy));

    }
}
