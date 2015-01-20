/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.util.ArrayList;

/**
 * non GUI interface
 *
 * @author Kyle
 */
public class Restaurant_Reviewer {

    private ArrayList<Reviews> arrayList = new ArrayList<Reviews>();
    private Reviews_Stream review = new Reviews_Stream();

    Restaurant_Reviewer() {
    }

    public void addReview(String NM, String AD, String NT, String RT) {

        review.setName(NM);
        review.setAddress(AD);
        review.setNotes(NT);
        review.setRating(RT);
        review.writeToStream();
        review.readFromStream(this.arrayList);
    }

    public void readReview(ArrayList AL) {
        review.readFromStream(AL);
    }

    public ArrayList getArrayList() {
        return arrayList;
    }
}
