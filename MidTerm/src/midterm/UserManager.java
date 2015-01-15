/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.HashMap;
import java.io.*;

/**
 *
 * @author kamonson17
 */
public class UserManager {

    UserExceptions UEx = new UserExceptions();
    HashMap<String, User> hashUser = new HashMap<String, User>();
    User user = new User();

    UserManager() {
    }

    public boolean userAvalible(String N) {
        if (hashUser.get(N) == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addUser(String N) throws UserExceptions {
        if (userAvalible(N) == false) {
            throw UEx;
        } else {
            user = new User(N);
            hashUser.put(N, user);
            File fWrite = new File("UnderOverUsers");
            try {
                BufferedWriter wrtr = new BufferedWriter(new FileWriter(fWrite, true));
                wrtr.write(user.getName());
                wrtr.newLine();
                wrtr.write(String.valueOf(user.getMoney()));
                wrtr.newLine();
                wrtr.write("Next User");
                wrtr.newLine();
                wrtr.close();
            } catch (Exception ex) {
                System.out.println("Ah, crap....something whent wrong in the file i/o writing");
            }
        }
    }

    public void loadUser() {
        File fRead = new File("UnderOverUsers");
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(fRead));
            String line;
            while ((line = rdr.readLine()) != null) {
                if (line.isEmpty()) {
                    line = rdr.readLine();
                }
                if (line.contains("Next User")) {
                    hashUser.put(user.getName(), user);
                } else {
                    user.setName(line);
                    line = rdr.readLine();
                    user.setMoney(Integer.parseInt(line));
                }

            }
            rdr.close();
        } catch (Exception ex) {
            System.out.println("Ah, crap....something whent wrong in the file i/o loading");
        }
    }

    public User getUser(String Name) { //problem solving, user was not setting itself = to value at key hashUser("name")
        user.setName(hashUser.get(Name).getName());
        user.setMoney(hashUser.get(Name).getMoney());
        return user;
    }
    
    public HashMap getHash () {return hashUser;}
}
