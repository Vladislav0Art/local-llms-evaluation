package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void buildUrlWithAbsolutePathTest() {
        URL url = new URL("https://example.com/path?query=foo&bar=1");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals("https://example.com/path", result.getProtocol() + "://" + IDN.toASCII(result.getHost()));
    }

    @Test
    public void buildUrlWithRelativePathTest() {
        URL url = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals("https://example.com", result.getProtocol() + "://" + IDN.toASCII(result.getHost()));
    }

    @Test
    public void buildUrlWithQueryStringTest() {
        URL url = new URL("https://example.com/path?query=foo&bar=1");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals("?query=foo%26bar=1", result.getQuery());
    }

    @Test
    public void appendKeyValTest() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        try {
            builder.appendKeyVal(kv);
            assertTrue(builder.q.toString().contains("key=value"));
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void appendKeyValMultipleTimesTest() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        try {
            builder.appendKeyVal(kv1);
            builder.appendKeyVal(kv2);
            assertTrue(builder.q.toString().contains("key1=value1%26key2=value2"));
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void normalizeQueryTest() {
        String query = "foo bar";
        String result = UrlBuilder.normalizeQuery(query);
        assertEquals("foo+bar", result);
    }

    @Test
    public void normalizeRefTest() {
        String ref = " foo ";
        String result = UrlBuilder.normalizeRef(ref);
        assertEquals("%20%20", result);
    }

}