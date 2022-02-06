package com.bnta.exercises.week_two_mon.methods_exercise;

public class Exercise3 {

    public static void main(String[] args) {
        /**
         * Exercise 3: A method which takes two numbers as arguments, checks if they are the same and returns the appropriate
         * boolean value.
         *
         * You should check *both* possible outcomes here, i.e. that it returns `true` when it is supposed to and `false` when
         * it is supposed to.
         */
        int x = 2;
        int y = 1 + 1;
        boolean booleanResult = checkForTwoEqualNumbers(x, y);
        print(booleanResult);
    }

    private static boolean checkForTwoEqualNumbers(int x, int y) {
        boolean result = x == y;
        return result;
    }

    private static void print(boolean result) {
        System.out.println(result);
    }
}
