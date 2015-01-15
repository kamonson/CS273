/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.regex.*;

/**
 *
 * @author kamonson17
 */
public class User {

    GameExceptions GE = new GameExceptions();
    private String Name;
    private int Money;

    User() {
    }

    User(String N) {
        this.Name = N;
        this.Money = 500;
    }

    public void setName(String N) {
        this.Name = N;
    }

    public void setMoney(int M) {
        this.Money = M;
    }

    public void loseMoney(int M) throws GameExceptions {
        this.Money -= M;
        if (Money < 0) {
            throw GE; //Money Under Zero
        }
    }

    public int betMoney(int M) throws GameExceptions {
        this.Money -= M;
        if (Money < 0) {
            throw GE; //Money Under Zero
        }
        return M;
    }

    public void winMoney(int M) {
        this.Money += M;
    }

    public String getName() {
        return this.Name;
    }

    public int getMoney() {
        return this.Money;
    }
    
}
