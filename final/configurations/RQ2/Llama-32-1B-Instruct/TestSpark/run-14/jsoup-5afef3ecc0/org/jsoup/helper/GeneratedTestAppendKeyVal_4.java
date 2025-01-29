package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyVal_4 {

    @Test
    public void testAppendKeyVal_4() {
        HttpUrl url = new HttpUrl("https://example.com/path?key=value");
        URL decodedUrl = decodeUrl(new HttpUrl("https://example.com/path?param=value").toString());
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(decodedUrl);
        assertEquals("https://example.com/path?key=value", builder.build().toURI());
    }

}