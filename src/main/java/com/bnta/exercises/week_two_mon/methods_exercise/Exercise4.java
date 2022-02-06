package com.bnta.exercises.week_two_mon.methods_exercise;

public class Exercise4 {
    /*
 Write a method which takes two numbers as arguments and prints one of:

"The first number is larger"
"The second number is larger"
"The numbers are equal"
as appropriate.
*/
    public static void main(String[] args) {
//      assigning integer values to compare in the number comparison method
        int num1 = 3;
        int num2 = 6;
//      invoking the number comparison method for the two integers above
        numberComparison(num1, num2);

    }
//      writing a method to compare numbers. the return type is void since it does not return a value
    private static void numberComparison(int num1, int num2) {
//      conditional statements to compare numbers
        if (num1 < num2) {
            System.out.println("The second number is larger");
        } else {
            System.out.println("The first number is larger");
        }
        if (num1 == num2) {
            System.out.println("The numbers are equal");
        }
    }
}

