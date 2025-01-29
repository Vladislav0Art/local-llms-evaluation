package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNullStringArray {

    @Test
    public void testAppendKeyValNullStringArray() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv[] ks = new KeyVal[]{new KeyVal("a", 1), new KeyVal("", 0)};
        String result = urlBuilder.appendKeyVal(ks);
        assertEquals("https://example.com/path?%20a=1&b="",", result);
    }

}