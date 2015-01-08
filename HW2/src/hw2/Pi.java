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
        for (int i = 0; i < /*Double.MAX_VALUE - 1*/ 2000000000; i++) {
            if (add == false) {
                pi -= (4 / denominator);
                denominator+=2;
                add = true;
            } else {
                pi += (4 / denominator);
                denominator+=2;
                add = false;
            }
        }
    }

    public double get_Pi() {
        return pi;
    }

    public double get_Pi(int i) {
        return (pi * Math.floor((i * 100) / 100));
    }
}
