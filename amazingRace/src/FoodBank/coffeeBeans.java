package FoodBank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author kamonson17
 */
public class coffeeBeans extends foodItem {


    public coffeeBeans(String Name, double Weight, double Volume, int EXP) {
        super(Name, Weight, Volume, EXP);
    }

    public void Grind() {
        System.out.println("grinding...");

    }
}
