/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kyleb_000
 */
public class GSCookieTracker {

    int nThinMints = 0;
    double tThinMints = 0;
    int nSamoas = 0;
    double tSamoas = 0;
    int nChocolateChip = 0;
    double tChocolateChip = 0;

    GSCookieTracker() {
    }

    public void sellThinMints(int number) {
        ThinMint tm = new ThinMint();
        this.nThinMints += number;
        this.tThinMints += (number * tm.getCost());
    }

    public void sellSamoas(int number) {
        Samoas s = new Samoas();
        this.nSamoas += number;
        this.tSamoas += (number * s.getCost());
    }

    public void sellChocolateChip(int number) {
        ChocolateChip cc = new ChocolateChip();
        this.nChocolateChip += number;
        this.tChocolateChip += (number * cc.getCost());
    }

    public int getThinMintN() {
        return nThinMints;
    }

    public double getThinMintS() {
        return tThinMints;
    }

    public int getSamoasN() {
        return nSamoas;
    }

    public double getSamoasS() {
        return tSamoas;
    }

    public int getChocolateChipN() {
        return nChocolateChip;
    }

    public double getChocolateChipS() {
        return tChocolateChip;
    }

    public int getTotalN() {
        return nThinMints + nSamoas + nChocolateChip;
    }

    public double getTotalT() {
        return tThinMints + tSamoas + tChocolateChip;
    }
}
