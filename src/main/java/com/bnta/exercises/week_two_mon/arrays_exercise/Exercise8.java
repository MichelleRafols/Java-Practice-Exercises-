package com.bnta.exercises.week_two_mon.arrays_exercise;

import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {

        // declare a new array which can hold the numbers from 1-10 (inclusive)
        // create a `for` loop which initialises this array with the numbers 1-10
        // print the array to the console

            int[] numArray = new int[10];
             for (int i = 0; i < 10 ; i++) {
                 numArray[i] = i + 1;
            }
        System.out.println(Arrays.toString(numArray));
        }
    }
