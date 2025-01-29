package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyVal_6 {

    @Test
    public void testAppendKeyVal_6() {
        HttpUrl url = new HttpUrl("https://example.com/path?param=value");
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(null, builder.build().toURI());
    }

}