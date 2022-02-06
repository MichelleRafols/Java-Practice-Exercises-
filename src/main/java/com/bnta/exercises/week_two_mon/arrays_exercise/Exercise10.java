package com.bnta.exercises.week_two_mon.arrays_exercise;

import java.util.Arrays;


public class Exercise10 {

    public static void main(String[] args) {

        // start from your solution to Q5
        // create a String variable called `condition` which has the value "c"
        // create a Boolean variable called `hasC` which has the value `false`
        // create a `for` loop which goes through each item in our array, comparing it against our `condition` variable
        // if the two are equal, change the `hasC` value to `true`
        // once the `for` loop concludes, print out a message which tells you if `hasC` is `true` or `false`
        String[] letters = new String[]{"a", "b", "c", "d"};
        System.out.println(Arrays.toString(letters));

        String condition = "c";
        boolean hasC = false; // else condition is outside the for loop

        for (String item: letters) {
            if (item == condition) {
                hasC = true; // main condition is put in the if statement
            }
            }
            if (hasC) {
                System.out.println(condition + " is in the array");
            }
            else {
                System.out.println(condition + " is in not the array");
        }
    }
}

