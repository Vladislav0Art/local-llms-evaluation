package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void build_PunnyCodingHostTest() {
        URL u = new URL("http://example.com/test");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://xn--c1ck1d.xn--0x2v35b.net/test", ((URL) builder.build()).getHost());
    }

    @Test
    public void build_PathyEncodingTest() {
        URL u = new URL("http://example.com/à?test#ref");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com/&#224;?test#ref", ((URL) builder.build()).getPath());
    }

    @Test
    public void build_QsEncodedTest() {
        URL u = new URL("http://example.com/test?name=Jane&age=30");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com/test?name=Jane%26age=30", ((URL) builder.build()).getQuery());
    }

    @Test
    public void build_NonAsciiQuery() {
        URL u = new URL("http://example.com/à?test#ref");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("?à?test#ref", ((URL) builder.build()).getQuery());
    }

    @Test
    public void appendKeyVal_DuplicatesTest() {
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("name", "John");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertEquals("?name=John&name=John", builder.q.toString());
    }

    @Test
    public void appendKeyVal_EmptyQ() {
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("name", "John");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertEquals("?name=John", builder.q.toString());
    }

    @Test
    public void decodePart_UnicodeEncodingErrorTest() throws MalformedURLException, URISyntaxException {
        String encoded = "\u2635\u2665\u00a0\u2648";
        assertEquals("a#-b", decodePart(encoded));
    }

    @Test
    public void decodePart_NonUtf8ErrorTest() {
        String encoded = "\u2635\u2665\u00a2\u2648";
        assertThrows(UnsupportedEncodingException.class, () -> decodePart(encoded));
    }

    @Test
    public void build_WithoutFragmentAndAnchorTest() {
        URL u = new URL("http://example.com/test");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com/test", ((URL) builder.build()).toString());
    }
}

public class ConnectionKeyVal {
    private String key;
    private String value;

    public ConnectionKeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConnectionKeyVal that = (ConnectionKeyVal) o;
        return Objects.equals(key, that.key) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

}