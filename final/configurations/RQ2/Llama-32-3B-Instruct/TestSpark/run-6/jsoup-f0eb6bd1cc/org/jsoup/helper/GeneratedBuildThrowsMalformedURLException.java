package org.jsoup.helper;

public class GeneratedBuildThrowsMalformedURLException {

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
    public void buildThrowsMalformedURLException() throws MalformedURLException {
        URL url = null;
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.build();
            assert false;
        } catch (MalformedURLException e) {
            assertEquals(0, 1);
        }
    }

}