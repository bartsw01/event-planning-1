package models;

/**
 * Created by mariathomas on 8/4/17.
 */
public class Event {

    private int numGuest;
    private String typeFood;
    private String typeBeverage;
    private String typeEntertainment;

    public Event(int guest, String food, String beverage, String entertainment) {
        numGuest =  guest;
        typeFood = food;
        typeBeverage = beverage;
        typeEntertainment = entertainment;
    }
}
