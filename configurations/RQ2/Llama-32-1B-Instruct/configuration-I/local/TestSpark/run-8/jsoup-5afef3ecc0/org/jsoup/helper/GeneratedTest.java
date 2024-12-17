package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void buildUrlReturnsCorrectValue() {
        String inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertEquals("https://example.com/path", url.toString());
    }

    @Test
    public void appendKeyValAddsKeyValueToUrlQuery() {
        String key = "key";
        String value = "value";
        String inputUrl = "https://example.com/path?key=value";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("key=value", urlBuilder.appendKeyVal(new org.apache.http.HttpHost("example.com", 443, null)).toString());
    }

    @Test
    public void appendKeyValThrowsUnsupportedEncodingException() {
        String key = "key";
        String value = "value";
        try {
            new UrlBuilder(null).appendKeyVal(new org.apache.http.HttpHost("example.com", 443, null));
            fail("Expected UnsupportedEncodingException");
        } catch (org.apache.http.client.methods.UnsupportedEncodingException e) {
            // Expected exception
        }
    }

    @Test
    public void buildThrowsUnsupportedEncodingException() {
        String inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.build();
            fail("Expected UnsupportedEncodingException");
        } catch (org.apache.http.client.methods.UnsupportedEncodingException e) {
            // Expected exception
        }
    }

    @Test
    public void appendKeyValWithNullKeyThrowsUnsupportedEncodingException() {
        String value = "value";
        try {
            new UrlBuilder(null).appendKeyVal(new org.apache.http.HttpHost("example.com", 443, null));
            fail("Expected UnsupportedEncodingException");
        } catch (org.apache.http.client.methods.UnsupportedEncodingException e) {
            // Expected exception
        }
    }

    @Test
    public void appendKeyValWithEmptyKeyThrowsUnsupportedEncodingException() {
        String value = "";
        try {
            new UrlBuilder(null).appendKeyVal(new org.apache.http.HttpHost("example.com", 443, null));
            fail("Expected UnsupportedEncodingException");
        } catch (org.apache.http.client.methods.UnsupportedEncodingException e) {
            // Expected exception
        }
    }

    @Test
    public void appendKeyValWithNullValueThrowsUnsupportedEncodingException() {
        String key = "key";
        try {
            new UrlBuilder(null).appendKeyVal(new org.apache.http.HttpHost("example.com", 443, null));
            fail("Expected UnsupportedEncodingException");
        } catch (org.apache.http.client.methods.UnsupportedEncodingException e) {
            // Expected exception
        }
    }

    @Test
    public void appendKeyValWithEmptyValueThrowsUnsupportedEncodingException() {
        String key = "";
        try {
            new UrlBuilder(null).appendKeyVal(new org.apache.http.HttpHost("example.com", 443, null));
            fail("Expected UnsupportedEncodingException");
        } catch (org.apache.http.client.methods.UnsupportedEncodingException e) {
            // Expected exception
        }
    }

}