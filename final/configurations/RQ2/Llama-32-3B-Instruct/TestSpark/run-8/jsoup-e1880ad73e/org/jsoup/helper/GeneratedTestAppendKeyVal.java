package org.jsoup.helper;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestAppendKeyVal {

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "KeyVal{" +
                    "key='" + key + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public static class UrlBuilder {
        private URL url;
        private Map<String, String> params;

        public UrlBuilder(URL url) {
            this.url = url;
            this.params = new HashMap<>();
        }

        public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
            params.put(kv.key, kv.value);
        }

        public void appendParam(String key, String value) throws UnsupportedEncodingException {
            params.put(key, value);
        }

        public UrlBuilder addQuery(String param) throws UnsupportedEncodingException {
            params.put(param, "");
            return this;
        }

        public URL build() throws UnsupportedEncodingException {
            StringBuilder sb = new StringBuilder(url.toString());
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (sb.charAt(sb.length() - 1) == '?') {
                    sb.append("&");
                } else {
                    sb.append('?');
                }
                sb.append(entry.getKey()).append('=').append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            return new URL(sb.toString());
        }

        @Override
        public String toString() {
            return url.toString();
        }
    }
}

import java.net.URL;
import java.util.HashMap;

public class StringUtil {

    public static String toString(Object obj) {
        return obj.toString();
    }

    public static String URLEncode(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, StandardCharsets.UTF_8);
    }
}

import org.junit.Test;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void testAppendKeyVal() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        try {
            builder.appendKeyVal(kv);
            System.out.println(builder.toString()); // prints: http://example.com?param=value
        } catch (UnsupportedEncodingException e) {
        }
    }

}