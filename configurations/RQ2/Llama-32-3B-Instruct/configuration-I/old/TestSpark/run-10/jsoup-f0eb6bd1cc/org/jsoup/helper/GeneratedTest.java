package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void newUrlBuilderTest() {
        // No assertions here, just create an instance of UrlBuilder
    }

    @Test
    public void buildUrlTest_WithValidUrlInput() {
        String url = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals(url, result.toString());
    }

    @Test
    public void buildUrlTest_WithInvalidUrlInput_throwsException() {
        try {
            String invalidUrl = "invalid://url";
            UrlBuilder urlBuilder = new UrlBuilder(new URL(invalidUrl));
            urlBuilder.build();
            fail("Expected exception not thrown");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void appendKeyValTest_WithValidKeyValPairs() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals(2, urlBuilder.build().getProtocol().length());
    }

    @Test
    public void appendKeyValTest_WithMultipleKeyValPairs() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        assertEquals(3, urlBuilder.build().getProtocol().length());
    }

    @Test
    public void appendKeyValTest_WithInvalidKeyValPairs_throwsException() {
        Connection.KeyVal invalidKv = new Connection.KeyVal("invalid key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(invalidKv);
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

    @Test
    public void appendQueryParamsTest_WithValidQueryParams() throws UnsupportedEncodingException {
        String queryParams = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(Connection.KeyVal.ConnectionKeyVAL(parameters, queryParams));
        assertEquals(2, urlBuilder.build().getQuery().length());
    }

    @Test
    public void appendQueryParamsTest_WithMultipleValidQueryParams_throwsException() {
        String queryParams1 = "key1=value1";
        String queryParams2 = "key2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(Connection.KeyVal.ConnectionKeyVAL(parameters, queryParams1));
            urlBuilder.appendKeyVal(Connection.KeyVal.ConnectionKeyVAL(parameters, queryParams2));
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

    @Test
    public void appendQueryParamsTest_WithInvalidQueryParams_throwsException() throws UnsupportedEncodingException {
        String invalidQueryParams = "invalid key=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(Connection.KeyVal.ConnectionKeyVAL(parameters, invalidQueryParams));
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}

class Connection {
    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    public static class ConnectionKeyVAL {
        private Connection.KeyVal kv;

        public ConnectionKeyVAL(Connection.KeyVal kv) {
            this.kv = kv;
        }

        public Connection.KeyVal getKv() {
            return kv;
        }
    }

}