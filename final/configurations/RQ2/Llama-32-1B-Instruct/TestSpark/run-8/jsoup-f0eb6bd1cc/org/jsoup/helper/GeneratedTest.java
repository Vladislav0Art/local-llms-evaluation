package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void testBuild() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals(url, result.getProtocol() + "://" + result.getHost() + result.getPath());
    }

    @Test
    public void testAppendKeyVal() throws IOException {
        String key = "key";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        String result = builder.build().toString();
        assertNotNull(result);
        assertEquals("https://example.com?key=value", result);
    }

    @Test
    public void testAppendKeyValMalformed() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        try {
            String result = builder.build().toString();
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            // Expected
        }
    }

    @Test
    public void testAppendKeyValUrlDecode() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        String result = builder.build().toString();
        assertEquals("https%3A%2F%2Fexample.com%2Fkey=value", result);
    }

    @Test
    public void testAppendKeyValUnsupportedEncoding() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        try {
            String result = builder.build().toString();
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

    @Test
    public void testAppendKeyValNonExistingUrl() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder("https://example.com/non/existing-url");
        try {
            Connection.KeyVal kv = new Connection.KeyVal("key", "value");
            builder.appendKeyVal(kv);
            String result = builder.build().toString();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testAppendKeyValEmptyKeyValue() throws IOException {
        Connection.KeyVal kv = new Connection.KeyVal("");
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        String result = builder.build().toString();
        assertEquals("https%3A%2F%2Fexample.com", result);
    }

    @Test
    public void testAppendKeyValEmptyValue() throws IOException {
        Connection.KeyVal kv = new Connection.KeyVal("key");
        UrlBuilder builder = new UrlBuilder("https://example.com");
        builder.appendKeyVal(kv);
        String result = builder.build().toString();
        assertEquals("https%3A%2F%2Fexample.com%2Fkey", result);
    }

}