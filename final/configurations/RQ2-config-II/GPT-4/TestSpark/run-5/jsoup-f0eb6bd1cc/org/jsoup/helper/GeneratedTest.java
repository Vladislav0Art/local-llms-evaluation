package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection.KeyVal;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderValidURLTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);
    }

    @Test
    public void UrlBuilderNullURLTest() {
        URL url = null;
        UrlBuilder urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals(url, result);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        KeyVal keyVal = KeyVal.create("key1", "value1");
        urlBuilder.appendKeyVal(keyVal);
        URL result = urlBuilder.build();
        assertEquals(new URL("http://www.google.com?key1=value1"), result);
    }

    @Test
    public void appendKeyValInvalidEncodingTest() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        KeyVal keyVal = KeyVal.create("key1", "\uD800\uDC00"); // surrogate pair
        urlBuilder.appendKeyVal(keyVal);
    }

}