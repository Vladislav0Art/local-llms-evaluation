package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNull {

    @Test
    public void testAppendKeyValNull() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv = null;
        String result = urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?%20", result);
    }

}