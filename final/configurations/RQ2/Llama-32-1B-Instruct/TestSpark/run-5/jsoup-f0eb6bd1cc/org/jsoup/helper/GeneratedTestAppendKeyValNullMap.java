package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNullMap {

    @Test
    public void testAppendKeyValNullMap() {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        java.util.HashMap<String, String> nullMap = null;
        try {
            urlBuilder.appendKeyVal(nullMap);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected exception
        }
    }

}