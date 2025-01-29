package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetValuesForParam {

    @Test
    public void testGetValuesForParam() {
        // setup
        String[] values = {"value1", "value2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "value1";
        assertEquals(expectedOutput, request.getValuesForParam("param1"));
    }

}