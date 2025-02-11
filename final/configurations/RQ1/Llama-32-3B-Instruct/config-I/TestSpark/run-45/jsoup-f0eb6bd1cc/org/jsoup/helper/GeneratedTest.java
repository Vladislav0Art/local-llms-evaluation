package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void buildNormalUrlTest() throws URISyntaxException, UnsupportedEncodingException {
        URL u = new URL("https://example.com/path?query#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        URL result = builder.build();
        assertEquals("https%3A//example.com/utf-8%3Fpath%3Fquery%23fragment", result.toString());
    }

    @Test
    public void buildUrlWithNonAsciiPathTest() throws URISyntaxException, UnsupportedEncodingException {
        URL u = new URL("https://example.com/path?query#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        URL result = builder.build();
        assertEquals("https%3A//example.com/utf-8%3Fpath%3Fquery%23fragment", result.toString());
    }

    @Test
    public void buildUrlWithQueryTest() throws URISyntaxException, UnsupportedEncodingException {
        URL u = new URL("https://example.com/path?query=abc&def=e");
        UrlBuilder builder = new UrlBuilder(u);
        URL result = builder.build();
        assertEquals("https%3A//example.com/utf-8%3Fpath%3Fquery=abc%26def=e", result.toString());
    }

    @Test
    public void buildUrlWithFragmentTest() throws URISyntaxException, UnsupportedEncodingException {
        URL u = new URL("https://example.com/path?query#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        URL result = builder.build();
        assertEquals("https%3A//example.com/utf-8%3Fpath%3Fquery%23fragment", result.toString());
    }

    @Test
    public void appendKeyValNormalisationTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("abc", "def");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(kv);
        assertEquals("?abc=def", ((StringBuilder) builder.q).toString());
    }

    @Test
    public void appendKeyValQueryNormalizationTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("abc?", "def");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(kv);
        assertEquals("?%3Aabc%3Fdef", ((StringBuilder) builder.q).toString());
    }

    @Test
    public void appendKeyValNonAsciiNormalizationTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("äbc", "de\u00e4f");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(kv);
        assertEquals("?%C3%A4bc%3De%C3%B6f", ((StringBuilder) builder.q).toString());
    }

    @Test
    public void decodePartEncodingException() throws URISyntaxException, UnsupportedEncodingException {
        String encoded = "äbc";
        UrlBuilder.decodePart(encoded);
    }

}