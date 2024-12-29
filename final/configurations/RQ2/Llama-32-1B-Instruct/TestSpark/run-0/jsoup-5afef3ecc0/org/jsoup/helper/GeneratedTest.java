package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testUrlBuilderAppendKeyValEmptyValue() throws UnsupportedEncodingException {
        String url = "https://www.example.com";
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("", ""));
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected
        }
    }

    @Test
    public void testUrlBuilderAppendKeyValStringNoValue() throws UnsupportedEncodingException {
        String url = "https://www.example.com";
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("", null));
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected
        }
    }

    @Test
    public void testUrlBuilderAppendKeyValStringNullValue() throws UnsupportedEncodingException {
        String url = "https://www.example.com";
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal(null, null));
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected
        }
    }

    @Test
    public void testUrlBuilderAppendKeyValNullBodyOrValue() throws UnsupportedEncodingException {
        String url = "https://www.example.com";
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal(null, null));
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected
        }
    }

    @Test
    public void testUrlBuilderAppendKeyValStringNoValueOrBody() throws UnsupportedEncodingException {
        String url = "https://www.example.com";
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("", null));
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected
        }
    }

    @Test
    public void testUrlBuilderAppendKeyValStringNullOrBody() throws UnsupportedEncodingException {
        String url = "https://www.example.com";
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(null, null);
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected
        }
    }

}