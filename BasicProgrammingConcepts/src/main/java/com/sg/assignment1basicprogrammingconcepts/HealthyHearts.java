/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assignment1basicprogrammingconcepts;

import java.util.Scanner;

/**
 *
 * @author capta
 */
public class HealthyHearts {

    public static void main(String[] args) {

        int usersAge = 0;
        int maxHeartRate = 0;
        int lowHeartZone = 0;
        int highHeartZone = 0;
        String invalidUsersAge = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, what is your age?");
        if (sc.hasNextInt()) {
            usersAge = sc.nextInt();
            while (usersAge <= 0) {
                System.out.println("Please enter a valid age.");
                usersAge = sc.nextInt();
            }
            maxHeartRate = 220 - usersAge;
            System.out.println("\nYour maximum heart rate should be "
                    + maxHeartRate + " beats per minute.");
            lowHeartZone = (int) (Math.round(.5 * maxHeartRate));
            highHeartZone = (int) (Math.round(.85 * maxHeartRate));
            System.out.println("Your target heart rate zone is "
                    + lowHeartZone + " - " + highHeartZone + " beats per "
                    + "minute.");
        } else {
            while (sc.hasNextInt() == false) {
                invalidUsersAge = sc.next();
                System.out.println("\nPlease enter a valid age");
            }
            maxHeartRate = 220 - usersAge;
            System.out.println("\nYour maximum heart rate should be "
                    + maxHeartRate + " beats per minute.");
            lowHeartZone = (int) (Math.round(.5 * maxHeartRate));
            highHeartZone = (int) (Math.round(.85 * maxHeartRate));
            System.out.println("Your target heart rate zone is " + lowHeartZone
                    + " - " + highHeartZone + " beats per minute.");
        }
    }
}
