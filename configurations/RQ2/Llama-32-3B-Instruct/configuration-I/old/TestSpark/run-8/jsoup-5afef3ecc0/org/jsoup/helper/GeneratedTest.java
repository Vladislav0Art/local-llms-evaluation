package org.jsoup.helper;

public class GeneratedTest {

    private String url;
    private boolean hasQuery;

    public UrlBuilder(String url) {
        this.url = url;
        this.hasQuery = false;
    }

    public void addQueryParameter(String key, String value) {
        if (!hasQuery) {
            url += "?";
            hasQuery = true;
        }
        url += key + "=" + value + "&";
    }

    public String build() {
        if (url.contains("?")) {
            return url.substring(0, url.lastIndexOf('?')) + "#fragment";
        } else {
            return url;
        }
    }

    public void addFragment(String fragment) {
        if (!hasQuery) {
            url += "#";
            hasQuery = true;
        }
        url += fragment;
    }
}

public class UrlBuilderTest {

    @Test
    public void testBuildUrlWithFragment() {
        String input = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(input);
        assertEquals("https://example.com?key=value#fragment", urlBuilder.build().toString());
    }
}

class UrlBuilder {

    private String base;

    public UrlBuilder(String base) {
        this.base = base;
    }

    public void addQuery(String key, String value) {
        // implement query string logic here
    }

    public String build() {
        // implement URL building logic here
        return base + "?key=value";
    }

}