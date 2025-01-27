package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void urlBuilder_ConstructorWithInputUrl() {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.build());
    }

    @Test
    public void urlBuilder_buildOriginalUrl() {
        URL inputUrl = new URL("https://example.com/path?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://example.com/path?query=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void urlBuilder_buildWithQuery() {
        URL inputUrl = new URL("https://example.com/path");
        String query = "query=value";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(Connection.KeyVal.query, query);
        URL expectedUrl = new URL("https://example.com/path?query=value");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void urlBuilder_buildWithFragment() {
        URL inputUrl = new URL("https://example.com/path#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String fragment = "new_fragment";
        urlBuilder.appendKeyVal(Connection.KeyVal.fragment, fragment);
        URL expectedUrl = new URL("https://example.com/path#new_fragment");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void urlBuilder_buildWithQueryAndFragment() {
        URL inputUrl = new URL("https://example.com/path");
        String query = "query=value";
        String fragment = "fragment";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(Connection.KeyVal.query, query);
        urlBuilder.appendKeyVal(Connection.KeyVal.fragment, fragment);
        URL expectedUrl = new URL("https://example.com/path?query=value#fragment");
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void urlBuilder_buildWithEncoding() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://example.com/path");
        String query = "query=value&encoding=utf-8";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(Connection.KeyVal.query, query);
        URL expectedUrl = new URL("https://example.com/path?query=value%3Fencoding=utf-8");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}