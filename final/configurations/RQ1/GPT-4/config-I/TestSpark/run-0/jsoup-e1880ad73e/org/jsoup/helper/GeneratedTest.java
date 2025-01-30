package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void buildValidUrlTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

    @Test
    public void buildUrlWithQueryTest() throws Exception {
        URL url = new URL("http://www.example.com?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

    @Test
    public void buildInvalidUrlTest() throws Exception {
        URL url = new URL("http:////www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);

        String expected = "http://www.example.com?key=value";
        String actual = urlBuilder.build().toString();

        assertEquals(expected, actual);
    }

    @Test
    public void buildUrlWithMultipleQueriesTest() throws Exception {
        URL url = new URL("http://www.example.com?one=1");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);

        String expected = "http://www.example.com?one=1&key=value";
        String actual = urlBuilder.build().toString();

        assertEquals(expected, actual);
    }

    @Test
    public void buildUrlWithFragmentTest() throws Exception {
        URL url = new URL("http://www.example.com#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.build());
    }

    @Test
    public void buildWithPunycodeDomainTest() throws Exception {
        URL url = new URL("http://www.äëïöü.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertTrue(urlBuilder.build().toString().contains("xn--"));
    }

}