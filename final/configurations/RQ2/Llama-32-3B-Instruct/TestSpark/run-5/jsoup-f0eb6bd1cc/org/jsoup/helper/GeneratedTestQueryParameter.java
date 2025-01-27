package org.jsoup.helper;

public class GeneratedTestQueryParameter {

    public static String encode(String value) throws UnsupportedEncodingException {
        return java.net.URLEncoder.encode(value, "UTF-8");
    }
}

public class UrlBuilder {
    private String baseUrl;

    public UrlBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getFullUrl() {
        return baseUrl;
    }

    public UrlBuilder appendKeyAndValue(String key, String value) throws UnsupportedEncodingException {
        if (baseUrl.contains("?")) {
            fullUrl.append("&").append(key).append("=").append(Connection.encode(value));
        } else {
            fullUrl.append("?").append(key).append("=").append(Connection.encode(value));
        }
        return this;
    }

    public UrlBuilder appendQueryParameter(String key, String value) throws UnsupportedEncodingException {
        if (baseUrl.contains("?")) {
            fullUrl.append("&").append(key).append("=").append(Connection.encode(value));
        } else {
            fullUrl.append("?").append(key).append("=").append(Connection.encode(value));
        }
        return this;
    }

    private StringBuilder fullUrl;

    public UrlBuilder(String url) {
        baseUrl = url;
        fullUrl = new StringBuilder(url);
    }

    public String getFullUrl() {
        return fullUrl.toString();
    }
}

public class TestUrlBuilder {

    @Test
    public void testQueryParameter() throws UnsupportedEncodingException {
        String url = "http://example.com?value=äöü";
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://example.com?value=%C3%A4%C3%B6%C3%BC", urlBuilder.getFullUrl());
    }

}