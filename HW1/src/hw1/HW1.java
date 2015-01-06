/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * @author kyleb_000
 */
public class HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PR1_1 EX 2.2 creates New ATypeName Object N and output the date retrieved from the ATypeName class
        ATypeName N = new ATypeName();
        System.out.println(N.date);

        //PR1_1 EX 2.4 (containing elements of 2.3) Class Data only contains Int I, Float F, Boolen B, create
        //new object d of DataOnly and assign values to i, f and b then print out
        DataOnly d = new DataOnly();
        d.i = 42;
        d.f = 424242424;//hex display
        d.b = true;

        System.out.println(d.i);
        System.out.println(d.f);//hex display
        System.out.println(d.b);
        pr1_2(args);//PR 1.2 this calls a function
    }

    /**
     * PR 1.3 Allow a user to select language for hello world, choose between
     * spanish, german, italian
     */
    public static void pr1_2(String[] args) {

        cmdLn g = new cmdLn();
        if (args.length > 0 && args[0].equals("spanish")) {
            g.greeting = "hola mundo";
        } else if (args.length > 0 && args[0].equals("german")) {
            g.greeting = "hallo welt";
        } else if (args.length > 0 && args[0].equals("italian")) {
            g.greeting = "Ciao Mondo";
        }
        /**
         * @return the the language chosen for hello world
         */
        System.out.println(g.greeting);
    }
}
