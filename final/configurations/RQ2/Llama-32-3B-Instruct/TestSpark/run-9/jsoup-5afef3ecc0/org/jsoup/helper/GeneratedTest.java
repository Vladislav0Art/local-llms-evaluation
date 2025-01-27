package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testUrlBuilder() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);

        // Test appendKeyVal method
        builder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
        System.out.println(builder.build());

        // Test build method
        System.out.println(builder.build());
    }
}

public class UrlBuilder {
    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public void appendKeyVal(Connection.KeyVal kv) throws Exception {
        System.out.println("Appending key-value pair: " + kv);
    }

    public String build() throws Exception {
        return url.toString();
    }
}

public class Connection {
    public static class KeyVal implements java.util.Map.Entry<String, String> {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String setValue(String value) {
            throw new UnsupportedOperationException();
        }
    }

}