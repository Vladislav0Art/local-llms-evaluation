package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testUrlWithQueryParams() {
        String url = "http://example.com?key1=value1&key2=value2";
        Url expectedUri = new Url(url);
        assertEquals(expectedUri, new UrlBuilder(new URL("http://example.com")).withQuery("key1=value1&key2=value2").build());
    }

    @Test
    public void testUrlWithMultipleQueryParams() {
        String url = "http://example.com?key1=value1&key2=value2&otherParam=otherValue";
        Url expectedUri = new Url(url);
        assertEquals(expectedUri, new UrlBuilder(new URL("http://example.com")).withQuery("key1=value1", "key2=value2", "otherParam=otherValue").build());
    }

    @Test
    public void testUrlWithNoQueryParams() {
        String url = "http://example.com";
        Url expectedUri = new Url(url);
        assertEquals(expectedUri, new UrlBuilder(new URL("http://example.com")).withQuery().build());
    }
}

public class Url {
    private final String uri;

    public Url(String uri) {
        this.uri = uri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Url url = (Url) o;
        return uri.equals(url.uri);
    }
}

public class UrlBuilder {
    private final URL baseUri;

    public UrlBuilder(URL baseUri) {
        this.baseUri = baseUri;
    }

    public String getUri() {
        return baseUri.toString();
    }

    public UrlBuilder withQuery(String... queryParams) {
        if (queryParams.length > 0) {
            // implement query parameter encoding
        }
        return this;
    }

    public Url build() {
        return new Url(getUri());
    }

}