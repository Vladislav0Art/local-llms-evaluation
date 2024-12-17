package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testUrlBuilder() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        String normUrl = builder.build().toString();
        assertNotNull(normUrl);
        assertNotSame(url, normUrl);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path?query=value#fragment"));
        String[] results = {"http://example.com/path?query=value&fragment", "http://example.com/path?value&fragment"};
        for (String result : results) {
            sb.append(result).append("\n");
        }
        assertEquals(sb.toString(), builder.build().toString());
    }

    @Test
    public void testAppendKeyValEmpty() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path?query=value"));
        String[] results = {"http://example.com/path?value", "http://example.com/path"};
        for (String result : results) {
            sb.append(result).append("\n");
        }
        assertEquals(sb.toString(), builder.build().toString());
    }

    @Test
    public void testAppendKeyValNonAscii() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(new URL("http://€example.com/path?€query=&€fragment"));
        String[] results = {"http://€example.com/path?€query=&€fragment", "http://€€€example.com/path?€€€€€€query=&€€€&€€€€€€€&€€€€€€€€€fragment"};
        for (String result : results) {
            sb.append(result).append("\n");
        }
        assertEquals(sb.toString(), builder.build().toString());
    }

    @Test
    public void testAppendKeyValNonAsciiMultiple() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(new URL("http://€€€example.com/path?€€€€€€query=&€€€&€€€€€€€&€€€€€€€€€fragment"));
        String[] results = {"http://€€€example.com/path?€€€€€€query=&€€€&€€€€€€€&€€€€€€€€€€€&€€€€€€€€€€fragment", "http://€€€example.com/path?€€€€€€€query=&€€€&€€€€€€€€&€€€€€€€€€€€€€€&€€€€€€€€€€fragment"};
        for (String result : results) {
            sb.append(result).append("\n");
        }
        assertEquals(sb.toString(), builder.build().toString());
    }

    @Test
    public void testAppendKeyValNull() throws UnsupportedEncodingException {
        Builder<String> builder = new Builder<>(new URL("http://example.com/path?value"));
        String[] results = {"http://example.com/path"};
        for (String result : results) {
            assertNotSame(result, builder.build().toString());
        }
    }

    @Test
    public void testAppendKeyValEmptySlice() throws UnsupportedEncodingException {
        Builder<String> builder = new Builder<>(new URL("http://example.com/path?value"));
        String[] results = {"http://example.com/path"};
        for (String result : results) {
            assertNotSame(result, builder.build().toString());
        }
    }

    @Test
    public void testAppendKeyValNullSlice() throws UnsupportedEncodingException {
        Builder<String> builder = new Builder<>(new URL("http://example.com/path"));
        String[] results = {"http://example.com/path"};
        for (String result : results) {
            assertNotSame(result, builder.build().toString());
        }
    }

    @Test
    public void testAppendKeyValNullRefSlice() throws UnsupportedEncodingException {
        Builder<URI> builder = new Builder<>(new URL("http://example.com/path"));
        String[] results = {"http://example.com/path"};
        for (String result : results) {
            assertNotSame(result, builder.build().toString());
        }
    }

    @Test
    public void testAppendKeyValEmptyRefSlice() throws UnsupportedEncodingException {
        Builder<URI> builder = new Builder<>(new URL("http://example.com/path"));
        String[] results = {"http://example.com/path"};
        for (String result : results) {
            assertNotSame(result, builder.build().toString());
        }
    }

}