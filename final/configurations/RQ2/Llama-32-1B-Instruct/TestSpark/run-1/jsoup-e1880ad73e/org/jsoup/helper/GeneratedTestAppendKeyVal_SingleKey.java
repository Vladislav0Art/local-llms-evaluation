package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_SingleKey {

    @Test
    public void testAppendKeyVal_SingleKey() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String key = "test";
        urlBuilder.appendKeyVal(java.util.Map.of(key, "value"));
        assertEquals("http://example.com/test=value", urlBuilder.build().toString());
    }

}