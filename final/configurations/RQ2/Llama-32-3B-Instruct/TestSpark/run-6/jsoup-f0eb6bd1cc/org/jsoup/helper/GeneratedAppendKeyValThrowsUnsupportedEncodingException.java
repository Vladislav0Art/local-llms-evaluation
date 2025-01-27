package org.jsoup.helper;

public class GeneratedAppendKeyValThrowsUnsupportedEncodingException {

    public UnsupportedEncodingException() {
        super();
    }
}

public class UrlBuilder {
    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
        // implement logic here
    }

    public URL build() throws MalformedURLException {
        return url;
    }
}

public class Connection {
    public static class KeyVal {
        private String key;
        private Object value;

        public static KeyVal empty() {
            return new KeyVal("", null);
        }

        public static KeyVal of(String key, Object value) {
            return new KeyVal(key, value);
        }
    }
}

public class GeneratedTest {

    @Test
    public void appendKeyValThrowsUnsupportedEncodingException() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(Connection.KeyVal.empty());
            assert false;
        } catch (UnsupportedEncodingException e) {
            assertEquals(0, 1);
        }
    }

}