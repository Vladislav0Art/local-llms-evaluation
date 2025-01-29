package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestBuildUrl {

    @Test
    public void testBuildUrl() {
        String inputUrl = "https://example.com/path?param=value";
        URL expectedUrl = new URI("https://example.com/path?param=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(expectedUrl, urlBuilder.build());
    }

}