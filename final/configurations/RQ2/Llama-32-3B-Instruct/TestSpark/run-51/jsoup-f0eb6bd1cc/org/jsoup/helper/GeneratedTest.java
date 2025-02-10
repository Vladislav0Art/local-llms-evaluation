package org.jsoup.helper;

import org.jsoup.helper.URL;

import java.net.URL;

public class GeneratedTest {

    private String baseUrl;

    public UrlBuilder() {
    }

    public void appendKeyVal(String key, String value) {
        if (baseUrl == null) {
            baseUrl = "http://example.com";
        }
        if (!baseUrl.endsWith("?")) {
            baseUrl += "?";
        }
        baseUrl += key + "=" + value;
    }

    public URL getUrl() {
        return new URL(baseUrl);
    }

    public void setBaseUrl(URL base) {
        this.baseUrl = base.toString();
    }
}

public class KeyVal<K, V> {
    private K key;
    private V value;

    public KeyVal(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class GeneratedTest {

    @Test
    public void build_InputUrl_ReturnsConstructedUrl() throws Exception {
        UrlBuilder builder = new UrlBuilder();
        assertNotNull(builder.getUrl());
    }

    @Test
    public void appendKeyVal_AddsKeyValuePairToUrl() throws Exception {
        UrlBuilder builder = new UrlBuilder();
        assertEquals("http://example.com", builder.getUrl().toString());
        builder.appendKeyVal("key", "value");
        assertEquals("key=value", builder.getUrl().toString());
    }

    @Test
    public void appendKeyVal_MultipleKeyValuePairsAddToUrl() throws Exception {
        UrlBuilder builder = new UrlBuilder();
        assertEquals("http://example.com", builder.getUrl().toString());
        builder.appendKeyVal("key1", "value1");
        builder.appendKeyVal("key2", "value2");
        assertEquals("key1=value1&key2=value2", builder.getUrl().toString());
    }

    @Test
    public void getUrl() throws Exception {
        UrlBuilder builder = new UrlBuilder();
        assertNotNull(builder.getUrl());
    }

}