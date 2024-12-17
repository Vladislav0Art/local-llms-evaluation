package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newUrlBuilder_fromInputUrl() {
        URL inputUrl = new URL("https://example.com/path?a=1&b=2#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
    }

    @Test
    public void build_url_withoutQueryAndRef() {
        URL inputUrl = new URL("https://example.com/path");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, builder.build());
    }

    @Test
    public void build_url_withQueryAndNoRef() {
        URL inputUrl = new URL("https://example.com/path?a=1&b=2#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, builder.build());
    }

    @Test
    public void build_url_withQueryAndRef() {
        URL inputUrl = new URL("https://example.com/path?a=1&b=2#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u.getRef());
        assertEquals(inputUrl, builder.build());
    }

    @Test
    public void build_url_withQueryAndRef_correctlyEncoded() {
        URL inputUrl = new URL("https://example.com/path?a=1&b=2#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        String expected = "https%3A//example.com/path%3Fa%3D1%26b%3D2%23ref";
        assertEquals(expected, builder.u.toURI().toASCIIString());
    }

    @Test
    public void appendKeyVal_withValidKeyAndValue() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertEquals("key=value", builder.q.toString());
    }

    @Test
    public void appendKeyVal_withInvalidEncoding() {
        try {
            Connection.KeyVal kv = new Connection.KeyVal("key", "value");
            UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
        }
    }

    @Test
    public void decodePart_validEncoding() {
        String encoded = "%20";
        assertEquals(encoded, UrlBuilder.decodePart(encoded));
    }

    @Test
    public void normalizeQuery_minimalSpaceNormalization() {
        String q = "key  value";
        assertEquals("key%20value", UrlBuilder.normalizeQuery(q));
    }

}