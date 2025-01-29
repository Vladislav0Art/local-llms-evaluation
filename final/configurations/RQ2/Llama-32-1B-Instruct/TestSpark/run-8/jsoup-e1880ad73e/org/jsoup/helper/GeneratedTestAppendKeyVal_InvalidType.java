package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_InvalidType {

    @Test
    public void testAppendKeyVal_InvalidType() {
        String key = "key";
        String value = "value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        try {
            urlBuilder.appendKeyVal(null, value);
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
        }
    }

}