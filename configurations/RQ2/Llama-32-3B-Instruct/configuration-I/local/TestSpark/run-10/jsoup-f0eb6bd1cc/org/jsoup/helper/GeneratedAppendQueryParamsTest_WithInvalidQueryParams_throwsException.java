package org.jsoup.helper;

public class GeneratedAppendQueryParamsTest_WithInvalidQueryParams_throwsException {

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