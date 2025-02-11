package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import javax.annotation.Nullable;

public class GeneratedTest {

    @Test
    public void emptyUrlBuilds() throws MalformedURLException {
        URL u = null;
        UrlBuilder builder = new UrlBuilder(u);
        URL built = builder.build();
        assertNotNull(built);
        assertEquals("", built.getProtocol());
        assertEquals(null, built.getUserInfo());
        assertEquals("", built.getHost());
        assertEquals(-1, built.getPort());
        assertEquals("", built.getPath());
    }

    @Test
    public void emptyUrlReturnsOriginal() throws MalformedURLException {
        URL u = null;
        UrlBuilder builder = new UrlBuilder(u);
        URL original = u;
        URL built = builder.build();
        assertSame(original, built);
    }

    @Test
    public void queryOnlyUrlBuildsCorrectly() throws MalformedURLException {
        URL u = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(u);
        URL built = builder.build();
        assertNotNull(built);
        assertEquals("http", built.getProtocol());
        assertEquals(null, built.getUserInfo());
        assertEquals("example.com", built.getHost());
        assertEquals(-1, built.getPort());
        assertTrue(built.getPath().contains("?query=value"));
    }

    @Test
    public void pathOnlyUrlBuildsCorrectly() throws MalformedURLException {
        URL u = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(u);
        URL built = builder.build();
        assertNotNull(built);
        assertEquals("http", built.getProtocol());
        assertEquals(null, built.getUserInfo());
        assertEquals("example.com", built.getHost());
        assertEquals(-1, built.getPort());
        assertTrue(built.getPath().contains("/path"));
    }

    @Test
    public void withQueryUrlBuildsCorrectly() throws MalformedURLException {
        URL u = new URL("http://example.com/path?query=value&more=info");
        UrlBuilder builder = new UrlBuilder(u);
        URL built = builder.build();
        assertNotNull(built);
        assertEquals("http", built.getProtocol());
        assertEquals(null, built.getUserInfo());
        assertEquals("example.com", built.getHost());
        assertEquals(-1, built.getPort());
        assertTrue(built.getPath().contains("/path?query=value&more=info"));
    }

    @Test
    public void refOnlyUrlBuildsCorrectly() throws MalformedURLException {
        URL u = new URL("http://example.com#ref");
        UrlBuilder builder = new UrlBuilder(u);
        URL built = builder.build();
        assertNotNull(built);
        assertEquals("http", built.getProtocol());
        assertEquals(null, built.getUserInfo());
        assertEquals("example.com", built.getHost());
        assertEquals(-1, built.getPort());
        assertTrue(built.getPath().contains("/#ref"));
    }

    @Test
    public void withBothQueryAndRefUrlBuildsCorrectly() throws MalformedURLException {
        URL u = new URL("http://example.com/path?query=value&more=info#ref");
        UrlBuilder builder = new UrlBuilder(u);
        URL built = builder.build();
        assertNotNull(built);
        assertEquals("http", built.getProtocol());
        assertEquals(null, built.getUserInfo());
        assertEquals("example.com", built.getHost());
        assertEquals(-1, built.getPort());
        assertTrue(built.getPath().contains("/path?query=value&more=info#ref"));
    }

    @Test
    public void appendKeyValAddsKeyValuePairs() throws MalformedURLException {
        URL u = new URL("http://example.com/path");
        Connection.KeyVal[] kv = new Connection.KeyVal[]{new Connection.KeyVal("key", "value")};
        UrlBuilder builder = new UrlBuilder(u);
        builder.appendKeyVal(kv[0]);
        assertNotNull(builder.q);
        assertEquals(2, kv.length);
    }

    @Test
    public void appendKeyValAddsMoreThanOneKeyValuePairs() throws MalformedURLException {
        URL u = new URL("http://example.com/path");
        Connection.KeyVal[] kv = new Connection.KeyVal[]{new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2")};
        UrlBuilder builder = new UrlBuilder(u);
        builder.appendKeyVal(kv[0]);
        builder.appendKeyVal(kv[1]);
        assertNotNull(builder.q);
        assertEquals(3, kv.length);
    }

    @Test
    public void appendKeyValAddsQueryPairsCorrectly() {
        URL u = new URL("http://example.com/path");
        Connection.KeyVal[] kv = new Connection.KeyVal[]{new Connection.KeyVal("key", "value")};
        UrlBuilder builder = new UrlBuilder(u);
        builder.appendKeyVal(kv[0]);
        assertNotNull(builder.q);
        assertEquals(2, kv.length);
    }

    @Test
    public void normalizeQueryReplacesSpacesWithPlus() {
        String q = "query+value";
        String normalizedQ = UrlBuilder.normalizeQuery(q);
        assertTrue(normalizedQ.contains("+"));
    }

    @Test
    public void normalizeRefReplacesSpacesWithPercent20() {
        String r = "ref + with spaces";
        String normalizedR = UrlBuilder.normalizeRef(r);
        assertTrue(normalizedR.contains("%20"));
    }

}