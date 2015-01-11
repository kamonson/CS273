/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author kamonson17
 */
public class homeworkTracker {

    HashMap<String, student> studentGrades = new HashMap<String, student>();
    ArrayList names = new ArrayList();

    homeworkTracker() {
    }

    public void setStudentGrades(String n, student s) {
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
