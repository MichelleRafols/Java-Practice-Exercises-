package com.bnta.exercises.week_two_mon;

import java.util.Scanner;

public class Exercise5 {
    /*
       Write a method that displays random joke to the user.
       Your program should stop displaying jokes when use inputs no.
       For e.g
       Want to hear a joke? Yes/No
           if yes then display joke and repeat same question
           if no then program should exit
   */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean yesJoke = true;
        do {
        System.out.println("Want to hear a joke? Y/N");

        char userChoice = userInput.next().toLowerCase().charAt(0);

        switch (userChoice) {
            case 'y':
                System.out.println("How much does a polar bear weigh? Enough to break the ice. Nice to meet you." + " Want to hear a joke? Y/N");
                continue;

            case 'n':
                yesJoke = false;
                System.exit(0);
                break;
        }
        }
        while (yesJoke) ;
        System.out.println(' ');
    }
}
