package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        URL input = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(input);
        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void constructorNullInputTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void buildTest() {
        URL input = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(input);
        Assert.assertNotNull(urlBuilder.build());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL input = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(input);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        Assert.assertTrue(urlBuilder.build().toString().contains("key=value"));
    }

    @Test
    public void appendKeyValNullKeyValTest() throws UnsupportedEncodingException {
        URL input = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(input);
        urlBuilder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL input = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(input);
        Connection.KeyVal kv = new Connection.KeyVal("key", "é");
        urlBuilder.appendKeyVal(kv);
    }

}