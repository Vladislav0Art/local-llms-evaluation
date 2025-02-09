package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorNonEmptyURLTest() throws MalformedURLException {
        URL testUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void urlBuilderConstructorNullURLTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void buildNonEmptyURLTest() throws UnknownHostException, MalformedURLException {
        URL testUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        assertNotNull(urlBuilder.build());
    }

    @Test
    public void buildNullURLTest() throws UnknownHostException, MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNull(urlBuilder.build());
    }

    @Test
    public void appendKeyValNonEmptyTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL resultUrl = urlBuilder.build();
        assertTrue(resultUrl.toString().contains("key=value"));
    }

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        urlBuilder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value\uFFFF");
        urlBuilder.appendKeyVal(kv);
    }

}