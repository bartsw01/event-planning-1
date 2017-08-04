package models;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mariathomas on 8/4/17.
 */
public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Live Band");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newEvent_getnumGuest_50() {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Live Band");
        assertEquals(50, testEvent.getNumGuest());
    }

    @Test
    public void newEvent_gettypeFood_Asian() {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Live Band");
        assertEquals("Asian", testEvent.getTypeFood());
    }

    @Test
    public void newEvent_gettypeBeverage_nonAlcohol() {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Live Band");
        assertEquals("Non-alcohol", testEvent.getTypeBeverage());
    }

    @Test
    public void newEvent_gettypeEntertainment_LiveBand() {
        Event testEvent = new Event (50, "Asian", "Non-alcohol", "Live Band");
        assertEquals("Live Band", testEvent.getTypeEntertainment());
    }


}