package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void testBuild() {
        URLBuilder builder = new UrlBuilder("https://example.com/path?param=value");
        URI result = builder.build();
        assertEquals(URI.create("https://example.com/path?param=value"), result);
    }

    @Test
    public void testAppendKeyVal_1() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value"), result);
    }

    @Test
    public void testAppendKeyVal_2() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path?param=value");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value&param=value"), result);
    }

    @Test
    public void testAppendKeyVal_3() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path?param=value");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set("other", "another"));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?param=value&other=another"), result);
    }

    @Test
    public void testAppendKeyVal_4() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path?param=value");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(1.0));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?param=value"), result);
    }

    @Test
    public void testAppendKeyVal_5() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path?param=value");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(false));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?param=value"), result);
    }

    @Test
    public void testAppendKeyVal_6() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path?param=value");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(null));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?param=value"), result);
    }

    @Test
    public void testAppendKeyVal_7() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(1.0));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value&other=another"), result);
    }

    @Test
    public void testAppendKeyVal_8() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(false));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value"), result);
    }

    @Test
    public void testAppendKeyVal_9() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(true));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value"), result);
    }

    @Test
    public void testAppendKeyVal_10() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(null));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value"), result);
    }

    @Test
    public void testAppendKeyVal_11() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(1.0));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value&other=another"), result);
    }

    @Test
    public void testAppendKeyVal_12() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(false));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value"), result);
    }

    @Test
    public void testAppendKeyVal_13() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(true));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value"), result);
    }

    @Test
    public void testAppendKeyVal_14() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("https://example.com/path");
        builder.appendKeyVal(new org.jsoup.KeyVal().set(key, value).set(null));
        URL result = builder.build();
        assertEquals(URI.create("https://example.com/path?key=value"), result);
    }

}