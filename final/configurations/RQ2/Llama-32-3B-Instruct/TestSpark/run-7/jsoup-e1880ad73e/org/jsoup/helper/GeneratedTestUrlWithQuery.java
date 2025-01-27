package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestUrlWithQuery {

    @Test
    public void testUrlWithQuery() {
        UrlBuilder urlBuilder = new UrlBuilder();
        String expectedUrl = "https://example.com?key=value";
        System.out.println(urlBuilder.toString());
        assertEquals(new URI(expectedUrl), urlBuilder);
    }

}