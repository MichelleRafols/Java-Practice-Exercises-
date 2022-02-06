package com.bnta.exercises.week_two_mon.loops_exercises;

public class Exercise9 {

    public static void main(String[] args) {
        // create a for loop which goes through number in our array
        // check whether the value is greater than the current greatest value
        // reassign the current greatest value if true
        // print the greatest value
        // EXAMPLE SOLUTION

        int[] numArray = new int[]{1, 6, 17, 9, 20, 5};

//      assigning a placeholder for the greatest value
        int maxNum = 0;

        for (int number : numArray) {
            if (number > maxNum) {maxNum = number;} // in an iteration of the loop, the maximum value is replaced when the number in the array
//           satisfies the condition of the if statement
        }
        System.out.println(maxNum);
    }
}
