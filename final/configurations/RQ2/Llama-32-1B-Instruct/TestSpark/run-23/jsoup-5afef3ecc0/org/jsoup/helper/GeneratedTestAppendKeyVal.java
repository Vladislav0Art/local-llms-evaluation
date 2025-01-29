package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv = new KeyVal("a", "1");
        String result = urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com/path?%20a=1", result);
    }

}