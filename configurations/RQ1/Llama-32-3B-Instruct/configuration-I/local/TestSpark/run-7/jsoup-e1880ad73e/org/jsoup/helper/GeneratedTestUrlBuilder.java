package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.jupiter.api.Test;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() throws Exception {
        // Test UrlBuilder
        String url = "http://example.com/path/to/resource?query=hello&key=value#anchor";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        assertEquals("http://example.com", urlBuilder.toString());
    }

}