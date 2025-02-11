package org.jsoup.helper;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    public String decodePart(String encoded) {
        return IDN.decode(encoded);
    }

    public String normalizeQuery(String q) {
        // implement normalization logic here
        return q; // or you can use a library to do it for you
    }

    public String normalizeRef(String r) {
        // implement normalization logic here
        return r; // or you can use a library to do it for you
    }

    @Test
    public void newUrlBuilder_withNullInputUrl_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void newUrlBuilder_withEmptyQuery_andNoRef_BuildsCorrectly() {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
        assertTrue(builder.q == null || builder.q.toString().isEmpty());
    }

    @Test
    public void newUrlBuilder_withNonEmptyQuery_andNoRef_BuildsCorrectly() {
        URL inputUrl = new URL("http://example.com?query=foo");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
        assertTrue(builder.q != null && !builder.q.toString().isEmpty());
    }

    @Test
    public void newUrlBuilder_withEmptyRef_BuildsCorrectly() {
        URL inputUrl = new URL("http://example.com#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
        assertTrue(builder.u.getRef() == null || builder.u.getRef().isEmpty());
    }

    @Test
    public void newUrlBuilder_withNonEmptyRef_BuildsCorrectly() {
        URL inputUrl = new URL("http://example.com#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
        assertTrue(builder.u.getRef() != null && !builder.u.getRef().isEmpty());
    }

    @Test
    public void decodePartTest() {
        String encoded = "http%3A%2F%2Fexample.com";
        assertEquals("http://example.com", decodePart(encoded));
    }

    @Test
    public void normalizeQueryTest() {
        String q = "+foo=bar";
        assertEquals("+foo=bar", normalizeQuery(q));
    }

    @Test
    public void normalizeRefTest() {
        String r = " example.com";
        assertEquals(" example.com", normalizeRef(r));
    }
}

public class UrlBuilder {

    private URL u;

    public UrlBuilder(URL u) {
        this.u = u;
    }

    public static class ConnectionKeyVal {
        // implement connection key val logic here
    }

    public void decodePart(String encoded) {
        // implement decoding logic here
    }

    public String normalizeQuery(String q) {
        // implement normalization logic here
        return q; // or you can use a library to do it for you
    }

    public String normalizeRef(String r) {
        // implement normalization logic here
        return r; // or you can use a library to do it for you
    }

}