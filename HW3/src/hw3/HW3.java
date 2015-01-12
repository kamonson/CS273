/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author kyleb_000
 */
public class HW3 {

    /**
     * @param args the command line arguments Calls functions for Homework 3
     */
    public static void main(String[] args) {
        HW3_1();
    }

    public static void HW3_1() {
        double[] numArray = new double[10];
        int k = 0;
        System.out.println("Please enter 10 integers:\n");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.printf("\n %d: ", i + 1);
                Scanner ui = new Scanner(System.in);
                k = ui.nextInt();
            } catch (Exception InputMismatchException) {

                System.out.println("Whoops, that was not an int, try again\n");
                i--;
                continue;
            }
            numArray[i] = k;
        }
        Numbers n = new Numbers(numArray);

        System.out.printf(
                "The min number is: %s\n", String.valueOf(n.getMin()));
        System.out.printf(
                "The max number is: %s\n", String.valueOf(n.getMax()));
        System.out.printf(
                "The avg number is: %s\n", String.valueOf(n.getAvg()));

    }
}
