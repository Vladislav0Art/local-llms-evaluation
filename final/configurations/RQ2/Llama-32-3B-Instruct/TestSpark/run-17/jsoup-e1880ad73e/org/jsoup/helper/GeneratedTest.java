package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void newUrlBuilder_withInputUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assertNotNull(urlBuilder);
    }

    @Test
    public void build_urlWithoutQuery() throws MalformedURLException, URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URL result = urlBuilder.build();
        assertEquals("http://example.com", result.toString());
    }

    @Test
    public void build_urlWithQuery() throws MalformedURLException, URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?param=value"));
        URL result = urlBuilder.build();
        assertEquals("http://example.com?param=value", result.toString());
    }

    @Test
    public void appendKeyVal_withValidKeyValue() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com?key=value", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyVal_withInvalidKeyValue() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = null;
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

    @Test
    public void appendKeyVal_withNonStringKeyValue() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal(1, "value");
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com", urlBuilder.build().toString());
    }

}