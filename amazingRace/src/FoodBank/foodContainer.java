/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodBank;

import java.util.HashMap;

/**
 *
 * @author kamonson17
 */
public class foodContainer {

  private HashMap<String, foodItem> theContainer = new HashMap<String, foodItem>();

   public foodContainer() {

    }

    public foodItem get(String s) {
        return this.theContainer.get(s);
    }

    public void set(String s, foodItem f) {
        this.theContainer.put(s, f);
    }
}
