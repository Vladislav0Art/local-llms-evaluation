package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.StringUtil;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testBuild() {
        URL url = new URL("http://example.com");
        String expectedUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_WithSingleArgument_Security() throws UnsupportedEncodingException {
        String encodedKv = "key=value";
        KeyVal kv = URLDecoder.decode(encodedKv, UTF_8);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com?key=%28value%29", urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_WithSingleArgument_Security_WrongEncodding() throws UnsupportedEncodingException {
        String encodedKv = "key=value";
        KeyVal kv = URLDecoder.decode(encodedKv, UTF_8);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyVal_MalformedKv() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal();
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyVal_NullKv() throws UnsupportedEncodingException {
        KeyVal kv = null;
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyVal_SingleArgument_URIEncoded() throws UnsupportedEncodingException {
        String encodedKv = "key=value";
        KeyVal kv = URLDecoder.decode(encodedKv, UTF_8);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com?key=%28value%29", urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_SingleArgument_URLEncoded() throws UnsupportedEncodingException {
        String encodedKv = "key=value";
        KeyVal kv = URLDecoder.decode(encodedKv, UTF_8);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com?key=%28value%29", urlBuilder.build());
    }

    @Test
    public void testAppendKeyVal_SingleArgument_Security() throws UnsupportedEncodingException {
        String encodedKv = "key=value";
        KeyVal kv = URLDecoder.decode(encodedKv, UTF_8);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyVal_SingleArgument_NonExistentKv() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal();
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

}