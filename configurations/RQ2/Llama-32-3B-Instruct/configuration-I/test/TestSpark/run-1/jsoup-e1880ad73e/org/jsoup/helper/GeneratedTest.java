package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.EnumSet;

public class GeneratedTest {

    @Test
    public void buildUrl() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        assertEquals(new URL("https://example.com"), builder.build());
    }

    @Test
    public void buildUrl_withQueryParams() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com?param=value"));
        assertEquals(new URL("https://example.com?param=value"), builder.build());
    }

    @Test
    public void appendKeyVal() {
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv);
        assertEquals("https://example.com?key=value", builder.build().toString());
    }

    @Test
    public void appendKeyVal_withMultipleParams() {
        Connection.KeyVal kv1 = Connection.KeyVal.create("key1", "value1");
        Connection.KeyVal kv2 = Connection.KeyVal.create("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals("https://example.com?key1=value1&key2=value2", builder.build().toString());
    }

    @Test
    public void appendKeyVal_withEmptyValue() {
        Connection.KeyVal kv = Connection.KeyVal.create("key", "");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv);
        assertEquals("https://example.com?key=", builder.build().toString());
    }

    @Test
    public void appendKeyVal_withNullValue() {
        Connection.KeyVal kv = Connection.KeyVal.create("key", null);
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        try {
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void appendKeyVal_withNullKey() {
        Connection.KeyVal kv = Connection.KeyVal.create(null, "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        try {
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void appendKeyVal_withNullValueAndNullKey() {
        Connection.KeyVal kv = Connection.KeyVal.create(null, null);
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        try {
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void appendMultipleKeyVals() {
        Connection.KeyVal kv1 = Connection.KeyVal.create("key1", "value1");
        Connection.KeyVal kv2 = Connection.KeyVal.create("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals("https://example.com?key1=value1&key2=value2", builder.build().toString());
    }

}