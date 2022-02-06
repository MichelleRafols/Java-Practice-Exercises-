package com.bnta.exercises.week_two_mon.loops_exercises;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        // using your answer from Question 4, create a for loop that goes through the values
        // print each value individually

        int[] numbers = new int[11];
        for (int i = 0; i < 11; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
//      answer from solutions: easier 'for' method for this exercise
        for (int item: numbers) {
                System.out.println(item);
        }
    }
}
