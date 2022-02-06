package com.bnta.exercises.week_two_mon.methods_exercise;


public class Exercise1 {
    public static void main(String[] args) {
//      calling on the sumOfNumbers method in the main method. the last step before printing the sum
        sumOfNumbers();
        }
//      first, writing a method for the sum of numbers.
//      because the method does not return a value, the return is set to "void"
        public static void sumOfNumbers() {
//        assigning the value of two integers
            int x = 1;
            int y = 2;
//        assigning a placeholder for the sum of the integers
            int sum = x + y;
            System.out.println(sum);

    }
}
