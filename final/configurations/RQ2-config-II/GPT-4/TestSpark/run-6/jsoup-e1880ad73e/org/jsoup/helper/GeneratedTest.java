package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.jsoup.Connection.KeyVal.create;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        assertEquals(url, urlBuilder.build());
    }

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        new UrlBuilder(null);
    }

    @Test
    public void UrlBuilderBuildTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        assertEquals(url, urlBuilder.build());
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = create("key", "value");

        urlBuilder.appendKeyVal(kv);

        String expected = "https://www.example.com?key=value";
        assertEquals(expected, urlBuilder.build().toString());
    }

    @Test
    public void appendKeyValNullKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        urlBuilder.appendKeyVal(null);
    }

}