package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", "value1");
            put("key2", "value2");
        }});
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("https://www.example.com?key1=value1&key2=value2", result.toString());
    }

}