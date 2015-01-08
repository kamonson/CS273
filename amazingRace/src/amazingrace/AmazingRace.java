/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace;

import FoodBank.*;
import java.util.Random;

/**
 *
 * @author kamonson17
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        foodContainer fc = new foodContainer();
        for (int i = 0; i < 25; i++) {
            if(i > 10) fc.set("Progresive", new soup("Progresive", 2, 2, rnd.nextInt(101)));
            fc.set("Folgers",new coffeeBeans("Folgers", 1, 3, rnd.nextInt(101)));
        }
        
//        System.out.printf("%s \n", fc.get("Folgers"));
//        coffeeBeans c = null;
//        if (fc.get("Folgers") instanceof coffeeBeans) {
//            c = (coffeeBeans) fc.get("Folgers");
//        }
//        c.Grind();
    }

}
