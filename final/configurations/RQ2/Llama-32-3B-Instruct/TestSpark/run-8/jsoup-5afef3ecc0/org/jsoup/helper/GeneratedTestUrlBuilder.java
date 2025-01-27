package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        UrlBuilder urlBuilder = new UrlBuilder();
        assertEquals("https://example.com", urlBuilder.build());
    }

}