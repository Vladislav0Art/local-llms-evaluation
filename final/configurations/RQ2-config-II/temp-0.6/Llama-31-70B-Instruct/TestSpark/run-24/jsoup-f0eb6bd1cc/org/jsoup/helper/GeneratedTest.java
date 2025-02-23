package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URI;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void buildWithNullUrlTest() throws URISyntaxException, MalformedURLException {
        UrlBuilder builder = new UrlBuilder(null);
        URL actualUrl = builder.build();
        assertNull(actualUrl);
    }

    @Test
    public void buildWithNormalUrlTest() throws URISyntaxException, MalformedURLException {
        URL normalUrl = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(normalUrl);
        URL actualUrl = builder.build();
        assertEquals(normalUrl, actualUrl);
    }

    @Test
    public void buildWithMalformedUrlTest() throws URISyntaxException, MalformedURLException {
        URL malformedUrl = new URL("https://example.com%");
        UrlBuilder builder = new UrlBuilder(malformedUrl);
        URL actualUrl = builder.build();
        assertEquals(malformedUrl, actualUrl);
    }

}