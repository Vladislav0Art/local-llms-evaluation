package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestBuildUrlWithQueryParams {

    @Test
    public void testBuildUrlWithQueryParams() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        URL expectedUrl = new URI("https://example.com/path?param1=value1&param2=value2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(expectedUrl, urlBuilder.build());
    }

}