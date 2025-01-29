package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestBuildUrlWithQueryParamsAndFragment {

    @Test
    public void testBuildUrlWithQueryParamsAndFragment() {
        String inputUrl = "https://example.com/path#fragment";
        URL expectedUrl = new URI("https://example.com/path#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(expectedUrl, urlBuilder.build());
    }

}