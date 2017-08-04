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

}