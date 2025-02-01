package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedBuildWithNonAsciiPathTest {

    @Test
    public void buildWithNonAsciiPathTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com/%20path");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL normalizedURL = urlBuilder.build();
        assertEquals("http://example.com/ path", normalizedURL.toString());
    }

}