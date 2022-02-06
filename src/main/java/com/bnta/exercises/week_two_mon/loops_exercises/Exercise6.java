package com.bnta.exercises.week_two_mon.loops_exercises;

public class Exercise6 {
    public static void main(String[] args) {
        // create a sum variable
        // using your answer from Question 4, create a for loop that goes through the values
        // add each item to the sum value
        // print the total sum
        int[] numbers = new int[11];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;

//          assign a placeholder
            int sum = 0;

        for (int addend : numbers) {
            sum += addend;
        }
            System.out.println(sum);
        }
    }
}