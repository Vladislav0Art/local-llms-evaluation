package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestBuildUrlWithQueryParamsAndFragmentAndHash {

    @Test
    public void testBuildUrlWithQueryParamsAndFragmentAndHash() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2#fragment";
        URL expectedUrl = new URI("https://example.com/path?param1=value1&param2=value2#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(expectedUrl, urlBuilder.build());
    }

}