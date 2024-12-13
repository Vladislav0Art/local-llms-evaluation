package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedTest {

    @Test
    public void build_NoQueryTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://xn--example-qta.com/path", result.toString());
    }

    @Test
    public void build_QueryTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://xn--example-qta.com/path?a=1&b=2", result.toString());
    }

    @Test
    public void build_RefTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://xn--example-qta.com/path#anchor", result.toString());
    }

    @Test
    public void build_QueryAndRefTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://xn--example-qta.com/path?a=1&b=2#anchor", result.toString());
    }

}