package com.bnta.exercises.week_two_mon.methods_exercise;

import  java.util.Arrays;

public class Exercise7 {
//    Write a method which takes a sentence as an argument, counts the number of words in the array and prints "The sentence contains X words".
//HINT: Remember what you've done already, you might be able to reuse one of your methods here...

    public static void main(String[] args) {
        String sentence = "I want to eat";

//      invoking the method within the word counter method in main method
        numberOfWords(sentence);
        numberOfWords("Pizza will never let you down");
    }
    public static void numberOfWords(String sentence){
//      creating a method that breaks the array by the delimiter separating them. in this case, the delimiter is the spaces in the sentence
        String[] strArray = sentence.split(" ");

//      assigning a variable as a placeholder with the value of 0
        int counter = 0;

//      creating a for loop that increments by one as it goes through each word in the array
        for (String item : strArray) {
            counter++;
        }
        System.out.println(Arrays.toString(strArray));
        System.out.println("This sentence contains " + counter + " words");

    }
}
