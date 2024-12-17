package org.jsoup.helper;

public class GeneratedTest {

    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public URL getUrl() {
        return new URL(url);
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
    public void build_InvalidUrl_ThrowsNullPointerException() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        NullPointerException expectedException = new NullPointerException("Input URL is null");
        org.junit.Assert.fail(expectedException.getMessage());
    }

}