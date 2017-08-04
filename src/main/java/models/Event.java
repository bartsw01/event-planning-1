package models;

/**
 * Created by mariathomas on 8/4/17.
 */
public class Event {

    private int numGuest;
    private String typeFood;
    private String typeBeverage;
    private String typeEntertainment;

    public int getNumGuest() {
        return numGuest;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public String getTypeBeverage() {
        return typeBeverage;
    }

    public String getTypeEntertainment() {
        return typeEntertainment;
    }

    public Event(int numGuest, String typefood, String typeBeverage, String typeEntertainment) {
        this.numGuest =  numGuest;
        this.typeFood = typefood;
        this.typeBeverage = typeBeverage;
        this.typeEntertainment = typeEntertainment;
    }




}
