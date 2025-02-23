package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedTest {

    @Test
    public void build() throws Exception {
        // Valid URL
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com/"));
        URL url = urlBuilder.build();
        assertNotNull(url);

        // Invalid URL
        urlBuilder = new UrlBuilder(new URL("invalid url"));
        url = urlBuilder.build();
        assertNull(url);
    }

}