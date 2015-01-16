/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * core of the program contains HashMaps Events, Days, Month, Year used to look
 * up smoothly adds events clearHM used to clear hashmap, was being used to try
 * and fix duplication of events on look up, no success getdays events returns
 * array of events for that day, getdaysevents body/title returns text of
 * body/title slew of set/gets
 *
 * @author kamonson17
 */
public class EventManager {

    HashMap<String, Events> hashEvents = new HashMap<String, Events>();
    HashMap<String, HashMap> hashDays = new HashMap<String, HashMap>();
    HashMap<String, HashMap> hashMonth = new HashMap<String, HashMap>();
    HashMap<String, HashMap> hashYear = new HashMap<String, HashMap>();
    private String year = "none";
    private String month = "none";
    private String day = "none";
    private String eventTitle = "none";
    private String eventBody = "none";
    private String eventNumber = "none";
    private int RunningNumber = 0;

    public void addEvent(String Y, String M, String D, String ET, String EB) {
        this.RunningNumber += 1; //this makes it start at 1
        Events e = new Events(Y, M, D, ET, EB, RunningNumber);//does the add
        //cascade of maps containing maps for easy look up
        hashEvents.put(e.getEventNumber(), e);
        hashDays.put(e.getDay(), hashEvents);
        hashMonth.put(e.getMonth(), hashDays);
        hashYear.put(e.getYear(), hashMonth);
        this.eventNumber = e.getEventNumber();
        this.year = e.getYear();
        this.month = e.getMonth();
        this.day = e.getDay();
        this.eventTitle = e.getEventTitle();
        this.eventBody = e.getEventBody();
    }

    public void clearHM() {
        hashEvents.clear();
    }

    public ArrayList getDaysEventsTitle(String Y, String M, String D) {
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i <= getRunningNumber(); i++) {
            if (hashEvents.get(Y + M + D + String.valueOf(i)) == null) {
                continue;
            } else {
                array.add(hashEvents.get(Y + M + D + String.valueOf(i)).getEventTitle());
            }
        }
        return array;
    }

    public ArrayList getDaysEventsBody(String Y, String M, String D) {
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i <= getRunningNumber(); i++) {
            if (hashEvents.get(Y + M + D + String.valueOf(i)) == null) {
                continue;
            } else {
                array.add(hashEvents.get(Y + M + D + String.valueOf(i)).getEventBody());
            }
        }
        return array;
    }

    public ArrayList<Events> getDaysEvents(String Y, String M, String D) {
        ArrayList<Events> array = new ArrayList<Events>();
        for (int i = 0; i <= getRunningNumber(); i++) {
            String s = Y + M + D + String.valueOf(i);
            if (hashEvents.get(s) == null) {
                continue;
            } else {
                array.add(hashEvents.get(Y + M + D + String.valueOf(i)));
            }
        }
        return array;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventBody() {
        return eventBody;
    }

    public void setEventNumber(String EN) {
        this.eventNumber = EN;
    }

    public void setYear(String Y) {
        this.year = Y;
    }

    public void setMonth(String M) {
        this.month = M;
    }

    public void setDay(String D) {
        this.day = D;
    }

    public void setEventTitle(String ET) {
        this.eventTitle = ET;
    }

    public void setEventBody(String EB) {
        this.eventBody = EB;
    }

    public void setRunningNumber(int RN) {
        this.RunningNumber = RN;
    }

    public int getRunningNumber() {
        return RunningNumber;
    }
}
