package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValEmptyString {

    @Test
    public void testAppendKeyValEmptyString() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        String emptyString = "";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", emptyString);
        }});
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("https://www.example.com?key1="",", result.toString());
    }

}