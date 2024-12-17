package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestConnectionKeyVal {

    @Test
    public void testConnectionKeyVal() {
        Connection.KeyVal kv = new Connection.KeyVal("key1", "value1");
        System.out.println(kv.getKey());
        System.out.println(kv.getValue());
    }
}

class UrlBuilder {
    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public void appendToAscii(String str, boolean appendQuery, StringBuilder sb) {
        if (appendQuery) {
            // implementation
        } else {
            // implementation
        }
    }

    public static String decodePart(String encoded) {
        // implementation
        return "";
    }

    @Override
    public String toString() {
        return url;
    }
}

class Connection {
    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

}