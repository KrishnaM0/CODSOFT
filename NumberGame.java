package com.Tasks;

import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_num = rand.nextInt(100);
        Scanner scr = new Scanner(System.in);

        boolean continuePlaying = true;
        System.out.println();
        System.out.println("    --------------------------------------------------------");
        System.out.println("                  Number Guessing Game(<100)                ");
        System.out.println("    --------------------------------------------------------");

        while(continuePlaying) {
            System.out.println();
            System.out.println("--------------");
            System.out.println("| 1 |  Play  |");
            System.out.println("--------------");
            System.out.println("| 2 |  Exit  |");
            System.out.println("--------------");

            System.out.print("Enter your choice : ");
            int choice = scr.nextInt();

            int attempt;
            int NoOfAttempts = 10;
            int attemptsTaken = 0;

            switch(choice) {
                case 1 :
                    for (attempt = 1; attempt <= NoOfAttempts; attempt++) {

                        System.out.print("\nGuess A Number : ");
                        int guess = scr.nextInt();

                        if (guess == rand_num) {
                            System.out.println("\nThe guess is correct..!");
                            attemptsTaken++;
                            break;
                        }
                        if (guess > rand_num) {
                            System.out.println("The guessed number is high\nGuess the lower number");
                            attemptsTaken++;
                        }
                        if (guess < rand_num) {
                            System.out.println("The guessed number is less\nGuess the higher number");
                            attemptsTaken++;
                        }
                    }
                    if(attempt > NoOfAttempts){
                        System.out.println("\nYou Lose..Attempts are over..!");
                    }
//                    System.out.println("\nDisplay Score : ");
                    System.out.println();
                    System.out.println("    -----------------------------------------------------");
                    System.out.println("    |                  Display Score                    |");
                    System.out.println("    -----------------------------------------------------");
                    System.out.println("    |        The number of attempts taken : " + attemptsTaken + "/" + NoOfAttempts + "        |");
                    System.out.println("    -----------------------------------------------------");

                    break;
                case 2:
                    System.out.println("Exiting the game...");
                    continuePlaying = false;
                    break;
                default:
                    System.out.println("Entered Invalid choice. valid : (1 | 2)");
                    break;
            }
        }
    }
}
