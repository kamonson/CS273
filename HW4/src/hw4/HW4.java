/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

/**
 *
 * @author Kyle
 */
public class HW4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HW4_1();
    }

    public static void HW4_1() {

//        Restaurant_Reviewer rv = new Restaurant_Reviewer ();
//        rv.addReview("Wolfies", "123 There", "It was good", "4");
//        Reviews R = (Reviews) rv.getArrayList().get(0);
//        System.out.print (R.getName());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant_Reviewer_GUI().setVisible(true);
            }
        });
    }

}
