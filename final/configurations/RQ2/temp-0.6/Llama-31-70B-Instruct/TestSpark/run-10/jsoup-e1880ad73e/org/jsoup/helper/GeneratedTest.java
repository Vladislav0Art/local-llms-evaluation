package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        URL expectedUrl = new URL("https://example.com");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}