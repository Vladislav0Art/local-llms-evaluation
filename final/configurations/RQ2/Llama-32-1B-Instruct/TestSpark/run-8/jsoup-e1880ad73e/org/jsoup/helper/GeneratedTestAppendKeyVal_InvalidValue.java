package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_InvalidValue {

    @Test
    public void testAppendKeyVal_InvalidValue() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value1";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        try {
            urlBuilder.appendKeyVal(key, value);
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
        }
    }

}