package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNullString {

    @Test
    public void testAppendKeyValNullString() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        String nullString = null;
        try {
            urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
                put("key1", nullString);
            }});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

}