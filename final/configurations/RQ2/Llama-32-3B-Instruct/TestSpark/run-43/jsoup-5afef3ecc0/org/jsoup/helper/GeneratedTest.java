package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void buildUrlFromValidInput() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals("http://example.com", result.toString());
    }

    @Test
    public void buildUrlWithQueryParams() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com?param1=value1&param2=value2");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals("http://example.com?param1=value1&param2=value2", result.toString());
    }

    @Test
    public void buildUrlWithEncodedQueryParams() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com?param1=value1&param2=value2");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals("http://example.com?param1=value1%26param2=value2", result.toString());
    }

    @Test
    public void appendKeyValWithValidKeyVal() throws UnsupportedEncodingException {
        Mockito.when(org.jsoup.internal.StringUtil.KeyVal.class.newInstance()).thenReturn(new org.jsoup.helper.DataUtil.KeyValImpl("key", "value"));
        UrlBuilder urlBuilder = new UrlBuilder(null);
        org.jsoup.Connection.KeyVal keyVal = (org.jsoup.Connection.KeyVal) Mockito.mock(org.jsoup.Connection.KeyVal.class);
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("key=value", keyVal.toString());
    }

    @Test
    public void appendKeyValWithNullKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        org.jsoup.Connection.KeyVal keyVal = null;
        try {
            urlBuilder.appendKeyVal(keyVal);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void appendKeyValWithInvalidKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        org.jsoup.Connection.KeyVal keyVal = new ConnectionKeyVal("", "");
        try {
            urlBuilder.appendKeyVal(keyVal);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    public void appendKVWithValidUrl() {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        org.jsoup.Connection.KeyVal keyVal = new ConnectionKeyVal("key", "value");
        try {
            urlBuilder.appendKeyVal(keyVal);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

    @Test
    public void appendKVWithInvalidUrl() {
        URL url = null;
        UrlBuilder urlBuilder = new UrlBuilder(url);
        org.jsoup.Connection.KeyVal keyVal = new ConnectionKeyVal("key", "value");
        try {
            urlBuilder.appendKeyVal(keyVal);
            fail("Expected Exception");
        } catch (Exception e) {
        }
    }

}