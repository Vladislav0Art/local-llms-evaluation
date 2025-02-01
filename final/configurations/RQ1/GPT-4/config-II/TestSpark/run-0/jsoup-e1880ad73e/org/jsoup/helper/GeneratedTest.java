package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertNotNull(newUrl);
        assertEquals("http://example.com", newUrl.toString());
    }

    @Test
    public void buildMalformedURLExceptionTest() throws MalformedURLException {
        URL url = new URL("invalidUrl");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        URL newUrl = urlBuilder.build();
        assertNotNull(newUrl);
        assertTrue(newUrl.toString().contains("?key=value"));
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Connection.KeyVal.create("key", "value\uDC00");
        urlBuilder.appendKeyVal(keyVal);
    }

}