package org.jsoup.helper;

public class GeneratedTestAssertEqualsInputUrlResult {

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

    private Connection connection;

    public UrlBuilder(Connection connection) {
        this.connection = connection;
    }

    public void setConnection(Connection newConnection) {
        this.connection = newConnection;
    }

    public URL build() throws URISyntaxException, MalformedURLException {
        return inputUrl;
    }

    public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
        if (kv == null) {
            throw new UnsupportedEncodingException();
        }
    }

    private URL inputUrl;

    public void setInputUrl(URL inputUrl) {
        this.inputUrl = inputUrl;
    }
}

public class GeneratedTest {

    @org.junit.Before
    public void setup() {
        Connection connection = new Connection.Connection.KeyVal();
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        urlBuilder.setInputUrl(new URL("https://example.com"));
    }

    private Connection connection;
    private UrlBuilder urlBuilder;

    @org.junit.Test
    public void testWhenInputUrl() throws URISyntaxException, MalformedURLException {
        org.jsoup.helper.TestUtils.when(urlBuilder.build()).thenReturn(urlBuilder.inputUrl.toURI());
    }

    @Test
    public void testAssertEqualsInputUrlResult() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal();
        connection.setKeyVal(kv);
        org.junit.Assert.assertEquals(urlBuilder.inputUrl, urlBuilder.build().toURI());
    }

}