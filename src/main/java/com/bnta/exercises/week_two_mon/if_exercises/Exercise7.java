package com.bnta.exercises.week_two_mon.if_exercises;

public class Exercise7 {
    public static void main(String[] args) {
        // create a String variable and assign it a value
        // create an `if` statement which grabs the first letter of your word and compares it against a Character value
        // print something to the console if the condition is met
        String word = "Bright";
        char letter = word.charAt(0);
        //defining the integer value of the letter B
        int B = 'B';

        if (letter == B) {
            System.out.println("Woohoo!");
        }
    }
}
