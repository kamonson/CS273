/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.math.*;

/**
 *
 * @author kamonson17
 */
public class Pi {

    private double pi = 0;
    double denominator = 1;
    boolean add = true;

    Pi() {
        for (int i = 0; i < /*Double.MAX_VALUE - 1*/ 200000; i++) {
            pi += Math.pow(-1, i) * (4 / denominator);
            denominator += 2;
        }
    }

    Pi(int a) {
        for (int i = 0; i < /*Double.MAX_VALUE - 1*/ a; i++) {
            pi += Math.pow(-1, i) * (4 / denominator);
            denominator += 2;
        }
    }
    
    Pi(String a){
        for (int i = 0; i < /*Double.MAX_VALUE - 1*/ Integer.parseInt(a); i++) {
            pi += Math.pow(-1, i) * (4 / denominator);
            denominator += 2;}
    }

    public double get_Pi() {
        return pi;
    }
}
