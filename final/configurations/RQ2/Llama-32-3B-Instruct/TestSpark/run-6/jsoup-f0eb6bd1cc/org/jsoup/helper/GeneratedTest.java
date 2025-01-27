package org.jsoup.helper;

public class GeneratedTest {

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
    public void newUrlBuilderFromNullThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void buildUrlFromExistingUrlReturnsTheInputUrl() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals(url, result);
    }

    @Test
    public void buildUrlFromNullThrowsMalformedURLException() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(null).build());
    }

    @Test
    public void appendKeyValWithEmptyKeyValuePairsDoesNotModifyTheUrl() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(Connection.KeyVal.empty());
        assertSame(url, builder.build());
    }

    @Test
    public void appendKeyValWithNonEmptyKeyValuePairsModifiesTheUrlCorrectly() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(Connection.KeyVal.of("key", "value"));
        } catch (UnsupportedEncodingException e) {
            // handle exception
        }
        String expectedUrl = new URL("https://www.example.com/path/to/resource").toString();
        assertEquals(expectedUrl, builder.build().toString());
    }

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