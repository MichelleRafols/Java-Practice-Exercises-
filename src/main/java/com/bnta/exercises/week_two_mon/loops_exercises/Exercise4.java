package com.bnta.exercises.week_two_mon.loops_exercises;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        // initialising an array of integers with a length of 11 to get all numbers from 0 to 10, since the index starts at 0
        int[] numbers = new int[11];
        // creating a for loop that goes from 0 to 10
        for (int i = 0; i < 11; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

