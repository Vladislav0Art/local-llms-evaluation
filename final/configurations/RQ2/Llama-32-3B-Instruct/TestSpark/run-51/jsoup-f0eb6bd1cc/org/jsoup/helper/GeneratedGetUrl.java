package org.jsoup.helper;

import org.jsoup.helper.URL;

import java.net.URL;

public class GeneratedGetUrl {

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
    public void getUrl() throws Exception {
        UrlBuilder builder = new UrlBuilder();
        assertNotNull(builder.getUrl());
    }

}