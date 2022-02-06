package com.bnta.exercises.week_two_mon;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise6 {
    private static String[] emailAddress;

    /*
         Create a package called email
         Then have a method called validateEmail that return true of false if input is valid email
         Finally invoke validateEmail in main
             i.e. "hello@gmail.com" -> true
             i.e. "hellogmail.com" -> false
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email address:");
        String emailAddress = scanner.next();

        if (isValid(emailAddress) == true) {
            System.out.println("Valid email address");
        }
        else {
            System.out.println("Invalid email address");
        }
    }
    static boolean isValid(String input) {
        String regex = "^(.+)@(\\\\S+)$";

        Pattern pattern = Pattern.compile(regex,  Pattern.CASE_INSENSITIVE);
        Matcher emailMatcher = pattern.matcher("Welcome to your Gmail!");
        boolean validEmail = emailMatcher.matches();
        return validEmail;
    }
}









    