package com.bnta.exercises.week_two_mon.loops_exercises;
import java.util.Arrays;
public class Exercise8 {
    public static void main(String[] args) {
        // create a for loop which goes through each string in our array
        // grab the first letter of our word
        // capitalise the first letter
        // add the capitalised letter to the rest of the provided word
        // assign the value to an array
        // print our resulting array
        String[] ourArray = new String[]{"i", "sure", "do", "love", "bees"};

        for (int i = 0; i < ourArray.length; i++) {
            char firstLetter = ourArray[i].charAt(0);
            char capLetter = Character.toUpperCase(firstLetter);
            String capWord = capLetter + ourArray[i].substring(1);
            ourArray[i] = capWord;
        }

        System.out.println(Arrays.toString(ourArray));
    }
}
