package com.bnta.exercises.week_two_mon.arrays_exercise;

import java.util.Arrays;

public class Exercise9 {

    public static void main(String[] args) {

//      adding onto your example from Q9, now create a second `for` loop which reassigns each value in the array to be double the initial value
//      again print the array
        int[] numArray = new int[10];
        for (int i = 0; i < 10; i++) {
            numArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(numArray));

        int[] numArray2 = numArray;
        for (int i = 0; i < 10; i++) {
            numArray2[i] = (i + 1) * 2;
        }
        System.out.println(Arrays.toString(numArray2));
    }
} //    answer from exercise solutions: a simpler method
//        int[] newNumberArray = new int[10];
//
//        for (int i = 0; i < 10 ; i++) {
//            newNumberArray[i] = i + 1;
//
//        }
//        for (int i = 0; i < newNumberArray.length; i++) {
//            newNumberArray[i] = newNumberArray[i] * 2;
//        }
//     System.out.println(Arrays.toString(newNumberArray));
//        }
