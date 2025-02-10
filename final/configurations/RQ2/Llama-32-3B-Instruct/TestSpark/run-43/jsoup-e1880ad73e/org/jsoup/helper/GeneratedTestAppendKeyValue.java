package org.jsoup.helper;

public class GeneratedTestAppendKeyValue {

    public Exception(String message) {
        super(message);
    }
}

public class MalformedURLExceptionException extends Exception {
    public MalformedURLExceptionException(String message) {
        super(message);
    }
}

public class URISyntaxExceptionException extends Exception {
    public URISyntaxExceptionException(String message) {
        super(message);
    }
}

public class UnsupportedEncodingExceptionException extends Exception {
    public UnsupportedEncodingExceptionException(String message) {
        super(message);
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

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}

public class URLBuilder {

    private String scheme;
    private String host;
    private String query;

    public URLBuilder(String scheme, String host) {
        this.scheme = scheme;
        this.host = host;
    }

    public void appendKey(Connection.KeyVal keyVal) throws UnsupportedEncodingException {
        if (scheme.equals("http") || scheme.equals("https")) {
            query += "&" + keyVal.getKey() + "=" + java.net.URLEncoder.encode(keyVal.getValue(), "UTF-8");
        } else {
            throw new UnsupportedEncodingExceptionException("Unsupported scheme: " + scheme);
        }
    }

    public String buildString() throws MalformedURLException, URISyntaxException {
        return scheme + "://" + host + "?" + query;
    }

    public java.net.URL build() throws MalformedURLException, URISyntaxException {
        return new java.net.URL(buildString());
    }
}

public class URLBuilderTest {

    @Mock
    private Connection connection;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAppendKeyValue() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new URLBuilder("http", "www.example.com");
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKey(keyVal);
    }

}