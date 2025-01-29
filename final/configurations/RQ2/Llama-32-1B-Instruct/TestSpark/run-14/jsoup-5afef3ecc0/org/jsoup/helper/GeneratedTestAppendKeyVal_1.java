package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyVal_1 {

    @Test
    public void testAppendKeyVal_1() {
        HttpUrl url = new HttpUrl("https://example.com/path?key=value");
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("https://example.com/path?key=value", builder.build().toURI());
    }

}