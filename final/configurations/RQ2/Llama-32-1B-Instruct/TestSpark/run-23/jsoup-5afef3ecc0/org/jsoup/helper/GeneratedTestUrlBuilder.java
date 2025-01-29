package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URLBuilder urlBuilder = new URLBuilder(new URL(inputUrl));
        assertEquals("https:", urlBuilder.build().getScheme());
        assertEquals("path", urlBuilder.build().getPath());
        assertEquals("/", urlBuilder.build().toString().split("/")[0]);
        assertTrue(urlBuilder.build().toString().contains("?"));
        assertTrue(urlBuilder.build().toString().contains("&"));
        assertEquals(2, urlBuilder.build().toString().length() - 1);
    }

}