/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 *
 * @author kamonson17
 */
public class Triangle extends Shapes {

    private int l1;
    private int l2;
    private int l3;

    Triangle() {
        this.l1 = 0;
        this.l2 = 0;
        this.l3 = 0;
    }

    Triangle(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getParim()*(getParim()-l1)*(getParim()-l2)*(getParim()-l3));
    }
    @Override
    public double getParim() {
        return l1 + l2 + l3;
    }
}
