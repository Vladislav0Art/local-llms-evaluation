package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.u);
    }

    @Test
    public void urlBuilderConstructorWithQueryTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void buildUrlTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

    @Test
    public void buildUrlWithQueryAndRefTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com?key=value#reference");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.key()).thenReturn("key");
        when(keyVal.value()).thenReturn("value");
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws MalformedURLException {
        URL url = new URL("http://www.测试.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void buildUrlMalformedURLExceptionTest() throws MalformedURLException {
        URL url = new URL("http://");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void normalizeQueryTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com?key=value space");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("value+space", urlBuilder.normalizeQuery(url.getQuery()));
    }

    @Test
    public void normalizeRefTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com#ref space");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("ref%20space", urlBuilder.normalizeRef(url.getRef()));
    }

}