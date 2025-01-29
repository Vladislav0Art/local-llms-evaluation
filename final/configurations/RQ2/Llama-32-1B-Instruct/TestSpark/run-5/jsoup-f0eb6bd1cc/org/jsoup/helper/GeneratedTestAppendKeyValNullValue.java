package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNullValue {

    @Test
    public void testAppendKeyValNullValue() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        String nullValue = null;
        try {
            urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
                put("key1", nullValue);
            }});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

}