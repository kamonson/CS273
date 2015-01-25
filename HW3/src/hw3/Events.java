/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 * Events contain a eventNumber (Year+Month+day+runningnumber = key for hashMap)
 * Overrides toString which was not used
 *
 * @author kamonson17
 */
public class Events {

    private String eventNumber = "None"; //Hash Key
    private String year = "None";
    private String month = "None";
    private String day = "None";
    private String eventTitle = "None";
    private String eventBody = "None";

    Events() {
    }

    Events(String Y, String M, String D, String ET, String EB, int RunningNumber) {
        setYear(Y);
        setMonth(M);
        setDay(D);
        setEventTitle(ET);
        setEventBody(EB);
        setEventNumber(RunningNumber);
    }

    //PT -- need javadoc. -4
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

    public String getEventNumber() {
        return eventNumber;
    }

    public void setYear(String Y) {
        this.year = Y;
    }

    public void setMonth(String M) {
        this.month = M;
    }

    public void setDay(String D) {
        this.day = D;
        this.day = D;
    }

    public void setEventTitle(String ET) {
        this.eventTitle = ET;
    }

    public void setEventBody(String EB) {
        this.eventBody = EB;
    }

    public void setEventNumber(int RunningNumber) {
        this.eventNumber = year + month + day + String.valueOf(RunningNumber);
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s: Title: %s Body: %s", month, day, year, eventTitle, eventBody);
    }
;
}
