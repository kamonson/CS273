/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.util.ArrayList;

/**
 *
 * @author kamonson17
 */
public class Numbers {

    ArrayList numbers = new ArrayList();
    private double min = 0;
    private double max = 0;
    private double avg = 0;

    Numbers(double[] array) {
        for (int i = 0; i < array.length; i++) {
            numbers.add(array[i]);
        }
        sortNumbers();
    }

    public void addNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            numbers.add(array[i]);
            sortNumbers();
        }
    }

    public void sortNumbers() {
        numbers.sort(null);
        this.min = ((double) numbers.get(0));
        this.max = (double) numbers.get(numbers.size() - 1);
        double avgN = 0;
        for (int i = 0; i < numbers.size(); i++) {
            avgN += (double) numbers.get(i);
        }
        this.avg = avgN / ((double) numbers.size());
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getAvg() {
        return avg;
    }
}
