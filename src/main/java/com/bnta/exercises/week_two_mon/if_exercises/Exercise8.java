package com.bnta.exercises.week_two_mon.if_exercises;


public class Exercise8 {
    public static void main(String[] args) {
        // create a String variable and assign it a value
        // create a `for` loop which wraps around your answer from Question 7
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met
        String word = "Bright";
        for (int i = 0; i <= word.length() -1; i++) {
            if (word.charAt(i) == 'B') {
                System.out.println("condition is met");
            }
        }
        }
    }
