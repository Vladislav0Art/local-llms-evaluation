package org.jsoup.helper;

public class GeneratedAppendKeyValWithEmptyValueDoesNotThrowUnsupportedEncodingException {

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

public class UnsupportedEncodingException extends Exception {
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

public class GeneratedTest {

    @Test
    public void appendKeyValWithEmptyValueDoesNotThrowUnsupportedEncodingException() {
        assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(new URL("http://example.com")).appendKeyVal(Connection.KeyVal.empty()));
    }

}