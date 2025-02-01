package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.jsoup.Connection.KeyVal.create;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("https://www.example.com/?key1=val1&key2=val2");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedURL = new URL("https://www.example.com/?key1=val1&key2=val2");
        assertEquals(expectedURL, urlBuilder.build());
    }

    @Test
    public void buildWithInvalidURLTest() throws Exception {
        URL url = new URL("https:/www.exampl e.com/?key1=val1&key2=val2"); //Invalid URL
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.example.com/?key1=val1");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = create("key2", "val2");
        urlBuilder.appendKeyVal(kv);
        URL expectedURL = new URL("https://www.example.com/?key1=val1&key2=val2");
        assertEquals(expectedURL, urlBuilder.build());
    }

    @Test
    public void appendKeyValWithUnsupportedEncodingTest() throws Exception {
        URL url = new URL("https://www.example.com/?key1=val1");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = create("kéy2", "vål2"); //Key and value that can't be encoded in UTF-8
        urlBuilder.appendKeyVal(kv);
        urlBuilder.build();
    }

    @Test
    public void UrlBuilderTest() throws Exception {
        URL url = new URL("https://www.example.com/?key1=val1&key2=val2");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

}