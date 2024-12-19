package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public URL getUrl() {
        return url;
    }
}

public class Connection {
    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }
}

public class GeneratedTest {

    @Test
    public void testUrlBuilder() {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(url, urlBuilder.getUrl());
    }

}