package hw3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * overides Shapes getArea, getParim calculates area, parimeter and validates if
 * arguments passed can be the shape
 *
 * @author kamonson17
 */
public class Ellipse extends Shapes {

    private int r1;
    private int r2;

    public Ellipse() {
        this.r1 = 0;
        this.r2 = 0;
    }

    public Ellipse(int r1, int r2) {
        if ((r1 == 0) || (r2 == 0)) {
            throw new IllegalArgumentException();
        }
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double getArea() {
        return Math.PI * r1 * r1; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getParim() {
        return Math.PI * (3 * (r1 + r2) - (Math.sqrt(((3 * r1) + r2) * ((r1) + 3 * r2))));
    }
}
