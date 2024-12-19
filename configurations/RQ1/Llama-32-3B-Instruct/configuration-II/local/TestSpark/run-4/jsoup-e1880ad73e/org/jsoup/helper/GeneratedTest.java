package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void newUrlBuilderFromValidUrlIsCreated() {
        String url = "http://example.com/path?query=abc#ref";
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        assertNotNull(builder.u);
        assertNull(builder.q);
    }

    @Test
    public void newUrlBuilderFromValidUrlBuildsCorrectly() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?query=abc#ref";
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        assertEquals(new URL("http://example.com/path"), builder.build());
    }

    @Test
    public void buildWithInvalidUrlThrowsMalformedURLException() {
        String url = "http://example.com/path?query=abc#ref";
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        assertThrows(MalformedURLException.class, () -> builder.build());
    }

    @Test
    public void buildWithInvalidSchemeThrowsMalformedURLException() {
        String url = "invalid://example.com/path?query=abc#ref";
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        assertThrows(MalformedURLException.class, () -> builder.build());
    }

    @Test
    public void appendKeyValToUrlBuildersQuery() throws UnsupportedEncodingException {
        String url = "http://example.com/path?query=abc";
        Connection.KeyVal[] kv = {new Connection.KeyVal("a", "b")};
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        for (Connection.KeyVal keyVal : kv) {
            builder.appendKeyVal(keyVal);
        }

        assertEquals(new URL("http://example.com/path?query=abcb"), builder.build());
    }

    @Test
    public void appendNonAsciiToUrlBuildersPath() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/åpath?query=abc";
        Connection.KeyVal[] kv = {new Connection.KeyVal("a", "b")};
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        for (Connection.KeyVal keyVal : kv) {
            builder.appendKeyVal(keyVal);
        }

        assertEquals(new URL("http://example.com/äpath?query=abcb"), builder.build());
    }

    @Test
    public void appendNonAsciiToUrlBuildersQuery() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?query=abc";
        Connection.KeyVal[] kv = {new Connection.KeyVal("a", "äb")};
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        for (Connection.KeyVal keyVal : kv) {
            builder.appendKeyVal(keyVal);
        }

        assertEquals(new URL("http://example.com/path?query=abcb"), builder.build());
    }

    @Test
    public void appendNonAsciiToUrlBuildersAnchor() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?query=abc#ref";
        Connection.KeyVal[] kv = {new Connection.KeyVal("a", "äb")};
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        for (Connection.KeyVal keyVal : kv) {
            builder.appendKeyVal(keyVal);
        }

        assertEquals(new URL("http://example.com/path?query=abcb#ref"), builder.build());
    }

}