package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void build_urlWithoutParams() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        assertEquals("http://example.com", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyVal_noException() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new java.util.HashMap<>());
        assertNull(urlBuilder.build().getHeader("Content-Type"));
    }

    @Test
    public void appendKeyVal_withException() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        urlBuilder.appendKeyVal(new java.util.HashMap<>());
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

    @Test
    public void build_urlWithParams() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com?a=1&b=2");
        assertEquals("http://example.com?a=1&b=2", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyVal_withParams() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com?a=1&b=2");
        urlBuilder.appendKeyVal(new java.util.HashMap<>());
        assertEquals("a=1&a=2", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyValWithUnsupportedEncodingException() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com?a=1&b=2");
        urlBuilder.appendKeyVal(new java.util.HashMap<>());
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

    @Test
    public void build_urlWithEmptyKeyValMap() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com?a=1&b=2");
        assertEquals("http://example.com?a=1&b=2", urlBuilder.build().toString());
    }

}