package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void urlBuilder() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        assertEquals("https://example.com", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyVal() throws IOException {
        String input = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key", "value");
        }});
        assertEquals("https://example.com?key=value", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyValNoEncoding() throws IOException {
        String input = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key", "value");
        }}, true);
        assertEquals("https://example.com?key=value", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyValUnsupportedEncoding() {
        String input = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key", "value");
        }}, false));
    }

    @Test
    public void appendKeyValNoValue() {
        String input = "key";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key", "");
        }}, true));
    }

    @Test
    public void appendKeyValEmptyMap() {
        String input = "key";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put(null, null);
        }}, true));
    }

    @Test
    public void appendKeyValNonStringKey() {
        String input = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put(1L, "value");
        }}, true));
    }

}