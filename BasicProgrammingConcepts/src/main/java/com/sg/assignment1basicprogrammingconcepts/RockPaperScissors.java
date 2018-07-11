/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assignment1basicprogrammingconcepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author capta
 */
public class RockPaperScissors {

    public static void main(String[] args) {

        int playAgain = 1;

        while (playAgain == 1) {
            int rounds = 0;
            int userChoice = 0;
            int cpuChoice = 0;
            int ties = 0;
            int userWin = 0;
            int cpuWin = 0;
            int trackRoll = 1;
            String invalidRounds;
            String invalidUserChoice;
            String invalidPlayAgain;

            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("How many rounds would you like to play "
                    + "(Minimum rounds = 1, Maximum rounds = 10?");
            if (sc.hasNextInt()) {
                rounds = sc.nextInt();
                System.out.println();

                if (rounds > 10 || rounds < 1) {
                    System.out.println("I said pick a number of rounds between"
                            + " 1 and 10, not " + rounds + ".");
                    System.out.println("End Program.");
                    return;
                } else {
                    for (int i = rounds; i > 0; i--) {
                        System.out.println("Which would you like to choose for "
                                + "round " + trackRoll + "? Rock(1), paper(2), "
                                + "or scissors(3)? Please enter in 1, "
                                + "2, or 3.");
                        if (sc.hasNextInt()) {
                            userChoice = sc.nextInt();
                            System.out.println();
                            trackRoll++;
                            while (userChoice < 1 || userChoice > 3) {
                                System.out.println(userChoice + " is not a 1, "
                                        + "2, or 3. Try again.");
                                System.out.println();
                                System.out.println("Which would you like to "
                                        + "choose for round " + trackRoll
                                        + "? Rock(1), paper(2), or scissors(3)"
                                        + "? Please enter in 1, 2, or 3.");
                                userChoice = sc.nextInt();
                                System.out.println();
                            }
                        } else {
                            while (sc.hasNextInt() == false) {
                                invalidUserChoice = sc.next();
                                System.out.println();
                                System.out.println(invalidUserChoice + " is not"
                                        + " a 1, 2, or 3. Try again.");
                                System.out.println();
                                System.out.println("Which would you like to "
                                        + "choose for round " + trackRoll + "? "
                                        + "Rock(1), paper(2), or scissors(3)? "
                                        + "Please enter in 1, 2, or 3.");
                            }
                            userChoice = sc.nextInt();
                            System.out.println();
                            trackRoll++;
                        }

                        Random rGen = new Random();
                        cpuChoice = rGen.nextInt(3) + 1;
                        if (userChoice == cpuChoice) {
                            ties++;
                            System.out.println("We both chose "
                                    + toString(userChoice) + "!");
                            System.out.println("It was a tie this round!");
                            System.out.println();
                        } else if (userChoice == 1 && cpuChoice == 2) {
                            cpuWin++;
                            System.out.println("The computer chose "
                                    + toString(cpuChoice) + "! The player's "
                                    + toString(userChoice) + " was covered by "
                                    + "the computer's paper this round.");
                            System.out.println("The computer wins this round!");
                            System.out.println();
                        } else if (userChoice == 1 && cpuChoice == 3) {
                            userWin++;
                            System.out.println("The computer chose "
                                    + toString(cpuChoice) + "! The player's "
                                    + toString(userChoice) + " smashes the "
                                    + "computer's scissors this round.");
                            System.out.println("The player wins this round!");
                            System.out.println();
                        } else if (userChoice == 2 && cpuChoice == 1) {
                            userWin++;
                            System.out.println("The computer chose "
                                    + toString(cpuChoice) + "! The player's "
                                    + toString(userChoice) + " covers the "
                                    + "computer's rock this round.");
                            System.out.println("The player wins this round!");
                            System.out.println();
                        } else if (userChoice == 2 && cpuChoice == 3) {
                            cpuWin++;
                            System.out.println("The computer chose "
                                    + toString(cpuChoice) + "! The player's "
                                    + toString(userChoice) + " was shredded by "
                                    + "the computer's scissors this round.");
                            System.out.println("The computer wins this round!");
                            System.out.println();
                        } else if (userChoice == 3 && cpuChoice == 1) {
                            cpuWin++;
                            System.out.println("The computer chose "
                                    + toString(cpuChoice) + "! The player's "
                                    + toString(userChoice) + " were smashed by "
                                    + "the computer's rock this round.");
                            System.out.println("The computer wins this round!");
                            System.out.println();
                        } else if (userChoice == 3 && cpuChoice == 2) {
                            userWin++;
                            System.out.println("The computer chose "
                                    + toString(cpuChoice) + "! The player's "
                                    + toString(userChoice) + " shredded the "
                                    + "computer's paper this round.");
                            System.out.println("The player wins this round!");
                            System.out.println();
                        }

                    }
                    System.out.println("The total number of ties for all "
                            + rounds + " rounds: " + ties);
                    System.out.println("The total number of player wins: "
                            + userWin);
                    System.out.println("The total number of computer wins: "
                            + cpuWin);
                    System.out.println();
                    if (userWin > cpuWin) {
                        System.out.println("The player wins!");
                        System.out.println();
                    } else if (cpuWin > userWin) {
                        System.out.println("The computer wins!");
                        System.out.println();
                    } else {
                        System.out.println("It was a tie! No one wins!");
                        System.out.println();
                    }
                }

            } else {
                invalidRounds = sc.nextLine();
                System.out.println();
                System.out.println("I said pick a number of rounds between 1 "
                        + "and 10, not " + invalidRounds + ".");
                System.out.println("End Program.");
                return;
            }

            System.out.println();
            System.out.println("Play again? Do you dare? (0 for no, 1 "
                    + "for yes)");

            if (sc.hasNextInt()) {
                playAgain = sc.nextInt();
                while (playAgain < 0 || playAgain > 1) {
                    System.out.println("");
                    System.out.println(playAgain + " is not a 0 or 1. Please "
                            + "choose a valid option.");
                    System.out.println();
                    System.out.println("Play again? Do you dare? (0 for no, "
                            + "1 for yes)");
                    playAgain = sc.nextInt();
                    System.out.println();
                }
            } else {
                while (sc.hasNextInt() == false) {
                    invalidPlayAgain = sc.next();
                    System.out.println();
                    System.out.println(invalidPlayAgain + " is not a 0 or 1. "
                            + "Please choose a valid option.");
                    System.out.println();
                    System.out.println("Play again? Do you dare? (0 for no, 1 "
                            + "for yes)");
                }
                playAgain = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Thanks for playing!");
        return;
    }

    public static String toString(int j) {

        String stringResult = "";

        switch (j) {
            case 1:
                stringResult = "rock";
                break;
            case 2:
                stringResult = "paper";
                break;
            case 3:
                stringResult = "scissors";
                break;
            default:
                stringResult = "invalid";
                break;
        }
        return stringResult;
    }
}
