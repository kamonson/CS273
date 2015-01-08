/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

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
        HW2_1();
    }

    /**
     * Create Gerbil object g1 with 12 Gerbils in the arrayList Create Gerbil
     * object g2 with between 25 and 100 Gerbils in the arrayList have the
     * selected gerbil, in this case 6 start hopping have all the gerbils start
     * hopping
     */
    public static void HW2_1() {
        Gerbil g1 = new Gerbil(12);
        Gerbil g2 = new Gerbil();

        g1.hop(6);
        g2.hop();
    }
}
