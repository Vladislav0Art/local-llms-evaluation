package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildNormalUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL builtUrl = builder.build();
        assertEquals("http://example.com", builtUrl.toString());
    }

    @Test
    public void buildUrlWithQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?param=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL builtUrl = builder.build();
        assertEquals("http://example.com?param=value", builtUrl.toString());
    }

    @Test
    public void buildUrlWithUmlautTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/äöü");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL builtUrl = builder.build();
        assertEquals("http://example.com/%C3%A4%C3%B6%C3%BC", builtUrl.toString());
    }

    @Test
    public void decodePartNonExistentEncoding() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/%C3%A4%C3%B6%C3%BC");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.build();
    }

}