/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author kyleb_000
 */
public class HW3 {

    /**
     * @param args the command line arguments Calls functions for Homework 3
     */
    public static void main(String[] args) {
        //HW3_1();
        //HW3_2();
        HW3_3();
    }

    public static void HW3_1() {
        double[] numArray = new double[10];
        System.out.println("Please enter 10 integers:\n");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.printf("\n %d: ", i + 1);
                numArray[i] = new Scanner(System.in).nextInt();
            } catch (Exception InputMismatchException) {
                System.out.println("Whoops, that was not an int, try again\n");
                i--;
                continue;
            }
        }
        Numbers n = new Numbers(numArray);

        System.out.printf(
                "The min number is: %s\n", String.valueOf(n.getMin()));
        System.out.printf(
                "The max number is: %s\n", String.valueOf(n.getMax()));
        System.out.printf(
                "The avg number is: %s\n", String.valueOf(n.getAvg()));
    }

    public static void HW3_2() {
        Rectangle r = makeRectangle();
        System.out.printf("Area: %f", r.getArea());
        System.out.printf("\nPermiter: %f", r.getParim());
        Triangle t = makeTriangle();
        System.out.printf("Area: %f", t.getArea());
        System.out.printf("\nPermiter: %f", t.getParim());
        Ellipse e = makeEllipse();
        System.out.printf("Area: %f", e.getArea());
        System.out.printf("\nPermiter: %f", e.getParim());
    }

    public static Rectangle makeRectangle() {
        Rectangle r = new Rectangle();
        try {
            Scanner ui = new Scanner(System.in);
            System.out.println("\nWhat is width: ");
            int w = ui.nextInt();
            System.out.println("\nWhat is length: ");
            int l = ui.nextInt();
            Rectangle r1 = new Rectangle(w, l);
            r = r1;

        } catch (Exception ex) {
            System.out.println("that combination did not make a Rectangle, try again\n");
            r = makeRectangle();
        }
        return r;
    }

    public static Triangle makeTriangle() {
        Triangle t = new Triangle();
        try {
            Scanner ui = new Scanner(System.in);
            System.out.println("\nWhat is Length 1: ");
            int l1 = ui.nextInt();
            System.out.println("\nWhat is Length 2: ");
            int l2 = ui.nextInt();
            System.out.println("\nWhat is Length 3: ");
            int l3 = ui.nextInt();
            Triangle t1 = new Triangle(l1, l2, l3);
            t = t1;

        } catch (Exception ex) {
            System.out.println("that combination did not make a Triangle, try again\n");
            t = makeTriangle();
        }
        return t;
    }

    public static Ellipse makeEllipse() {
        Ellipse e = new Ellipse();
        try {
            Scanner ui = new Scanner(System.in);
            System.out.println("\nWhat is R1: ");
            int r1 = ui.nextInt();
            System.out.println("\nWhat is R2: ");
            int r2 = ui.nextInt();
            Ellipse e1 = new Ellipse(r1, r2);
            e = e1;

        } catch (Exception ex) {
            System.out.println("that combination did not make a Ellipse, try again\n");
            e = makeEllipse();
        }
        return e;
    }

    public static void HW3_3() {
        
        //test Code Ignore//
//        String Y = "2015";
//        String M = "1";
//        String D = "31";
//        EventManagerStreamManager EM = new EventManagerStreamManager();
//        
////        EM.addEvent("2015", "1", "31", "Christin's B-Day", "Buy her a present");
////        EM.writeToStream();
////        EM.addEvent("2015", "1", "31", "Christin's B-Day", "Buy her many presents");
////        EM.writeToStream();
//        EM.readFromStream();
//
//        for (int i = 0; i < EM.getDaysEvents(Y, M, D).size(); i++){
//            Events E = EM.getDaysEvents(Y, M, D).get(i);
//            System.out.println(E.getEventTitle());
//            System.out.println(E.getEventBody());
//            System.out.println(E.getEventNumber());
//        }
//        EM.setRunningNumber();
////        EM.getDaysEvents(Y, M, D).stream().forEach((i) -> {
////            Events E = i;
////            System.out.print(E.getEventBody());
////        });
//EM.writeToStream();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIEventTracker dialog = new GUIEventTracker(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

}
