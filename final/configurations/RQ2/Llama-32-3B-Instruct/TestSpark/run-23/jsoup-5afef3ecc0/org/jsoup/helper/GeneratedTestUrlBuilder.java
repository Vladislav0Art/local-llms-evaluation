package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestUrlBuilder {

    private String scheme;
    private String authority;
    private String path;
    private String query;
    private String fragment;

    public UrlBuilder(String scheme, String authority, String path) {
        this.scheme = scheme;
        this.authority = authority;
        this.path = path;
    }

    public String toString() {
        return scheme + "://" + authority + path + "?" + query + "#" + fragment;
    }
}

public class GeneratedTest {

    @Test
    public void testUrlBuilder() throws Exception {
        // Create a new URL builder
        UrlBuilder urlBuilder = new UrlBuilder("https", "example.com", "/test/path");

        // Add query parameters to the URL builder
        urlBuilder.query = "param1=value1&param2=value2";

        // Add fragment to the URL builder
        urlBuilder.fragment = "#fragment";

        // Assert that the resulting URL is correct
        String expectedUrl = "https://example.com/test/path?param1=value1&param2=value2#fragment";
        assertEquals(expectedUrl, urlBuilder.toString());
    }

}