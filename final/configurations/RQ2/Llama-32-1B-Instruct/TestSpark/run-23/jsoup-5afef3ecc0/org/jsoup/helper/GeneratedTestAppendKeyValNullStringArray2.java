package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNullStringArray2 {

    @Test
    public void testAppendKeyValNullStringArray2() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        KeyVal kv[] ks = new KeyVal[]{new KeyVal("", 0), new KeyVal("", null)};
        String result = urlBuilder.appendKeyVal(ks);
        assertEquals("https://example.com/path?%20a="",b=2", result);
    }

}