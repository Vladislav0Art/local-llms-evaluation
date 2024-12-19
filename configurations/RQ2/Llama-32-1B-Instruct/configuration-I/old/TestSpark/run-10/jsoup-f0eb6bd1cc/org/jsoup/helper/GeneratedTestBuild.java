package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String url = "https://example.com";
        when(url).thenReturn("url"); // Mock the URL to return a specific value
        Url actual = new UrlBuilder(url).build();
        assertEquals("url", actual);
    }

}