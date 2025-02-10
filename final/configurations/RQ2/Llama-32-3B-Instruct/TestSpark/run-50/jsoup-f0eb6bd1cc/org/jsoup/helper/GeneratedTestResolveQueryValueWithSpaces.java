package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestResolveQueryValueWithSpaces {

    @Test
    public void testResolveQueryValueWithSpaces() {
        String url = "http://example.com";
        UrlUtils.urlBuilder(url)
                .resolve("?query=value+with+spaces");

        assertEquals("http://example.com?query=value%2Bwith%2Bspaces", UrlUtils.buildUrl().build().toString());
    }

}