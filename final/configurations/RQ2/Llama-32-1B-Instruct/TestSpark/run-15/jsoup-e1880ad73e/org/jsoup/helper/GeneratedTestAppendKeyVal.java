package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        String input = "key=value";
        assertEquals("https://example.com/path?key=value", new UrlBuilder(input).appendKeyVal("key", "value"));
    }

}