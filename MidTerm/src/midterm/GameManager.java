/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.HashMap;

/**
 *
 * @author kamonson17
 */
public class GameManager {

    RollDice roll = new RollDice();
    User user = new User();
    UserManager uM = new UserManager();

    public void play(String Name, int Bet, int Outcome) throws GameExceptions {
        try {
            uM.loadUser();
            user = uM.getUser(Name);
            if (CheckWin(Outcome) == true) {
                if (Outcome == 1) {
                    user.winMoney(Bet += Bet);
                } else if (Outcome == 2) {
                    user.winMoney(Bet += (4 * Bet));
                } else if (Outcome == 3) {
                    user.winMoney(Bet += Bet);
                } else {
                    user.loseMoney(Bet);
                }
            }
        } catch (GameExceptions ge) {
            //pop up you lost    
        }
    }

    public void addUser(String N) throws UserExceptions {
        try {
            uM.addUser(N);
        } catch (UserExceptions ex) {
            //pop up name taken
        }
    }

    public User loadUser(String Name) {
        uM.loadUser();
        user = uM.getUser(Name);
        return user;
    }

    public boolean CheckWin(int Outcome) {
        boolean win = false;
        //under 7
        if (Outcome == 1) {
            if (roll.Roll() < 7) {
                win = true;
            }
            //==7
        } else if (Outcome == 2) {
            if (roll.Roll() == 7) {
                win = true;
            }
            //over 7
        } else if (Outcome == 3) {
            if (roll.Roll() > 7) {
                win = true;
            }
        }
        return win;
    }
}
