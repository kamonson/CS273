package hw4;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Subclass of reviews, reads and writes to stream accepts an arraylist from GUI
 * modifies it and sends it back ready to use
 *
 * @author Kyle
 */
public class Reviews_Stream extends Reviews {

    Reviews_Stream() {
    }
//PT -- javadoc? -4
    public void writeToStream() {
        File fWrite = new File("Restaurant_Reviewer.txt");
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(fWrite, true)); //append         
            wrtr.write(this.getName());
            wrtr.newLine();
            wrtr.write(this.getAddress());
            wrtr.newLine();
            wrtr.write(this.getNotes());
            wrtr.newLine();
            wrtr.write(this.getRating());
            wrtr.newLine();
            wrtr.write("EndOfReview");
            wrtr.newLine();
            wrtr.close();
        } catch (Exception Ex) {
            System.out.println("Ah, crap...something went wrong with file writing.");
        }
    }

    public void readFromStream(ArrayList<Reviews> AL) {
        File fRead = new File("Restaurant_Reviewer.txt");
        AL.clear();
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(fRead));
            String line;
            while ((line = rdr.readLine()) != null) {
                if (line.isEmpty()) {
                    line = rdr.readLine();
                }
                if (line.contains("EndOfReview")) {
                    Reviews r = new Reviews(this.getName(), this.getAddress(), this.getNotes(), this.getRating());
                    AL.add(r);
                    continue;
                }
                this.setName(line);
                line = rdr.readLine();
                this.setAddress(line);
                line = rdr.readLine();
                this.setNotes(line);
                line = rdr.readLine();
                this.setRating(line);
            }
            rdr.close();
        } catch (Exception Ex) {
            System.out.println("Ah, crap...something went wrong with file reading.");
        }
    }
}
