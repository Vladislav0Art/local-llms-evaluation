package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValPreservesNonAsciiCharacters {

    public static class ConnectionKeyVal {
        private String key;
        private String val;

        public ConnectionKeyVal(String key, String val) {
            this.key = key;
            this.val = val;
        }

        public String getKey() {
            return key;
        }

        public String getVal() {
            return val;
        }
    }

    public static class DataUtilKeyVal extends ConnectionKeyVal {
        private String decodedVal;

        public DataUtilKeyVal(String key, String val) {
            super(key, val);
            this.decodedVal = val;
        }

        public String getDecodedVal() {
            return decodedVal;
        }
    }

    public static class UrlBuilder {
        private URL u;
        private HashMap<String, String> q;

        public UrlBuilder(URL u) {
            this.u = u;
            this.q = new HashMap<>();
        }

        public void appendKeyVal(ConnectionKeyVal kv) {
            if (kv.getVal() != null) {
                q.put(kv.getKey(), kv.getVal());
            }
        }

        private String decodePart(String encodedVal) {
            return encodedVal; // TO DO implement decoding
        }

        public URL build() {
            return u;
        }
    }

    @Test
    public void appendKeyValPreservesNonAsciiCharacters() {
        String urlStr = "http://example.com/äöü?abc=def#ghi";
        URL u = new URL(urlStr);
        UrlBuilder builder = new UrlBuilder(u);
        ConnectionKeyVal kv = new DataUtilKeyVal("abc", String.valueOf(Character.toChars(228)));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q.toString());
        assertTrue(builder.q.toString().contains("%C3%A6%C3%B6%C3%BC"));
    }

}