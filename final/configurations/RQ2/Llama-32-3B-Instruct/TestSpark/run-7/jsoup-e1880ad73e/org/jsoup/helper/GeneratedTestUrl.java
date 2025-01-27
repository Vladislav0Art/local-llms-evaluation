package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestUrl {

    @Test
    public void testUrl() {
        UrlBuilder urlBuilder = new UrlBuilder();
        String expectedUrl = "https://example.com";
        System.out.println(urlBuilder.toString());
        assertEquals(new URI(expectedUrl), urlBuilder);
    }

}