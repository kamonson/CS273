/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author kyleb_000
 */
public class HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PR1_1 EX 2.2 creates New ATypeName Object N and output the date retrieved from the ATypeName class
        ATypeName N = new ATypeName();
        System.out.println(N.date);

        //PR1_1 EX 2.4 (containing elements of 2.3) Class Data only contains Int I, Float F, Boolen B, create
        //new object d of DataOnly and assign values to i, f and b then print out
        DataOnly d = new DataOnly();
        d.i = 42;
        d.f = 424242424;//hex display
        d.b = true;

        System.out.println(d.i);
        System.out.println(d.f);//hex display
        System.out.println(d.b);
        pr1_2(args);//PR 1.2 this calls a function

        pr1_4();

        pr1_5();

        pr1_6();
    }

    /**
     * PR 1.3 Allow a user to select language for hello world, choose between
     * spanish, german, italian
     */
    public static void pr1_2(String[] args) {

        cmdLn g = new cmdLn();
        if (args.length > 0 && args[0].equals("spanish")) {
            g.greeting = "hola mundo";
        } else if (args.length > 0 && args[0].equals("german")) {
            g.greeting = "hallo welt";
        } else if (args.length > 0 && args[0].equals("italian")) {
            g.greeting = "Ciao Mondo";
        }
        /**
         * @return the the language chosen for hello world
         */
        System.out.println(g.greeting);
    }

    /**
     * PR1_4 ask for radious, store radious in new circle c1; run c1.getArea to
     * get the area of the circle output area
     */
    public static void pr1_4() {
        System.out.println("What is the radius of your circle?\n");
        circleArea c1 = new circleArea();
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        c1.r = x;
        System.out.printf("The area is: %f \n", c1.getArea());
    }

    /**
     * PR1_5 generates 25 random int values. For each value, use an if-else
     * statement to classify it as greater than, less than, or equal to a second
     * randomly-generated value
     */
    public static void pr1_5() {
        ArrayList<Integer> arrayRanNum = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            Random rand1 = new Random();
            arrayRanNum.add(rand1.nextInt(100) + 1); //random number added to array position i from 1-100
            if (i > 0) {
                if (arrayRanNum.get(i) > arrayRanNum.get(i - 1)) {
                    System.out.printf("%d,is greater then %d\n", arrayRanNum.get(i), arrayRanNum.get(i - 1));
                } else {
                    System.out.printf("%d,is less then %d\n", arrayRanNum.get(i), arrayRanNum.get(i - 1));
                }
            }

        }
    }

    /**
     * uses two nested for loops and the modulus operator (%) to detect and
     * print prime numbers
     */
    public static void pr1_6() {
        System.out.println("I will list the prime numbers up to the number you choose, please enter a number: \n");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 0; i <= x; i++) {
            if (i > 3) {
                for (int k = 2; k < 4; k++) {
                    int z = (i % k);
                    if (z == 0) {
                        break;
                    } 
                    else if (k !=3) {
                        continue;
                    }
                    else  System.out.printf("%d is prime\n", i);
                   
                }
            } else {
                System.out.printf("%d is prime\n", i);
            }
        }
    }
}
