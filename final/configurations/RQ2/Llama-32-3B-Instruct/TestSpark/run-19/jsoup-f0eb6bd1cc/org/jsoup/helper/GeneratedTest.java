package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void buildUrlFromNull() {
        assertFalse(new UrlBuilder(null).build().toString());
    }

    @Test
    public void buildUrlFromEmptyString() {
        assertEquals("", new UrlBuilder("").build().toString());
    }

    @Test
    public void appendKeyValWithEncodedValue() throws UnsupportedEncodingException, URISyntaxException {
        String encodedValue = URLEncoder.encode("key", DataUtil.UTF_8);
        Connection.KeyVal kv = Connection.KeyVal.valueOf("key", encodedValue);
        new UrlBuilder(new URL("http://example.com")).appendKeyVal(kv).build().toString();
    }

    @Test
    public void appendKeyValWithNonEncodedValue() throws UnsupportedEncodingException, URISyntaxException {
        String nonEncodedValue = "value";
        Connection.KeyVal kv = Connection.KeyVal.valueOf("key", nonEncodedValue);
        new UrlBuilder(new URL("http://example.com")).appendKeyVal(kv).build().toString();
    }

    @Test
    public void appendKeyValWithNullValue() throws UnsupportedEncodingException, URISyntaxException {
        String nullValue = null;
        Connection.KeyVal kv = Connection.KeyVal.valueOf("key", nullValue);
        new UrlBuilder(new URL("http://example.com")).appendKeyVal(kv).build().toString();
    }

    @Test
    public void appendKeyValWithEmptyString() throws UnsupportedEncodingException, URISyntaxException {
        String emptyStringValue = "";
        Connection.KeyVal kv = Connection.KeyVal.valueOf("key", emptyStringValue);
        new UrlBuilder(new URL("http://example.com")).appendKeyVal(kv).build().toString();
    }

    @Test
    public void appendKeyValWithUrl() throws MalformedURLException, URISyntaxException {
        String urlValue = "http://example.com/path?query=value";
        Connection.KeyVal kv = Connection.KeyVal.valueOf("key", urlValue);
        new UrlBuilder(new URL("http://example.com")).appendKeyVal(kv).build().toString();
    }

    @Test
    public void appendQueryToUrl() throws MalformedURLException, URISyntaxException {
        String queryValue = "query=value";
        URI uri = new URI("http://example.com/path").resolve(queryValue);
        new UrlBuilder(new URL(uri)).build().toString();
    }

    @Test
    public void appendFragmentToUrl() throws MalformedURLException, URISyntaxException {
        String fragmentValue = "#fragment";
        URI uri = new URI("http://example.com/path?query=value#fragment");
        new UrlBuilder(new URL(uri)).appendKeyVal(Connection.KeyVal.valueOf("_", fragmentValue)).build().toString();
    }

    @Test
    public void appendFragmentToEmptyUrl() throws MalformedURLException, URISyntaxException {
        String emptyStringValue = "";
        URI uri = new URI("http://example.com/path?query=value");
        new UrlBuilder(new URL(uri)).appendKeyVal(Connection.KeyVal.valueOf("_", emptyStringValue)).build().toString();
    }

    @Test
    public void appendKeyValWithMultipleQueryParameters() throws MalformedURLException, URISyntaxException {
        String queryValue = "query1=value1&query2=value2";
        URI uri = new URI("http://example.com/path").resolve(queryValue);
        new UrlBuilder(new URL(uri)).appendKeyVal(Connection.KeyVal.valueOf("_", queryValue)).build().toString();
    }

}