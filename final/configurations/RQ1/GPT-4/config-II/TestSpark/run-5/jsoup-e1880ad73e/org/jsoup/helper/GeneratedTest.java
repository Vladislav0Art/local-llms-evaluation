package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void buildValidURLTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertEquals(url, urlBuilder.build());
    }

    @Test
    public void buildInvalidUrlTest() {
        URL url = Mockito.mock(URL.class);
        Mockito.when(url.getProtocol()).thenReturn("][");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValExistingBuilderTest() throws MalformedURLException {
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValNewBuilderTest() throws MalformedURLException {
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        URL url = new URL("http://www.google.com?q=something");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void buildUrlWithQueryStringTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com?q=somequery");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertEquals(url, urlBuilder.build());
    }

    @Test
    public void buildUrlWithFragmentTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertEquals(url, urlBuilder.build());
    }

    @Test
    public void buildUrlWithNonAsciiInPathTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com/äöüß");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertEquals(url, urlBuilder.build());
    }

}