package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        String url = new UrlBuilder().build();
        assertTrue(url.contains("http://"));
    }

}