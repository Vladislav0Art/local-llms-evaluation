package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Objects;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/?query=myQuery"));
        assertNotNull(urlBuilder);
        assertTrue(urlBuilder.q.toString().contains("query=myQuery"));
    }

    @Test
    public void UrlBuilderConstructorNullQueryTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/"));
        assertNull(urlBuilder.q);
    }

    @Test
    public void buildTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URL url = urlBuilder.build();
        assertTrue(Objects.requireNonNull(url.toString()).endsWith("/"));
    }

    @Test
    public void buildWithPortTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com:8080"));
        URL url = urlBuilder.build();
        assertTrue(Objects.requireNonNull(url.toString()).endsWith(":8080/"));
    }

    @Test
    public void decodePartExceptionTest() throws Exception {
        URL url = new URL("http://[::1]");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void UrlBuilderConstructorNotNullQueryTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/?query=myQuery"));
        assertNotNull(urlBuilder);
        assertTrue(urlBuilder.q.toString().contains("query=myQuery"));
    }

    @Test
    public void buildWithoutPortTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URL url = urlBuilder.build();
        assertTrue(Objects.requireNonNull(url.toString()).endsWith("/"));
    }

}