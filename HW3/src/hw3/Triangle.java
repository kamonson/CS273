/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 * overides Shapes getArea, getParim calculates area, parimeter and validates if
 * arguments passed can be the shape
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

    Triangle(int _l1, int _l2, int _l3) {
        //PT -- don't allow negative-length sides. -3
        if (((_l1 + _l2) <= _l3) || ((_l1 + _l3) <= _l2) || ((_l2 + _l3) <= _l1)) {
            throw new IllegalArgumentException();
        }
        this.l1 = _l1;
        this.l2 = _l2;
        this.l3 = _l3;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getParim() * (getParim() - l1) * (getParim() - l2) * (getParim() - l3));
    }

    @Override
    public double getParim() {
        return l1 + l2 + l3;
    }
}
