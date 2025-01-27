package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestEqualsNull {

    @Test
    public void testEqualsNull() {
        UrlBuilder urlBuilder = new UrlBuilder();
        assertEquals(null, urlBuilder.toString());
    }
}

class Connection {

    public String getUrl() {
        return "https://example.com";
    }
}

class KeyVal {

    public static KeyVal createKeyVal(String key, String value) {
        // implementation
        return null;
    }

    public static void printKeyValue(KeyVal keyVal) {
    }
}

class UrlBuilder {

    private String url;

    public UrlBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return url == null ? "" : new URI(url).toString();
    }

}