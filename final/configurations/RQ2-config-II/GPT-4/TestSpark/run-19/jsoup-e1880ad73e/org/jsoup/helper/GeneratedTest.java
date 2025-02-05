package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        new UrlBuilder(null);
    }

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL buildUrl = urlBuilder.build();
        assertEquals(inputUrl, buildUrl);
    }

    @Test
    public void buildUninitializedUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValValidTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        URL buildUrl = urlBuilder.build();
        assertEquals("http://example.com?key=value", buildUrl.toString());
    }

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "valueé");
        urlBuilder.appendKeyVal(keyVal);
    }

}