package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlBuilderBuildTest {

    @Test
    public void UrlBuilderBuildTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("https://www.example.com", urlBuilder.build().toString());
    }

}