package org.jsoup.helper;

public class GeneratedTest {

    public static String encode(String value) {
        return value;
    }
}

public class ConnectionImpl implements Connection {
    @Override
    public String encode(String value) {
        // Implement encoding logic here
        return value;
    }
}

public class UrlBuilder {
    private StringBuilder fullUrl;

    public UrlBuilder() {
        this.fullUrl = new StringBuilder();
    }

    public void appendKeyAndValue(String key, String value) {
        fullUrl.append("?").append(key).append("=").append(encode(value));
    }

    public void appendQueryParameter(String key, String value) {
        if (fullUrl.charAt(0) == '?') {
            fullUrl.append("&").append(key).append("=").append(encode(value));
        } else {
            fullUrl.append("?").append(key).append("=").append(encode(value));
        }
    }

    public String getFullUrl() {
        return "http://example.com" + fullUrl.toString();
    }
}

public class TestUrlBuilder {

}