/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 barhom alko
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the first number? ");
        int numone = sc.nextInt();

        System.out.println("What is the second number? ");
        int numtwo = sc.nextInt();

        System.out.println(numone + " + " + numtwo + " = " + (numone+numtwo));
        System.out.println(numone + " - " + numtwo + " = " + (numone-numtwo));
        System.out.println(numone + " * " + numtwo + " = " + (numone*numtwo));
        System.out.println(numone + " / " + numtwo + " = " + (numone/numtwo));

    }
}
