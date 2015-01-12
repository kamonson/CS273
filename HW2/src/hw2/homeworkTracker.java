/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * class to create students and homework and store their data
 *
 * @author kamonson17
 */
public class homeworkTracker {

    //HashMap of student objects
    HashMap<String, student> studentGrades = new HashMap<String, student>();
    //arrayList of keys
    ArrayList names = new ArrayList();

    homeworkTracker() {
    }

    public void setStudentGrades(String n, student s) {
        //PT: what's a bit tricky here is that students can have the same name,
        //   so using name as key for the hashmap isn't going to work always
        studentGrades.put(n, s);
        names.add(n);
    }

    public int getStudentCount() {
        return names.size();
    }

    public String getStudent(int i) {
        return names.get(i).toString();
    }

    public void addStudent(String s) {
        names.add(s);
    }

    public void addStudentAt(int i, String s) {
        names.add(i, s);
    }
}
