/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import java.util.HashMap;

/**
 * Main calls homework answers as functions
 *
 * @author Zeus
 */
public class HW2 {

    /**
     * Main calls homework functions. HW2_1() contains HW2_1 and HW2_2
     *
     * @param args the command line arguments for HW2_4
     */
    public static void main(String[] args) {
        HW2_1();
        HW2_3();
        HW2_4(args);
        HW2_5();
        HW2_6();
        HW2_7();
    }

    /**
     * HW 2.1 and 2.2 Create Gerbil object g1 with 12 Gerbils Create Gerbil
     * object g2 with a no argument Create an arrayList with a random number of
     * gerbils Ask the computer to make a specific gerbil hop Move throught the
     * list and make all the gerbils hop HW 2.2 create an iterator object to
     * iterate through gerbList
     */
    //HW2.1
    public static void HW2_1() {
        Gerbil g1 = new Gerbil(12);
        Gerbil g2 = new Gerbil();
        g1.hop();
        g2.hop();
        ArrayList<Gerbil> gerbList = new ArrayList<Gerbil>();
        Random rand = new Random();
        int rand1 = rand.nextInt((100) + 1);
        for (int i = 1; i < rand1; i++) {
            gerbList.add(new Gerbil(i));
        }
        gerbList.get(5).hop();

        for (int i = 0; i < gerbList.size(); i++) {
            gerbList.get(i).hop();
        }

        //HW 2.2
        Iterator it = gerbList.iterator();
        while (it.hasNext()) {
            ((Gerbil) it.next()).hop();
        }
    }

    /**
     * HW2_3 create a HashMap that will have a string key of gerbils, arrayList
     * of Gerbils, and a string array of names; assign a name to the map and a
     * gerbil number to the name in the map create a loop to iterate through the
     * string name array and use it for the key to make that gerbil number hop
     */
    public static void HW2_3() {
        HashMap<String, Gerbil> gerbMap = new HashMap<String, Gerbil>();
        ArrayList<Gerbil> gerbList = new ArrayList<Gerbil>();
        String[] gerbName = {"Tim", "Kalvin", "Zeus", "Jimmy", "Kyle"};
        for (int i = 0; i < 5; i++) {
            gerbList.add(new Gerbil(i));
            gerbMap.put(gerbName[i], gerbList.get(i));
        }

        for (int i = 0; i < 5; i++) {
            gerbMap.get(gerbName[i]).hop();
        }
    }

    /**
     * HW2_4 calculates the value of pie from the infinite series: π = 4 – 4/3 +
     * 4/5 – 4/7 + 4/9 – 4/11 + … Accepts command line argument to decide how
     * far into the series to go Print a table displaying the accuracy of pi at
     * each iteration of the first 200,000 items in the series
     *
     * @param args used to pass command line arguments for the number of times
     * to run formula
     */
    public static void HW2_4(String[] args) {
        if (args.length > 0 && args[0].equals(args[0])) {
            int a = Integer.parseInt(args[0]);
            Pi cherry = new Pi(a);
            System.out.printf("%f\n", cherry.get_Pi());
        } else {
            Pi cherry = new Pi();
            System.out.printf("%.17g\n", cherry.get_Pi());
        }
        for (int i = 0; i < 200000; i++) {
            System.out.printf("at %d times through the pi algarythom pi is calculated at: %f\n", i, new Pi(i).get_Pi());
        }
    }

    /**
     * Pi GUI, user presses a button and calculates pie to the desired number of
     * steps in the series based on HW2_4's classes
     */
    public static void HW2_5() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new piGui().setVisible(true);
            }
        });
    }

    /**
     * User interface that allows the user to add a student and their scores,
     * when the name is clicked on displays min max and avg scores for that
     * student
     */
    public static void HW2_6() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeworkTrackerGui().setVisible(true);
            }
        });
    }

    /**
     * App tracks girl scout cookie sales, keeps running total of number of
     * items sold, and running total of sales
     */
    public static void HW2_7() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GSCookiesGUI().setVisible(true);
            }
        });
    }
}
