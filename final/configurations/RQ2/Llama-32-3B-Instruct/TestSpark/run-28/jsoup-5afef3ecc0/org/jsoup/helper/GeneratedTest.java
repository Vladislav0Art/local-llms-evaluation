package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedTest {

    @Mock
    private Connection connection;

    public static final String URL = "https://example.com/path?key=value";
    public static final String URL_WITH_QUERY = "https://example.com/path?key=value&foo=bar";

    public static final String URL_WITH
    queryParams ="https://example.com/path?key=value&foo%3Dbar";

    @Test
    public void ofUrl() {
        UrlBuilder builder = new UrlBuilder(new URL(URL));
        assertEquals(URL, builder.build().toString());
    }

    @Test
    public void withQueryParam() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL(URL));
        URI uri = URI.create(builder.appendKeyVal(Connection.KeyVal.of("key", "value")).build());
        assertEquals(URL_WITH_QUERY, uri.toString());
    }

    @Test
    public void withQueryParams() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL(URL));
        URI uri = URI.create(builder.appendKeyVal(Connection.KeyVal.of("key", "value")).appendKeyVal(Connection.KeyVal.of("foo", "bar")).build());
        assertEquals(URL_WITH_query_params, uri.toString());
    }

    @Test
    public void keyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(URL));
        URI uri = URI.create(builder.appendKeyVal(Connection.KeyVal.of("key", "value")).build());
        assertEquals(URL, uri.toString());
    }

}