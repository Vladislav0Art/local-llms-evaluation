package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.net.MalformedURLException;

public class GeneratedTest {

    @Test
    public void buildUrlFromUrlTest() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        URL url = builder.build();
        assertEquals("http://example.com", url.toString());
    }

    @Test
    public void appendKeyValWithEmptyValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.build().getQuery());
        assertEquals("", builder.build().getQuery());
    }

    @Test
    public void appendKeyValWithNonEmptyValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.build().getQuery());
        assertEquals("key=value", builder.build().getQuery());
    }

    @Test
    public void appendKeyValWithMultipleValuesTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertNotNull(builder.build().getQuery());
        assertEquals("key1=value1&key2=value2", builder.build().getQuery());
    }

    @Test
    public void buildWithNullProtocolSchemeTest() {
        UrlBuilder builder = new UrlBuilder(new URL(null, "http://example.com"));
        assertNull(builder.build().getProtocol());
    }

    @Test
    public void appendKeyValWithInvalidValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
    }

}