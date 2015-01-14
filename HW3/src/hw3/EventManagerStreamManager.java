/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.io.*;

/**
 *
 * @author kamonson17
 */
public class EventManagerStreamManager extends EventManager {

    EventManagerStreamManager() {
    }

    public void writeToStream() {
        File fWriteRN = new File("textRunningNumber");
        File fWrite = new File("textFileEvents");
        try {
            BufferedWriter wrtrRN = new BufferedWriter(new FileWriter(fWriteRN));
            wrtrRN.write(String.valueOf(getRunningNumber()));
            wrtrRN.close();
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(fWrite, true));
            wrtr.write(getEventNumber());
            wrtr.newLine();
            wrtr.write(getYear());
            wrtr.newLine();
            wrtr.write(getMonth());
            wrtr.newLine();
            wrtr.write(getDay());
            wrtr.newLine();
            wrtr.write(getEventTitle());
            wrtr.newLine();
            wrtr.write(getEventBody());
            wrtr.newLine();
            wrtr.write("endOfEvent");
            wrtr.newLine();
            wrtr.close();
        } catch (Exception ex) {
            System.out.println("Ah, crap....something whent wrong in the file i/o writing");
        }
    }

    public void readFromStream() {
        File fRead = new File("textFileEvents");
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(fRead));
            String line;
            while ((line = rdr.readLine()) != null) {
                if (line.isEmpty()) {
                    line = rdr.readLine();
                }
                if (line.contains("endOfEvent")) {
                    this.addEvent(getYear(), getMonth(), getDay(), getEventTitle(), getEventBody());
                    continue;
                } else {
                    if (line == null) {
                        break;
                    }
                    setEventNumber(line);
                    line = rdr.readLine();
                    setYear(line);
                    line = rdr.readLine();
                    setMonth(line);
                    line = rdr.readLine();
                    setDay(line);
                    line = rdr.readLine();
                    setEventTitle(line);
                    line = rdr.readLine();
                    setEventBody(line);
                }
            }
            rdr.close();
        } catch (Exception ex) {
            System.out.println("Ah, crap....something whent wrong in the file i/o reading");
        }
    }

    public void setRunningNumber() {
        File fRead = new File("textRunningNumber");
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(fRead));
            String line = rdr.readLine();
            if (fRead.exists()) {
                if (line.isEmpty()) {
                    setRunningNumber(0);
                } else {
                    setRunningNumber(Integer.parseInt(line));
                }

            } else {
                setRunningNumber(0);
            }
            rdr.close();
        } catch (Exception ex) {
            System.out.println("Ah, crap....something whent wrong in the file i/o reading runningNumber");
        }
    }
}
