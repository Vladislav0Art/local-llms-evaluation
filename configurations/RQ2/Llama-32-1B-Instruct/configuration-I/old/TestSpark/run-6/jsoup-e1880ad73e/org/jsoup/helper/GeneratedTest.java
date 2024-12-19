package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URI;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void urlBuilder_noAppendKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        try (Connection.KeyVal kv = urlBuilder.appendKeyVal(null)) {
            // test implementation
        }
    }

    @Test
    public void appendKeyVal_notSupported() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        UriBuilder uriBuilder = new UriBuilder();
        try (Connection.KeyVal kv = urlBuilder.appendKeyVal(uriBuilder)) {
            // test implementation
        }
    }

    @Test
    public void appendKeyVal_key() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of("key1", "value1");
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(kv)) {
            // test implementation
        }
    }

    @Test
    public void appendKeyVal_values() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of("key1", "value1");
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(kv)) {
            // test implementation
        }
    }

    @Test
    public void appendKeyVal_value() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of("key1", "value1");
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(kv)) {
            // test implementation
        }
    }

    @Test
    public void build_noAppendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        URL result = urlBuilder.build();
        try (Connection.KeyVal kv = urlBuilder.appendKeyVal(null)) {
            // test implementation
        }
    }

    @Test
    public void build_appendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of("key1", "value1");
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(kv)) {
            // test implementation
        }
    }

    @Test
    public void build_key() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        URL result = urlBuilder.build();
        try (Connection.KeyVal kv = urlBuilder.appendKeyVal(Map.of("key1", "value1"))) {
            // test implementation
        }
    }

    @Test
    public void build_values() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        URL result = urlBuilder.build();
        try (Connection.KeyVal kv = urlBuilder.appendKeyVal(Map.of("key1", "value1"))) {
            // test implementation
        }
    }

    @Test
    public void build_value() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of("key1", "value1");
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(kv)) {
            // test implementation
        }
    }

    @Test
    public void appendKeyVal_nullKey() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of();
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(kv)) {
            // test implementation
        }
    }

    @Test
    public void appendKeyVal_emptyMap() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of();
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(kv)) {
            // test implementation
        }
    }

    @Test
    public void appendKeyVal_emptyString() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of();
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(Map.of())) {
            // test implementation
        }
    }

    @Test
    public void appendKeyVal_nullValue() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com"));
        Map<String, String> kv = Map.of();
        try (Connection.KeyVal kv2 = urlBuilder.appendKeyVal(kv)) {
            // test implementation
        }
    }

}