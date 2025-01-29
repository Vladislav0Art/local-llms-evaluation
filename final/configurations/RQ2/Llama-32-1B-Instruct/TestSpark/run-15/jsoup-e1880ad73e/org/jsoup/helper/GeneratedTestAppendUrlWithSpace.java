package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendUrlWithSpace {

    @Test
    public void testAppendUrlWithSpace() {
        String input = "key=value";
        assertEquals("https://example.com/path?key=value", new UrlBuilder(input).appendUrlWithSpace());
    }

}