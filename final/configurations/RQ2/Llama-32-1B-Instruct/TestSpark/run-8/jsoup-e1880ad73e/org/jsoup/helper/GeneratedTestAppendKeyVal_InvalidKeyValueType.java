package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_InvalidKeyValueType {

    @Test
    public void testAppendKeyVal_InvalidKeyValueType() throws UnsupportedEncodingException {
        String key = "key";
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        try {
            urlBuilder.appendKeyVal(1, "value");
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
        }
    }

}