package models;

/**
 * Created by mariathomas on 8/4/17.
 */
public class Event {

    private int numGuest;
    private String typeFood;
    private String typeBeverage;
    private String typeEntertainment;

    private int totalCost;
    private int guestPrice;
    private int foodPrice;
    private int beveragePrice;
    private int entertainmentPrice;

    public Event(int numGuest, String typefood, String typeBeverage, String typeEntertainment) {
        this.numGuest =  numGuest;
        this.typeFood = typefood;
        this.typeBeverage = typeBeverage;
        this.typeEntertainment = typeEntertainment;
    }

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


    public int getGuestPrice() {
        if (numGuest<100){
            guestPrice = numGuest * 2;
        } else if (numGuest<200){
            guestPrice = numGuest * 2;
            System.out.println("Coupon Code ($50 OFF): FREE50");
        } else if (numGuest<300){
            guestPrice = numGuest * 2;
            System.out.println("Coupon Code ($100 OFF): FREE100");
        } else{
            guestPrice = numGuest * 2;
            System.out.println("Coupon Code (Free Entertainment): FREEDJ");
        }
        return guestPrice;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public int getBeveragePrice() {
        return beveragePrice;
    }

    public int getEntertainmentPrice() {
        return entertainmentPrice;
    }

    public int getTotalCost() {
        return totalCost;
    }



}
