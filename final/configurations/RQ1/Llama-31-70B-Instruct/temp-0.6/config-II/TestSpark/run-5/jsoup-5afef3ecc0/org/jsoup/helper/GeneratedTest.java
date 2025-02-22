package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedTest {

    @Test
    public void buildWithNullQuery() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNull(urlBuilder.q);
        URL expectedUrl = new URL("https://xn--example-hva.com");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void buildWithQuery() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("key=value", urlBuilder.q.toString());
        URL expectedUrl = new URL("https://xn--example-hva.com?key=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void buildWithoutRef() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNull(urlBuilder.u.getRef());
        URL expectedUrl = new URL("https://xn--example-hva.com");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void buildWithRef() throws MalformedURLException {
        URL inputUrl = new URL("https://example.com#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("ref", urlBuilder.u.getRef());
        URL expectedUrl = new URL("https://xn--example-hva.com#ref");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}