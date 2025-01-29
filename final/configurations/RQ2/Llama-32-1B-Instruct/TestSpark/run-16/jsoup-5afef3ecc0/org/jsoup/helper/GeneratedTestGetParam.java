package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetParam {

    @Test
    public void testGetParam() {
        // setup
        String[] params = {"param1"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "param1";
        assertEquals(expectedOutput, request.getParam("param1"));
    }

}