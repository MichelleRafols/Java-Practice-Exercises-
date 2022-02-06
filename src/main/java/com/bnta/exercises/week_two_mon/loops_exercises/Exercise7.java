package com.bnta.exercises.week_two_mon.loops_exercises;
import java.util.Arrays;
public class Exercise7 {

    public static void main(String[] args) {
        // create a for loop which goes through each string in our array
        // make each word uppercase
        // assign the value in the array to the uppercase string
        // print our resulting array
        String[] ourArray = new String[]{"i", "sure", "do", "love", "bees"};

        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] = ourArray[i].toUpperCase();
        }

        System.out.println(Arrays.toString(ourArray));
//      another method to solve this is to just include the '.toUppercase()' function in the print method and omit line 13
    }
}
