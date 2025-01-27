package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    private static final String BASE_URL = "http://example.com";

    @Test
    public void testAppendKeyVal() throws URISyntaxException {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        Connection.KeyVal kv = new Connection.KeyValImpl("key", "value");
        builder.appendKeyVal(kv);
        URL url = builder.build();
        assertEquals(BASE_URL + "?key=value", url.toString());
        assertNull(url.getFragment());
    }
}

public class UrlBuilder {
    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public URL build() throws URISyntaxException {
        URI uri = new URI(url);
        return new URL(uri);
    }

    public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
        if (kv == null || kv.getKey() == null || kv.getValue() == null) {
            throw new UnsupportedEncodingException("Either key or value is missing");
        }
        StringBuilder query = new StringBuilder(url).replaceFirst("/$", "?");
        String[] keysAndValues = kv.getValue().split("&");
        for (String kvStr : keysAndValues) {
            if (!kvStr.isEmpty()) {
                String[] keyValue = kvStr.split("=");
                query.append(kv.getKey()).append("=").append(URLEncoder.encode(kvValue, UTF_8)).append("&");
            }
        }
        url = new URI(query.toString().replaceFirst("/$", "/")).toString();
    }

    public static class UrlBuilderImpl implements UrlBuilder {
        @Override
        public URL build() throws URISyntaxException {
            return new URL((new URI(getUrl())).getHost(), (new URI(getUrl())).getPort(), (new URI(getUrl())).getPath(), (new URI(getUrl())).getQuery(), (new URI(getUrl())).getFragment());
        }

        @Override
        public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
            // Implementation of appendKeyVal method
        }
    }
}

class Connection {
    public interface KeyVal {
        String getKey();

        String getValue();

        Connection.KeyVal keyVal(String key, String value);
    }

    static class KeyValImpl implements KeyVal {
        private String key;
        private String value;

        public KeyValImpl(String key, String value) {
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
    }

}