/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.ArrayList;

/**
 * Student class containing a name and an arrayList of grades has methods to
 * return min max and avg grades
 *
 * @author kamonson17
 */
public class student {

    private ArrayList homework = new ArrayList();
    private String name;

    student() {
        this.name = "JohnDoe";
        homework.add(0);
    }

    student(String name, String[] array) {
        this.name = name;
        for (int i = 0; i < array.length; i++) {
            double k = Double.parseDouble(array[i]);
            homework.add(k);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList getGrades() {
        return homework;
    }

    public double getAvg() {
        String k;
        double total = 0;
        for (int i = 0; i < getGrades().size(); i++) {
            k = getGrades().get(i).toString();
            total += Double.parseDouble(k);
        }
        return total / ((double) getGrades().size());
    }

    public double getMax() {
        getGrades().sort(null);
        return (double) getGrades().get(homework.size() - 1);
    }

    public double getMin() {
        getGrades().sort(null);
        return (double) getGrades().get(0);
    }
}
