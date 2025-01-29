package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        urlBuilder.appendKeyVal(key, value);
        assertEquals("{\"key\":\"value\"}", urlBuilder.build().toURI().toString());
    }

}