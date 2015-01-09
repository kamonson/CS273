/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw1;

/**
 *
 * @author kamonson17
 */
/**PR 1_4 created a class that holds a radious, a final double for PI and has a function to get the area of a circle*/
public class circleArea {
    double r; //PT: better to make r private, and use getR and setR methods
    final double PI = 3.14; //PT: use java.lang.Math.PI
    double getArea(){
        return (r*r)*PI;
    }
}
