package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetParams {

    @Test
    public void testGetParams() {
        // setup
        String[] params = {"param1", "param2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'>";
        assertEquals(expectedOutput, request.getParams(params));
    }

}