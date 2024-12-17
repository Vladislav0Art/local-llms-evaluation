package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        UrlBuilder urlBuilder = new UrlBuilder();
        assertEquals("http://example.com", urlBuilder.build());

        urlBuilder.addQuery("key", "value");
        assertEquals("http://example.com?key=value", urlBuilder.build());

        urlBuilder.addQuery("key1", "value1");
        urlBuilder.addQuery("key2", "value2");
        assertEquals("http://example.com?key1=value1&key2=value2", urlBuilder.build());
    }
}

class UrlBuilder {
    private String url;

    public UrlBuilder() {
        this.url = "http://example.com";
    }

    public void addQuery(String key, String value) {
        if (url.contains("?")) {
            url += "&" + key + "=" + value;
        } else {
            url += "?key=" + value;
        }
    }

    public String build() {
        return url;
    }

}