package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void UrlBuilderValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void UrlBuilderNullUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void buildWithValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void buildWithEmptyUrlTest() throws MalformedURLException {
        URL url = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void buildWithNullUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValValidTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");
        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(null);
    }

}