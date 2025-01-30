package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

    @Test
    public void buildUrlWithQueryStringTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com/query?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL url = new URL("ftp://invalid_url");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}