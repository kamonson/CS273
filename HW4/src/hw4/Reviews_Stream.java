package hw4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kyle
 */
public class Reviews_Stream extends Reviews {

    Reviews_Stream() {
    }

    public void writeToStream() {
        File fWrite = new File("Restaurant_Reviewer.txt");
        try {
//            BufferedWriter RnWrtr = new BufferedWriter(new FileWriter(fWrite));
//            RnWrtr.write("!@#@!" + String.valueOf(this.getRunningNumber())); //overwrite
//            RnWrtr.close();
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

    public void readFromStream() {
        File fRead = new File("Restaurant_Reviewer.txt");
        try {
//            BufferedReader rdrRN = new BufferedReader(new FileReader(fRead));
//            String rNline;
//
//            while ((rNline = rdrRN.readLine()) != null) {
//                Pattern p = Pattern.compile("!@#@!");
//                Matcher m = p.matcher(rNline);
//                while (m.find()) {
//                    this.setRunning(Integer.parseInt(rNline));
//                }
//            }
//            rdrRN.close();
            BufferedReader rdr = new BufferedReader(new FileReader(fRead));
            String line;
            while ((line = rdr.readLine()) != null) {
                if (line.isEmpty()) {
                    line = rdr.readLine();
                }
                if (!line.contains("EndOfReview")) {
                    Reviews r = new Reviews(this.getName(), this.getAddress(), this.getNotes(), this.getRating());
                    this.arrayList.add(r);
                }
//                if (line.contains("!@#@!(*)")) {
//                    line = rdr.readLine();
//                }
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
