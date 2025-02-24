package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        URL actual = urlBuilder.build();
        assertEquals("http://example.com", actual.toString());
    }

    @Test
    public void buildWithQueryTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL actual = urlBuilder.build();
        assertEquals("http://example.com?key=value", actual.toString());
    }

    @Test
    public void buildWithQueryWithSpacesTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value with spaces"));
        URL actual = urlBuilder.build();
        assertEquals("http://example.com?key=value+with+spaces", actual.toString());
    }

    @Test
    public void buildWithQueryWithPlusTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value+with+plus"));
        URL actual = urlBuilder.build();
        assertEquals("http://example.com?key=value%2Bwith%2Bplus", actual.toString());
    }

    @Test
    public void buildWithQueryWithAmpersandTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value&with&ampersand"));
        URL actual = urlBuilder.build();
        assertEquals("http://example.com?key=value%26with%26ampersand", actual.toString());
    }

}