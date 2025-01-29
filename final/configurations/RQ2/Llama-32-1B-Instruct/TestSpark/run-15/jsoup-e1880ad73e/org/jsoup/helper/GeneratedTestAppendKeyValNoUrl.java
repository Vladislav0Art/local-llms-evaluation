package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyValNoUrl {

    @Test
    public void testAppendKeyValNoUrl() {
        String key = "key";
        String value = "value";
        assertEquals("https://example.com/path?!" + key + "=" + value, new UrlBuilder(key, value).appendKeyVal("key", value));
    }

}