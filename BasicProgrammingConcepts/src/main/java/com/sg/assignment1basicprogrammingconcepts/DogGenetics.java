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
public class DogGenetics {

    public static void main(String[] args) {

        String dogName;
        String dogBreed1 = "St. Bernard";
        String dogBreed2 = "Chihuahua";
        String dogBreed3 = "Dramatic RedNosed Asian Pug";
        String dogBreed4 = "Common Cur";
        String dogBreed5 = "King Doberman";
        int dogBreed1Percent = 0;
        int dogBreed2Percent = 0;
        int dogBreed3Percent = 0;
        int dogBreed4Percent = 0;
        int dogBreed5Percent = 0;
        int dogBreedPercentSum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your dog's name?");
        dogName = sc.next();
        System.out.println("\nWell then, I have this highly reliable report on "
                + dogName + "'s prestigious background right here.");
        System.out.println("\n" + dogName + " is:");

        Random rGen = new Random();
        int counter = 0;

        while (dogBreedPercentSum < 100 || dogBreedPercentSum > 100
                || dogBreedPercentSum == 0) {
            dogBreed1Percent = rGen.nextInt(100 + 1);
            dogBreed2Percent = rGen.nextInt(100 + 1);
            dogBreed3Percent = rGen.nextInt(100 + 1);
            dogBreed4Percent = rGen.nextInt(100 + 1);
            dogBreed5Percent = rGen.nextInt(100 + 1);
            dogBreedPercentSum = dogBreed1Percent + dogBreed2Percent
                    + dogBreed3Percent + dogBreed4Percent + dogBreed5Percent;
            counter++;
        }
        System.out.println("\n" + dogBreed1Percent + "% " + dogBreed1);
        System.out.println("\n" + dogBreed2Percent + "% " + dogBreed2);
        System.out.println("\n" + dogBreed3Percent + "% " + dogBreed3);
        System.out.println("\n" + dogBreed4Percent + "% " + dogBreed4);
        System.out.println("\n" + dogBreed5Percent + "% " + dogBreed5);
        System.out.println();
        System.out.println("Wow, that's QUITE the dog");
        System.out.println(counter + " total loops");
    }
}
