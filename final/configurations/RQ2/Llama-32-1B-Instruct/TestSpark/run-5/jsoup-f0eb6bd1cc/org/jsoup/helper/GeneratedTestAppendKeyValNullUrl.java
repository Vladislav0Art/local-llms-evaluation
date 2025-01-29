package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNullUrl {

    @Test
    public void testAppendKeyValNullUrl() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        String nullUrl = null;
        try {
            urlBuilder.appendKeyVal(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

}