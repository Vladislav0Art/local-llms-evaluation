package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.UnknownHostException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private Connection.KeyVal mockKeyVal(String key, String value) {
        return new Connection.KeyVal() {
            @Override
            public String key() {
                return key;
            }

            @Override
            public String value() {
                return value;
            }

            @Override
            public Connection.KeyVal key(String key) {
                return this;
            }

            @Override
            public Connection.KeyVal value(String value) {
                return this;
            }
        };
    }

    @Test
    public void buildUrlWithNonAsciiCharactersTest() throws Exception {
        URL url = new URL("http", "www.èxample.com", "/pàgé1.html");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.xn--xample-9ua.com/p%C3%A0g%C3%A91.html", builtUrl.toString());
    }

    @Test
    public void buildUrlWithPortTest() throws Exception {
        URL url = new URL("http", "www.example.com", 8080, "/page1.html");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com:8080/page1.html", builtUrl.toString());
    }

    @Test
    public void buildUrlWithQueryTest() throws Exception {
        URL url = new URL("http", "www.example.com", "/page1.html?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com/page1.html?param1=value1", builtUrl.toString());
    }

    @Test
    public void buildUrlWithAnchorTest() throws Exception {
        URL url = new URL("http", "www.example.com", "/page1.html#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com/page1.html#anchor", builtUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http", "www.example.com", "/page1.html");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(mockKeyVal("key1", "value1"));
        URL builtUrl = urlBuilder.build();
        assertEquals("http://www.example.com/page1.html?key1=value1", builtUrl.toString());
    }

    @Test
    public void appendKeyValToNullQueryTest() throws Exception {
        URL url = new URL("http", "www.example.com", "/page1.html");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(null);
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws Exception {
        URL url = new URL("http", "www.exampleß.com", "/page1.html");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(mockKeyVal("key1", "value1"));
    }

}