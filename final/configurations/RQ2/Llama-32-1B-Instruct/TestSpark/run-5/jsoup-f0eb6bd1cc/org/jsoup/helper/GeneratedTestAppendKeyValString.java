package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValString {

    @Test
    public void testAppendKeyValString() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        String string = "value1";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", string);
        }});
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("https://www.example.com?key1=value1", result.toString());
    }

}