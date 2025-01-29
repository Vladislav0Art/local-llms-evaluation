package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyVal_2 {

    @Test
    public void testAppendKeyVal_2() {
        URL url = new URL("https://example.com/path?key=value");
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("https://example.com/path?key=value", builder.build().toURI());
    }

}