package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    // UrlBuilder instance creation test

    @Test
    public void urlBuilderConstructorValidUrlTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        assertEquals(urlBuilder.getClass(), UrlBuilder.class);
    }

    @Test
    public void urlBuilderConstructorInvalidUrlTest() throws MalformedURLException {
        new UrlBuilder(new URL("htt:/google"));
    }

    @Test
    public void buildValidTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        URL url = urlBuilder.build();
        assertEquals("http://www.google.com", url.toString());
    }

    @Test
    public void appendKeyValValidTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL url = urlBuilder.build();
        assertEquals("http://www.google.com?key=value", url.toString());
    }

    @Test
    public void appendKeyValInvalidEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        Connection.KeyVal kv = new Connection.KeyVal("\u1111", "value");
        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValWithTrailingSlashTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com/"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL url = urlBuilder.build();
        assertEquals("http://www.google.com/?key=value", url.toString());
    }

}