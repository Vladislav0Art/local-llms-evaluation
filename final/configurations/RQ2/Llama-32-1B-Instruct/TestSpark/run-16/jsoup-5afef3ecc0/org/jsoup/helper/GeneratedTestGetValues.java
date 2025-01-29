package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetValues {

    @Test
    public void testGetValues() {
        // setup
        String[] values = {"value1", "value2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'>";
        assertEquals(expectedOutput, request.getValues(values));
    }

}