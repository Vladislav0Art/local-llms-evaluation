package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetAllParamsForParam {

    @Test
    public void testGetAllParamsForParam() {
        // setup
        String[] params = {"param1", "param2"};

        // execute the test
        public Request request = new PublicRequest();
        String expectedOutput = "<input type='hidden' name='param1' value='value1'><input type='hidden' name='param2' value='value2'>";
        assertEquals(expectedOutput, request.getAllParamsForParam("param1"));
    }

}