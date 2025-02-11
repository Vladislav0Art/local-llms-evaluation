package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        String url = "http://example.com/path?query=hello#fragment";
        URI uri = URI.create(url);
        System.out.println(uri);
    }
}

public class UrlBuilder {

    public static String decodePart(String encoded) {
        return encoded;
    }

    public static String encodePart(String value) {
        return value;
    }
}

public class KeyVal {

    private String key;
    private String value;

    public KeyVal() {
    }

}