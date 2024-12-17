package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;

public class GeneratedTestAppendKeyValUnsupportedEncodingException {

    @Test
    public void testAppendKeyValUnsupportedEncodingException() {
        KeyVal kv = new KeyVal("key", "value");
        URLBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
            assertEquals("Input stream could not be closed.", e.getMessage());
        }
    }

}