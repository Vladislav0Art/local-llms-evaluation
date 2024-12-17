package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void build_url() {
        String inputUrl = "https://example.com/path";
        URL url = new UrlBuilder(inputUrl).build();
        URI uri = new URI(url.toString());
        assertNotNull(uri);
        assertEquals("https", uri.getScheme());
        assertEquals("example.com/path", uri.getPath());
        assertEquals("/", uri.getRef());
    }

    @Test
    public void append_key_value() {
        URL inputUrl = "https://example.com/path";
        Map<String, String> kvMap = Map.of("key1", "value1", "key2", "value2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kvMap);
        String outputUri = urlBuilder.build().toString();
        assertNotNull(outputUri);
    }

    @Test
    public void append_key_value_unsupported_encoding() {
        URL inputUrl = "https://example.com/path";
        Map<String, String> kvMap = Map.of("key1", "value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kvMap);
        try {
            urlBuilder.appendKeyVal(new UnsupportedEncodingException());
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException to be thrown");
        }
    }

    @Test
    public void append_key_value_null_kv() {
        URL inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(null);
        try {
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException to be thrown");
        }
    }

    @Test
    public void append_key_value_key_missing() {
        URL inputUrl = "https://example.com/path";
        Map<String, String> kvMap = Map.of();
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kvMap);
        try {
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException to be thrown");
        }
    }

    @Test
    public void append_key_value_null_kv_size_mismatch() {
        URL inputUrl = "https://example.com/path";
        Map<String, String> kvMap = Map.of();
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kvMap);
        try {
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException to be thrown");
        }
    }

    @Test
    public void append_key_value_null_kv_type_mismatch() {
        URL inputUrl = "https://example.com/path";
        Map<String, String> kvMap = Map.of("key1", null);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kvMap);
        try {
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException to be thrown");
        }
    }

    @Test
    public void append_key_value_invalid_utf8_encoding() throws URISyntaxException {
        URL inputUrl = "https://example.com/path";
        Map<String, String> kvMap = Map.of("key1", "value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kvMap);
        URI uri = new URI(urlBuilder.build().toString());
        assertNotEquals(null, uri);
    }

}