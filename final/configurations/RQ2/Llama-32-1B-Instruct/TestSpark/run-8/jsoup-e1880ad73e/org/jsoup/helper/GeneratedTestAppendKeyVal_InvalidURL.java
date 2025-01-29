package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_InvalidURL {

    @Test
    public void testAppendKeyVal_InvalidURL() throws UnsupportedEncodingException {
        String key = "key";
        URL url = new URL("invalid:https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(key, "value");
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
        }
    }

}