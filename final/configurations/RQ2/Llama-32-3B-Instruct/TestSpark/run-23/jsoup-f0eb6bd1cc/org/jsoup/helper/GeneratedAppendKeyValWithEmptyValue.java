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

public class GeneratedAppendKeyValWithEmptyValue {

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
    public void appendKeyValWithEmptyValue() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        KeyVal kv = new KeyVal("key", "");
        builder.appendKeyVal(kv.toKeyVal());
        assertNotNull(builder.build());
        assertTrue(builder.build().getQuery().contains("key="));
    }

}