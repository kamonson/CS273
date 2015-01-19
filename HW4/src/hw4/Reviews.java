package hw4;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kyle
 */
public class Reviews {

    private String name = "None";
    private String address = "None";
    private String notes = "None";
    private String rating = "None";
//    private int runningNumber = 0;
    //  private ArrayList<Reviews> arrayList = new ArrayList<Reviews>();

    Reviews() {
    }

    Reviews(String Nm, String A, String Nt, String R) {
        setName(Nm);
        setAddress(A);
        setNotes(Nt);
        setRating(R);
    }

    public void setName(String Nm) {
        this.name = Nm;
    }

    public void setAddress(String A) {
        this.address = A;
    }

    public void setNotes(String Nt) {
        this.notes = Nt;
    }

    public void setRating(String R) {
        this.rating = R;
    }

//    public void setRunning(Integer Rn) {
//        this.runningNumber = Rn;
//    }
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getNotes() {
        return this.notes;
    }

    public String getRating() {
        return this.rating;
    }

//    public Integer getRunningNumber() {
//        return this.runningNumber;
//    }
//    public ArrayList getArrayList() {
//        return this.arrayList;
//    }

//    public void setArrayList(Reviews AL){
//        this.arrayList.add(AL);
//    }
//
//    public void clearArrayList() {
//        this.arrayList.clear();
//    }
}
