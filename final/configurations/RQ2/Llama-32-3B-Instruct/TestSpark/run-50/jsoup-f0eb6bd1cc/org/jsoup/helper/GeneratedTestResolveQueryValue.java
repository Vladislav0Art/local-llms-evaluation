package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestResolveQueryValue {

    @Test
    public void testResolveQueryValue() {
        String url = "http://example.com?query=value";
        UrlUtils.urlBuilder(url);

        assertEquals("http://example.com?query=value", UrlUtils.buildUrl().build().toString());
    }

}