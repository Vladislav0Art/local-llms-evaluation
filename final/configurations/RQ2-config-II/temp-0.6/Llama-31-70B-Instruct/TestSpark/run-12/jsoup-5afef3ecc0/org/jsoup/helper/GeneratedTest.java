package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private URL inputUrl;
    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws MalformedURLException {
        inputUrl = new URL("https://www.example.com");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testBuild() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals("https://www.example.com", builtUrl.toExternalForm());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void testDecodePart() {
        String decoded = UrlBuilder.decodePart("test");
        assertEquals("test", decoded);
    }

    @Test
    public void testNormalizeQuery() {
        String normalized = UrlBuilder.normalizeQuery("test query");
        assertEquals("test+query", normalized);
    }

    @Test
    public void testNormalizeRef() {
        String normalized = UrlBuilder.normalizeRef("test ref");
        assertEquals("test%20ref", normalized);
    }

}