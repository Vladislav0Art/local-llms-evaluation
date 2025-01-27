package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.IDN;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorWithoutUrlShouldThrowMalformedURLException() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void buildWithoutAnyParametersShouldReturnTheInputUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(inputUrl, outputUrl);
    }

    @Test
    public void buildWithQueryAndFragmentShouldReturnTheInputUrlWithQueryAndFragment() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?query=string#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(inputUrl, outputUrl);
    }

    @Test
    public void buildWithSchemeShouldReturnTheInputUrlWithScheme() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(inputUrl, outputUrl);
    }

    @Test
    public void appendKeyValShouldAppendKeyValueToTheUrl() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        String outputUrl = urlBuilder.build().toString();
        assertTrue(outputUrl.contains("?key=value"));
    }

    @Test
    public void appendKeyValWithEmptyValueShouldNotAppendKeyToTheUrl() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        String outputUrl = urlBuilder.build().toString();
        assertFalse(outputUrl.contains("?key="));
    }

    @Test
    public void appendKeyValWithNullValueShouldNotAppendKeyToTheUrl() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        String outputUrl = urlBuilder.build().toString();
        assertFalse(outputUrl.contains("?key="));
    }

    @Test
    public void appendKeyValWithSpaceValueShouldAppendKeyValueToTheUrl() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value with space");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        String outputUrl = urlBuilder.build().toString();
        assertTrue(outputUrl.contains("?key=value%20with%20space"));
    }

    @Test
    public void appendKeyValWithSpecialCharShouldAppendKeyValueToTheUrl() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        String specialChar = IDN.toAscii("é");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value" + specialChar);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        String outputUrl = urlBuilder.build().toString();
        assertTrue(outputUrl.contains("?key=value%20%C3%A9"));
    }

}