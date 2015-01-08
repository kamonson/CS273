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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // HW2_1();
       // HW2_3();
        HW2_4();
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
    public static void HW2_4 (){
        Pi cherry = new Pi();
        System.out.printf("%1f", cherry.get_Pi());
    };
}
