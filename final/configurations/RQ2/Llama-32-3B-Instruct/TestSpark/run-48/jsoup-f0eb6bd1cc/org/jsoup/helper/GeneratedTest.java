package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal() {
        String scheme = "http";
        String host = "example.com";
        int port = 80;

        Connection.Builder builder = new Connection.Builder()
                .url(new URL(scheme + "://" + host + ":" + port))
                .appendKeyVal("key", "value")
                .appendQueryParams(Map.of("param1", "value1"), Map.of("param2", "value2"));

        Document doc = builder.get();

        System.out.println(doc.toString());
    }
}

class UrlBuilder {
    private Connection conn;

    public UrlBuilder(String url) {
        this.conn = new Connection.Builder().url(new URL(url)).build();
    }

    public void appendKeyVal(String key, String value) {
        KeyVal kv = new KeyVal(key, StringUtil.quote(value));
        conn.appendkv(kv);
    }

    public void appendUrlParam(String param, String value) {
        this.conn.appendQueryParams(Map.of(param, value), Map.of());
    }

    public void appendQueryParams(Map<String, Object> params, Map<String, Object> values) {
        this.conn.appendQueryParams(params, values);
    }

    public URL getUrl() {
        return (URL) conn.url();
    }
}

class StringUtil {
    public static String quote(String str) {
        // implementation of quote method
        return str;
    }

}