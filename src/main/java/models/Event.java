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

    public String code;

    private int discountedCost;

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
        } else if (numGuest<300){
            guestPrice = numGuest * 2;
            code = "FREE100";
        } else if(numGuest>=300){
            guestPrice = numGuest * 2;
            code = "FREEDJBAND";
        }
        return guestPrice;
    }

    public int getFoodPrice() {
        if(typeFood.equalsIgnoreCase("American")){
            foodPrice = (8*numGuest);
        }else if(typeFood.equalsIgnoreCase("Mexican")){
            foodPrice = (9*numGuest);
        }else if(typeFood.equalsIgnoreCase("European")){
            foodPrice = (10*numGuest);
        }else if(typeFood.equalsIgnoreCase("Asian")){
            foodPrice = (11*numGuest);
        }
        return foodPrice;
    }

    public int getBeveragePrice() {
        if(typeBeverage.equalsIgnoreCase("Non-alcohol")){
            beveragePrice = (2*numGuest);
        }else if(typeBeverage.equalsIgnoreCase("Alcohol")){
            beveragePrice = (4*numGuest);
        }
        return beveragePrice;
    }

    public int getEntertainmentPrice() {
        if(typeEntertainment.equalsIgnoreCase("DJ")){
            entertainmentPrice = 500;
        }else if(typeEntertainment.equals("Band")){
            entertainmentPrice = 700;
        }
        return entertainmentPrice;
    }

    public int getTotalCost() {
        totalCost = getGuestPrice() + getFoodPrice() + getBeveragePrice() + getEntertainmentPrice();
        return totalCost;
    }

    public int getDiscountedCost(String code) {
        if(code.equalsIgnoreCase("FREE100")){
            discountedCost = getTotalCost() - 100;
        }else if(code.equalsIgnoreCase("FREEDJBAND")){
            discountedCost = getTotalCost() - getEntertainmentPrice();
        }else {
            System.out.println("Invalid Code");
            discountedCost = getTotalCost();
        }
        return discountedCost;
    }
}
