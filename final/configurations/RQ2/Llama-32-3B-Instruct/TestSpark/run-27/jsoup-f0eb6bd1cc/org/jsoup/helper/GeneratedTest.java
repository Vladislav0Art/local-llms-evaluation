package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

import org.jsoup.Connection.KeyVal;

public class GeneratedTest {

    @Test
    public void constructor() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertNotNull(builder);
    }

    @Test
    public void build() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String url = builder.build().toString();
        assertEquals("http://example.com", url);
    }

    @Test
    public void appendKeyVal_testAddingKeyVal() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "val");
        builder.appendKeyVal(kv);
        String url = builder.build().toString();
        assertTrue(url.contains("key=val"));
    }

    @Test
    public void appendKeyVal_testAddingMultipleKeyVal() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "val1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "val2");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        String url = builder.build().toString();
        assertTrue(url.contains("key1=val1&key2=val2"));
    }

    @Test
    public void appendKeyVal_testNonStringKeyValue() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", 123L);
        try {
            builder.appendKeyVal(kv);
            assert false;
        } catch (UnsupportedEncodingException e) {
            assertEquals("UTF-8 encoding exception", e.getMessage());
        }
    }

    @Test
    public void appendKeyVal_testNonStringKeyValueMultiple() throws URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", 123L);
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", 456L);
        try {
            builder.appendKeyVal(kv1);
            builder.appendKeyVal(kv2);
            assert false;
        } catch (UnsupportedEncodingException e) {
            assertEquals("UTF-8 encoding exception", e.getMessage());
        }
    }

}