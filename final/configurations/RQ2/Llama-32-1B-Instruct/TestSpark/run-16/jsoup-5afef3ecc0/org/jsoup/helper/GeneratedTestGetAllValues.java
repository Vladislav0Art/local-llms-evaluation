package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetAllValues {

    @Test
    public void testGetAllValues() {
        // setup
        String[] values = {"value1", "value2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllValues(values));
    }

}