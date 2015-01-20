/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

/**
 * HW 4_1 HW4_2 is an android app called SuperBowlCoinFlip
 *
 * @author Kyle
 */
public class HW4 {

    /**
     * HW 4_1 HW4_2 is an android app called SuperBowlCoinFlip
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HW4_1();
    }
    /*
     GUI passes array to array list to add info from name, address, and notes 
     line and gives a star rating info stored in txt and repopulated in combo box, 
     when resturant selected address, score and notes populate
     */

    public static void HW4_1() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant_Reviewer_GUI().setVisible(true);
            }
        });
    }

}
