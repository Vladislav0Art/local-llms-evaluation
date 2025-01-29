package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNullStringArray3 {

    @Test
    public void testAppendKeyValNullStringArray3() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv[] ks = new KeyVal[]{new KeyVal("", 0), null, new KeyVal("", null)};
        String result = urlBuilder.appendKeyVal(ks);
        assertEquals("https://example.com/path?%20a=1&b="",", result);
    }

}