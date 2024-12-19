package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class GeneratedTest {

    @Test
    public void build_url() {
        String expectedUrl = "http://example.com";
        URL actualUrl = new UrlBuilder(new URL(expectedUrl)).build();
        assertEquals(expectedUrl, actualUrl.toString());
    }

    @Test
    public void append_key_val() throws UnsupportedEncodingException {
        String expectedKeyValMap = "{\"key\":\"val\"}";
        URLKeyValMap kvMap = new URLKeyValMap().setKey("key").setValue("val");
        URL actualUrl = new UrlBuilder(new URL("http://example.com")).appendKeyVal(kvMap).toString();
        assertEquals(expectedKeyValMap, actualUrl.toString());
    }

    @Test
    public void append_key_val_no_key() throws UnsupportedEncodingException {
        String expectedKeyValMap = "";
        URLKeyValMap kvMap = new URLKeyValMap().setKey("");
        URL actualUrl = new UrlBuilder(new URL("http://example.com")).appendKeyVal(kvMap).toString();
        assertEquals(expectedKeyValMap, actualUrl.toString());
    }

    @Test
    public void append_key_val_too_long() {
        String expectedKeyValMap = "{\"key\":\"val\"}";
        try {
            new UrlBuilder(new URL("http://example.com"));
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void append_key_val_unsupportedEncodingException() throws UnsupportedEncodingException {
        String expectedKeyValMap = "{\"key\":\"val\"}";
        try {
            new UrlBuilder(new URL("http://example.com"));
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void append_key_val_emptyKey() {
        String expectedKeyValMap = "";
        URLKeyValMap kvMap = new URLKeyValMap().setKey("").toString();
        assertEquals(expectedKeyValMap, kvMap.toString());
    }

    @Test
    public void append_key_val_no_value() {
        String expectedKeyValMap = "{\"key\":\"\"}";
        URLKeyValMap kvMap = new URLKeyValMap().setKey("key").setValue("");
        URL actualUrl = new UrlBuilder(new URL("http://example.com")).appendKeyVal(kvMap).toString();
        assertEquals(expectedKeyValMap, actualUrl.toString());
    }

    @Test
    public void append_key_val_too_long_no_value() {
        String expectedKeyValMap = "{\"key\":\"val\"}";
        try {
            new UrlBuilder(new URL("http://example.com"));
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void append_key_val_too_long_no_key() throws UnsupportedEncodingException {
        String expectedKeyValMap = "{\"key\":\"val\"}";
        try {
            new UrlBuilder(new URL("http://example.com"));
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void append_key_val_too_long_empty_key() throws UnsupportedEncodingException {
        String expectedKeyValMap = "";
        try {
            new UrlBuilder(new URL("http://example.com"));
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}