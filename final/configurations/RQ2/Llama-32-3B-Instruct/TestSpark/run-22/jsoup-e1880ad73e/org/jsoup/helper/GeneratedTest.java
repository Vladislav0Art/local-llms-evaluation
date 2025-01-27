package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void buildUrlFromNullTest() {
        assertNull(new UrlBuilder(null).build());
    }

    @Test
    public void buildUrlFromEmptyStringTest() throws MalformedURLException, URISyntaxException {
        URL url = new UrlBuilder("").build();
        assertNotNull(url);
        assertEquals("", url.getProtocol());
        assertEquals("", url.getHost());
        assertEquals("", url.getPath());
        assertEquals(0, url.getPort());
    }

    @Test
    public void buildUrlFromValidStringTest() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?param=value";
        URL expectedUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(expectedUrl.toURI().toString());
        assertEquals(expectedUrl, builder.build());
    }

    @Test
    public void appendKeyValAppendTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder("");
        builder.appendKeyVal(kv);
        assertTrue(builder.build().getPath().contains("?key=value"));
    }

    @Test
    public void appendKeyValAppendMultipleTimesTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder("");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertTrue(builder.build().getPath().contains("?key1=value1&key2=value2"));
    }

    @Test
    public void appendKeyValUrlEncodingTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value with spaces");
        UrlBuilder builder = new UrlBuilder("");
        builder.appendKeyVal(kv);
        assertTrue(builder.build().getPath().contains("?key=value%20with%20spaces"));
    }

    @Test
    public void appendKeyValUrlDecodingTest() throws UnsupportedEncodingException {
        String urlEncodedValue = URLEncoder.encode("value with spaces", UTF_8);
        Connection.KeyVal kv = new Connection.KeyVal("key", urlEncodedValue);
        UrlBuilder builder = new UrlBuilder("");
        builder.appendKeyVal(kv);
        assertTrue(builder.build().getPath().contains("?key=value%20with%20spaces"));
    }

}