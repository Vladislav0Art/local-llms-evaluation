package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedTest {

    @Test
    public void testConstructWithScheme() {
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.appendToAscii("https://");
        urlBuilder.appendToAscii("example.com");
        URI uri = URI.create(urlBuilder.url.toString());
        assertEquals(URI.create("https://example.com"), uri);
    }

    @Test
    public void testConstructWithQuery() {
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.appendToAscii("https://");
        urlBuilder.appendToAscii("example.com?");
        urlBuilder.appendToAscii("param=value");
        URI uri = URI.create(urlBuilder.url.toString());
        assertEquals(URI.create("https://example.com?param=value"), uri);
    }

    @Test
    public void testConstructWithFragment() {
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.appendToAscii("https://");
        urlBuilder.appendToAscii("example.com#fragment");
        URI uri = URI.create(urlBuilder.url.toString());
        assertEquals(URI.create("https://example.com#fragment"), uri);
    }
}

public class UrlBuilder {

    private StringBuilder url;

    public UrlBuilder() {
        this.url = new StringBuilder();
    }

    public void appendToAscii(String part) {
        url.append(part).append("/");
    }

    public void setQueryParams(String params) throws URISyntaxException {
        url.insert(url.lastIndexOf("/"), "?");
        url.append(params);
    }

    public void setFragment(String fragment) {
        if (url.indexOf("#") != -1) {
            throw new UnsupportedOperationException("UrlBuilder does not support setting a new fragment");
        }
        url.append("#").append(fragment);
    }

    public String getUrl() {
        return url.toString();
    }

}