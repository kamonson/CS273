package CS.Java372.CoinFlip.app;

import java.util.Random;

/**
 * Created by kamonson17 on 1/19/2015.
 */
public class Flip {
    private Random rand = new Random ();
    private int RandFlip;
    Flip() {}
    public int getFlip (){return RandFlip = rand.nextInt((0-1)+ 1) + 1;}
}