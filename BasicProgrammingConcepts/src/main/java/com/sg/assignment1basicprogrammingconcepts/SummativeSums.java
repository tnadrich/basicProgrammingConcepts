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
public class SummativeSums {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter in the values to sum in the array.");
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = {999, -60, -77, 14, 160, 301};
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
            140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("#1 Array Sum: " + toArraySum(array1));
        System.out.println("#2 Array Sum: " + toArraySum(array2));
        System.out.println("#3 Array Sum: " + toArraySum(array3));
    }

    public static int toArraySum(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        return sum;
    }
}
