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
public class foodItem extends foodBank {

    private double Weight;
    private double Volume;
    private int ExpDate;

    public foodItem(String Name, double Weight, double Volume, int ExpDate) {
        this.Weight = Weight;
        this.Volume = Volume;
        this.Name = Name;
        this.ExpDate = ExpDate;
    }

    Double GetWeight() {
        return Weight;
    }

    Double GetVolume() {
        return Volume;
    }
    
   public void getThing(){
         System.out.println("food!");
    }
}
