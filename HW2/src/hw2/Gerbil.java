/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 * Gerbil Class for HW2.1 and HW2.2 from P2 11.2 and 11.3 no arg constructor
 * creates a gerbil and gives it the number of one
 *
 * @author Zeus
 */
public class Gerbil {

    private int gerbilNumber;

    /**
     * Create a gerbil and assign it the value of 1
     */
    public Gerbil() {
        gerbilNumber = 1;
    }

    /**
     *
     * @param i assigns i to gerbil number
     */
    public Gerbil(int i) {
        gerbilNumber = i;
    }

    /**
     * Make all gerbils in the arrayList hop
     */
    public void hop() {
        System.out.printf("Gerbil number %d is hopping\n", gerbilNumber);
    }
}
