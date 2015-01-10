/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.ArrayList;

/**
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
            homework.add(array[i]);
        }
    }

    public String get_name() {
        return name;
    }

    public ArrayList get_grades() {
        return homework;
    }
}
