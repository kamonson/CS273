/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Zeus
 *
 * Gerbil Class for HW2.1 from P2 11.2 constructor requires a user input for
 * number of gerbils to be stored in the arrayList gerbilList, if no argument is
 * given then create a random number between 25-100. The Hop function if an
 * argument is passed to hop that gerbil number will hop, if not then all
 * gerbils will hop
 */
public class Gerbil {

    private int gerbilNumber;
    ArrayList<Integer> gerbilList = new ArrayList<Integer>();
/**
 * Create a random amount of gerbils for the arrayList between 25-100
 */
    public Gerbil() {
        Random rand = new Random();
        int gerbRand = (rand.nextInt((100 - 25) + 1) + 25); //provide between 25 and 100 gerbils
        for (int k = 0; k < gerbRand; k++) {
            gerbilList.add(k + 1);
            gerbilNumber = k;
        }
    }
/**
 * 
 * @param i number of gerbils in arrayList
 */
    public Gerbil(int i) {
        for (int k = 0; k < i; k++) {
            gerbilList.add(k);
        }
    }
/**
 * Make all gerbils in the arrayList hop
 */
    public void hop() {
        for (int i = 0; i < gerbilList.size(); i++) {
            System.out.printf("Gerbil number %d is hopping\n", gerbilList.get(i));
        }
    }
/**
 * make the selected gerbil hop
 * @param i gerbil number to hop
 */
    public void hop(int i) {
        System.out.printf("Gerbil number %d is hopping\n", gerbilList.get(i));
    }
}
