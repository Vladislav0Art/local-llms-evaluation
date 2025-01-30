package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.Validate;
import org.jsoup.Connection;
import org.junit.Test;

import java.io.InputStream;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void buildNormalUrlTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL builtUrl = builder.build();
        assertEquals(url, builtUrl);
    }

    @Test
    public void buildUrlWithQueryStringTest() throws Exception {
        URL url = new URL("http://example.com?key=value");
        UrlBuilder builder = new UrlBuilder(url);
        URL builtUrl = builder.build();
        assertEquals(url, builtUrl);
    }

    @Test
    public void buildMalformedUrlTest() throws Exception {
        URL url = new URL("http:/example.com");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

    @Test
    public void buildUrlWithFragmentTest() throws Exception {
        URL url = new URL("http://example.com#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        URL builtUrl = builder.build();
        assertEquals(url, builtUrl);
    }

}