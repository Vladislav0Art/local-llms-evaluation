package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.jupiter.api.Test;

public class GeneratedTestUrl {

    @Test
    public void testUrl() throws Exception {
        // Test valid URL
        String url = "http://example.com/path/to/resource?query=hello&key=value#anchor";
        URL u = new URL(url);
        assertEquals("http://example.com", u.getHost());
    }

}