/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.Random;

/**
 *
 * @author kamonson17
 */
public class RollDice {

    private Dice d1 = new Dice();
    private Dice d2 = new Dice();
    private int d1Total;
    private int d2Total;
    private int total;

    RollDice() {
    }

    public int Roll() {
        Random rand = new Random();
        this.d1Total = (rand.nextInt(d1.getSides() - 1) + 1); //makes between 1 and number of sides
        this.d2Total = (rand.nextInt(d2.getSides() - 1) + 1); //makes between 1 and number of sides
        this.total = this.d1Total + this.d2Total;
        return total;
    }
}
