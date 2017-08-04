import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Created by mariathomas on 8/4/17.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Funtastic Event Planner! ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        try {
            String name = bufferedReader.readLine();
            System.out.println(("Hello " + name + ", How many guests are you expecting?"));
            String stringGuests = bufferedReader.readLine();
            Integer numOfGuests = parseInt(stringGuests);
            System.out.println(name + ", what type of food do you prefer? Please enter any of the following choices: American, Mexican, European, Asian.");
            String typeOfFood = bufferedReader.readLine();
            System.out.println(name + ", what type of beverage do you like? Please enter either 'alcohol' or 'non-alcohol'.");
            String typeOfBev = bufferedReader.readLine();
            System.out.println(name + ", what type of entertainment do you like? Please enter either 'DJ' or 'Band'.");
            String typeOfEnt =  bufferedReader.readLine();

            Event newEvent = new Event (numOfGuests, typeOfFood, typeOfBev, typeOfEnt);


            if (numOfGuests >= 300) {
                System.out.println("******------Coupon Code (Free Entertainment): FREEDJBAND------******");
            } else if (numOfGuests >= 200){
                System.out.println("******------Coupon Code ($100 OFF): FREE100------******");
            }

            System.out.println("Number of Guests:       " + numOfGuests);
            System.out.println("----------------------------------$ " + newEvent.getGuestPrice());
            System.out.println("Type of Food:           " + typeOfFood);
            System.out.println("----------------------------------$ " + newEvent.getFoodPrice());
            System.out.println("Type of Beverage:       " + typeOfBev);
            System.out.println("----------------------------------$ " + newEvent.getBeveragePrice());
            System.out.println("Type of Entertainment:  " + typeOfEnt);
            System.out.println("----------------------------------$ " + newEvent.getEntertainmentPrice());
            System.out.println();
            System.out.println("TOTAL: ========================== $ " + newEvent.getTotalCost());

            if (numOfGuests >=200) {
                System.out.println("You qualify for special coupon. Please enter code for a discounted price: ");
                String inputCode = bufferedReader.readLine();
                System.out.println("Your new discounted price is: ");
                System.out.println("DISCOUNTED TOTAL: =============== $ "  + newEvent.getDiscountedCost(inputCode));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
