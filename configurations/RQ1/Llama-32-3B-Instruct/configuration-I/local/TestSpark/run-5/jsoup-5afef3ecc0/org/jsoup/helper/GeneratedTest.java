package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;

public class GeneratedTest {

    @Test
    public void newUrlBuilderFromUrl() {
        URL url = new URL("http://a.com?b=1#c");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.u);
    }

    @Test
    public void buildNormalUrl() {
        URL url = new URL("http://a.com?b=1#c");
        UrlBuilder builder = new UrlBuilder(url);
        URI uri = builder.u.getURI();
        assertTrue(uri.getScheme().equals("http"));
        assertEquals("a.com", uri.getHost());
        assertEquals(null, uri.getUserInfo());
        assertEquals(80, uri.getPort());
    }

    @Test
    public void buildWithQuery() {
        URL url = new URL("http://a.com?b=1#c");
        UrlBuilder builder = new UrlBuilder(url);
        StringBuilder q = builder.q;
        assertNotNull(q);
        assertTrue(q.toString().equals("b=1"));
    }

    @Test
    public void appendKeyValToQuery() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://a.com?b=1#c"));
        builder.appendKeyVal(kv);
        assertTrue(builder.q.toString().equals("b=1&key=value"));
    }

    @Test
    public void appendKeyValToRef() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://a.com?b=1#c"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.u.getRef());
        assertTrue(builder.u.getRef().equals("%20key=value"));
    }

    @Test
    public void buildUrlWithNonASCIIPath() throws MalformedURLException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://a.com/path/to/resource?b=1#c"));
        builder.appendKeyVal(kv);
        URI uri = builder.u.getURI();
        assertTrue(uri.getPath().contains("%5C")); // \ to \
    }

    @Test
    public void buildUrlWithPunyCoding() {
        URL url = new URL("http://a.com");
        UrlBuilder builder = new UrlBuilder(url);
        URI uri = builder.u.getURI();
        assertTrue(uri.getHost().equals("a.com"));
    }

}