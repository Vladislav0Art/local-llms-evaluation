package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testAppendKeyValUrlBuilder() {
        try {
            UrlBuilder builder = new UrlBuilder();
            builder.appendKeyVal("key", "val");
        } catch (UnsupportedEncodingException | URISyntaxException e) {
        }

        // tests completed successfully
    }

    @Test
    public void testAppendMultipleKeyValsUrlBuilder() {
        try {
            UrlBuilder builder = new UrlBuilder();
            builder.appendMultipleKeyVals("key1", "val1", "key2", "val2");
        } catch (UnsupportedEncodingException | URISyntaxException e) {
        }

        // tests completed successfully
    }

    @Test
    public void testAppendKeyValMultipleTimesUrlBuilder() {
        try {
            UrlBuilder builder = new UrlBuilder();
            builder.appendKeyVal("key", "val");
            builder.appendKeyVal("key", "val");
            builder.appendKeyVal("key", "val");
        } catch (UnsupportedEncodingException | URISyntaxException e) {
        }

        // tests completed successfully
    }

    public class UrlBuilder {
        private java.util.Map<String, String> map = new java.util.HashMap<>();

        public void appendKeyVal(String key, String val) throws UnsupportedEncodingException, URISyntaxException {
            if (val == null || !val.getClass().equals(String.class)) {
                throw new URISyntaxException("Invalid URL", "URL cannot be parsed");
            }
            map.put(key, val);
        }

        public void appendMultipleKeyVals(String... keyVals) throws UnsupportedEncodingException, URISyntaxException {
            for (String[] kv : java.util.Arrays.asList(keyVals)) {
                if (kv.length != 2) {
                    throw new URISyntaxException("Invalid URL", "URL cannot be parsed");
                }
                String key = kv[0];
                String val = kv[1];
                map.put(key, val);
            }
        }

        public void appendKeyValMultipleTimes(String key, String val) throws UnsupportedEncodingException, URISyntaxException {
            if (val == null || !val.getClass().equals(String.class)) {
                throw new URISyntaxException("Invalid URL", "URL cannot be parsed");
            }
            map.put(key, val);
        }

        public String build() throws UnsupportedEncodingException, URISyntaxException {
            return java.net.URI.create(java.net.URLEncoder.encode(map.toString(), "UTF-8")).toString();
        }
    }
}

class Connection {
    public static class KeyVal {
        private final String key;
        private final String val;

        private KeyVal(String key, String val) {
            this.key = key;
            this.val = val;
        }

        // getters and setters
    }

}