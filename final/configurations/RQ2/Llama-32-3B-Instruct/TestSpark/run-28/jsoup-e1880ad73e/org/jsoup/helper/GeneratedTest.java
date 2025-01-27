package org.jsoup.helper;

import org.jsoup.Connection;

public class GeneratedTest {

    private String scheme;
    private String host;

    public UrlBuilder(String scheme, String host) {
        this.scheme = scheme;
        this.host = host;
    }

    public boolean appendKeyVal(String key, String value) throws UnsupportedEncodingException {
        return Connection.KeyVal.of(key, value).of();
    }

    public URL build() throws MalformedURLException, URISyntaxException {
        return new URL(scheme + "://" + host);
    }

}

public class UrlBuilderTest {

    @Test
    public void buildWithoutQueryParams() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        URL url = builder.build();
        assertEquals("http://example.com", url.toString());
    }

    @Test
    public void buildWithQueryParamsAndEncodings() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertEquals("http://example.com?key1=value1&encoding=UTF-8", builder.build().toString());
    }

    @Test
    public void buildWithUrlDecoder() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com?encoded%3Dvalue";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals("http://example.com?decoded=value", builder.build().toString());
    }

}