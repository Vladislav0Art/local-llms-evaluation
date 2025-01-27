package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.util.DataUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void builderInitWithUrlTest() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertNotNull(builder);
    }

    @Test
    public void builderBuildUrlTest() throws URISyntaxException, MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        URI uri = builder.build().toURI();
        assertEquals("http://example.com", uri.toString());
    }

    @Test
    public void appendKeyValAppendKeyValueTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);
        assertFalse(builder.build().toString().isEmpty());
    }

    @Test
    public void appendKeyValAppendKeyWithoutValueTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", null);
        builder.appendKeyVal(kv);
        assertFalse(builder.build().toString().isEmpty());
    }

    @Test
    public void appendKeyValAppendKeyValueWithEmptyValueTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", "");
        builder.appendKeyVal(kv);
        assertTrue(builder.build().toString().contains("key="));
    }

    @Test
    public void appendKeyValAppendKeyValueWithEmptyQueryTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String query = "key=value";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("", query);
        builder.appendKeyVal(kv);
        assertTrue(builder.build().toString().contains("?key="));
    }

    @Test
    public void appendKeyValAppendKeyValueWithNonEmptyValueTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);
        assertTrue(builder.build().toString().contains("key=value"));
    }

    @Test
    public void appendKeyValAppendKeyValueWithMultipleValuesTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String query = "key1=value1&key2=value2";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("", query);
        builder.appendKeyVal(kv);
        assertTrue(builder.build().toString().contains("?key1="));
    }

    @Test
    public void appendQueryValueTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String query = "key=value";
        builder.appendQueryValue(query);
        assertTrue(builder.build().toString().contains("?key=value"));
    }

}

class StringUtil {
    public static boolean hasNonEmptyValue(String url) {
        return !url.isEmpty();
    }
}

public class UrlBuilder {
    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
        String value = "value";
        if (kv == null) {
            return;
        }
        // implementation
    }

    public void appendQueryValue(String query) throws UnsupportedEncodingException {
        // implementation
    }

    public URL build() {
        // implementation
        return url;
    }
}

public class Connection {
    public static class KeyVal implements java.lang.Object {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public KeyVal(String key, Object value) {
        }

        // implementation
    }

}