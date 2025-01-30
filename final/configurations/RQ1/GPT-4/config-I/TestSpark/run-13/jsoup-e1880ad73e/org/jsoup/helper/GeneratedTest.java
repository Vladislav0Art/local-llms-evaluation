package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderCreateTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        assertNotNull(new UrlBuilder(inputUrl));
    }

    @Test
    public void buildWithoutQueryAndFragmentTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, builder.build());
    }

    @Test
    public void buildWithQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, builder.build());
    }

    @Test
    public void buildWithFragmentTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, builder.build());
    }

    @Test
    public void buildWithQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com?query=value");
        assertEquals(expectedUrl, builder.build());
    }

    @Test
    public void buildWithFragmentTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com#fragment");
        assertEquals(expectedUrl, builder.build());
    }

}