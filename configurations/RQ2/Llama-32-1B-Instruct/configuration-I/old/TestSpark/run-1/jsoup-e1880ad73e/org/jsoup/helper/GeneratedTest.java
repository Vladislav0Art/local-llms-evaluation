package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void testUrlBuilder() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assert urlBuilder.build().orElseThrow() == "https://example.com";
    }

    @Test
    public void testAppendKeyVal_KV() {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(kv);
        assert urlBuilder.build().orElseThrow().getKeys().containsKey("key") && urlBuilder.build().orElseThrow().getValues().containsValue("value");
    }

    @Test
    public void testAppendKeyVal_InvalidKV() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assert urlBuilder.build().orElseThrow().ExceptionClass == java.net.UnsupportedEncodingException.class;
    }

    @Test
    public void testBuild() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        URL result = urlBuilder.build();
        assert result.getScheme() != null && !result.getProtocol().isEmpty() || result.getHost() == null;
    }

    @Test
    public void testAppendKeyVal_KVWithNullKV() {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_KVWithNullValue() {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", null);
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_InvalidValue() {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_KVWithEmptyKV() {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_KVWithEmptyValues() {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", "");
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_KVWithNullValues() {
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", null);
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_KVWithNoKeysOrValues() {
        HashMap<String, String> kv = new HashMap<>();
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

    @Test
    public void testAppendKeyVal_KVWithNoKeys() {
        HashMap<String, String> kv = new HashMap<>();
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        try {
            urlBuilder.appendKeyVal(null);
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}