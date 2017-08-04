package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mariathomas on 8/4/17.
 */
public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Band");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getNumGuest_50() {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Band");
        assertEquals(50, testEvent.getNumGuest());
    }

    @Test
    public void newEvent_getTypeFood_Asian() {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Band");
        assertEquals("Asian", testEvent.getTypeFood());
    }

    @Test
    public void newEvent_getTypeBeverage_nonAlcohol() {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Band");
        assertEquals("Non-alcohol", testEvent.getTypeBeverage());
    }

    @Test
    public void newEvent_getTypeEntertainment_LiveBand() {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Band");
        assertEquals("Band", testEvent.getTypeEntertainment());
    }

    @Test
    public void newEvent_getGuestPrice_100() {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Band");
        assertEquals(100, testEvent.getGuestPrice());
    }

}