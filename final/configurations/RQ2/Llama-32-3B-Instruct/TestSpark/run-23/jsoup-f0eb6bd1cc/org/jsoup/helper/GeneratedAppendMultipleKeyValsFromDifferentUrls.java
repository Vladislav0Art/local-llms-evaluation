package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedAppendMultipleKeyValsFromDifferentUrls {

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public Connection.KeyVal toKeyVal() {
            return new org.jsoup.Connection.KeyVal(key, value);
        }
    }

    @Test
    public void appendMultipleKeyValsFromDifferentUrls() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        KeyVal kv1 = new KeyVal("key1", "value1");
        KeyVal kv2 = new KeyVal("key2", "value2");
        builder.appendKeyVal(kv1.toKeyVal());
        Url url = new URL("https://other.com");
        KeyVal kv3 = new KeyVal("key3", "value3");
        builder.appendKeyVal(new org.jsoup.Connection.KeyVal("key3", url.getHost(), kv3.value));
        assertNotNull(builder.build());
        assertTrue(builder.build().getQuery().contains("key1=value1"));
    }

}