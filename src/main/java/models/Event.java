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
        if(typeFood.equals("American")){
            foodPrice = (8*numGuest);
        }else if(typeFood.equals("Mexican")){
            foodPrice = (9*numGuest);
        }else if(typeFood.equals("European")){
            foodPrice = (10*numGuest);
        }else if(typeFood.equals("Asian")){
            foodPrice = (11*numGuest);
        }
        return foodPrice;
    }

    public int getBeveragePrice() {
        if(typeBeverage.equals("Non-alcohol")){
            beveragePrice = (2*numGuest);
        }else if(typeBeverage.equals("Alcohol")){
            beveragePrice = (4*numGuest);
        }
        return beveragePrice;
    }

    public int getEntertainmentPrice() {
        if(typeEntertainment.equals("DJ")){
            entertainmentPrice = 500;
        }else if(typeEntertainment.equals("Band")){
            entertainmentPrice = 700;
        }
        return entertainmentPrice;
    }

    public int getTotalCost() {
        return totalCost;
    }



}
