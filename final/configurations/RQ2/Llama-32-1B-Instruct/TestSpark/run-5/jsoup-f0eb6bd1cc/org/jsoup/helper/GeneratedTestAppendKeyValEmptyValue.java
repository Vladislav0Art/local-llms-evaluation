package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValEmptyValue {

    @Test
    public void testAppendKeyValEmptyValue() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        String emptyValue = "";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", emptyValue);
        }});
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("https://www.example.com?key1="",", result.toString());
    }

}