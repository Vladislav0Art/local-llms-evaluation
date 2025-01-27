package org.jsoup.helper;

public class GeneratedTest {

    public static class KeyVal {
        private String key = "key";
        private String value = "value";

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}

public class UrlBuilder {

    private URL inputUrl;

    public UrlBuilder(URL inputUrl) {
        this.inputUrl = inputUrl;
    }

    public void setInputUrl(URL inputUrl) {
        this.inputUrl = inputUrl;
    }

    public String build() throws URISyntaxException, MalformedURLException {
        return inputUrl.toURI().toString();
    }

    public void appendKeyVal(KeyVal kv) throws UnsupportedEncodingException {
        if (kv == null) {
            throw new UnsupportedEncodingException();
        }
    }
}

public class GeneratedTest {

    @org.junit.Before
    public void setup() {
        URL url = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.setInputUrl(url);
    }

    private URL inputUrl;

    @org.junit.Test
    public void testWhenInputUrl() throws URISyntaxException, MalformedURLException {
        org.jsoup.helper.TestUtils.when(urlBuilder.build()).thenReturn(inputUrl.toURI());
    }

    @Test
    public void newUrlBuilder() {
        assert urlBuilder != null;
    }

}