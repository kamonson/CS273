package midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kamonson17
 */
public class Dice {

    private int sides;

    Dice() {
        this.sides = 6;
    }

    public void setSides(int S) {
        this.sides = S;
    }

    public int getSides() {
        return this.sides;
    }
}
