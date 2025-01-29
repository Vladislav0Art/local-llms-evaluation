package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_WithMultipleKeys {

    @Test
    public void testAppendKeyVal_WithMultipleKeys() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?a=1&b=2"));
        assertEquals("https://example.com/path?a=1,b=2", urlBuilder.appendKeyVal(new org.jsoup.KeyVal("a", "1")).appendKeyVal(new org.jsoup.KeyVal("b", "2")).getKey());
    }

}