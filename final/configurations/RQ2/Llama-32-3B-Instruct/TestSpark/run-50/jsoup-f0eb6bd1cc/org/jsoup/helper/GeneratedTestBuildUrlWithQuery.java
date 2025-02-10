package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestBuildUrlWithQuery {

    @Test
    public void testBuildUrlWithQuery() {
        String url = "http://example.com?query=value";
        UrlUtils.urlBuilder(url);

        assertEquals("http://example.com?query=value", UrlUtils.buildUrl().build().toString());
    }
}

public class UrlUtils {

    public static void urlBuilder(String url) {
        // implementation
    }

    public static String buildUrl() {
        // implementation
        return "";
    }

}