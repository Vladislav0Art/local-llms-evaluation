package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void build_noQuery() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL builtUrl = builder.build();

        assertEquals("http://example.com/path", builtUrl.toExternalForm());
    }

    @Test
    public void build_withQuery() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL builtUrl = builder.build();

        assertEquals("http://example.com/path?key=value", builtUrl.toExternalForm());
    }

    @Test
    public void build_withQueryAndRef() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/path#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL builtUrl = builder.build();

        assertEquals("http://example.com/path?key=value#ref", builtUrl.toExternalForm());
    }

}