package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValEmptyMap {

    @Test
    public void testAppendKeyValEmptyMap() {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {
        });
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("https://www.example.com", result.toString());
    }

}