package org.jsoup.helper;

import org.jsoup.URL;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void newUrlBuilder_EmptyUrl() throws MalformedURLException {
        URL url = new URL("https://example.com");
        // Test the functionality of newUrlBuilder with an empty url.
    }

    @Test
    public void newUrlBuilder_SimpleUrl() throws MalformedURLException {
        URL url = new URL("https://example.com/path/to/resource?param=value");
        // Test the functionality of newUrlBuilder with a simple url.
    }

    @Test
    public void appendKeyVal_NoQueryParams() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String result = UrlBuilder.appendKeyVal(kv);
        // Test the functionality of appendKeyVal with no query params.
    }

    @Test
    public void appendKeyVal_OneQueryParam() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String url = "https://example.com/path/to/resource";
        UrlBuilder.appendKeyVal(url, kv);
        // Test the functionality of appendKeyVal with one query param.
    }

    @Test
    public void appendKeyVal_MultipleQueryParams() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String url = "https://example.com/path/to/resource?param1=value1&param2=value2";
        UrlBuilder.appendKeyVal(url, kv);
        // Test the functionality of appendKeyVal with multiple query params.
    }

    @Test
    public void UrlBuilder_NoUrlPassed() throws MalformedURLException, URISyntaxException {
        URL url = new UrlBuilder();
        // Test the functionality of UrlBuilder with no url passed.
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

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}

public class UrlBuilder {
    public static String appendKeyVal(Connection.KeyVal kv, String url) throws UnsupportedEncodingException, URISyntaxException {
        // Implement the functionality of appendKeyVal
        return null;
    }

}