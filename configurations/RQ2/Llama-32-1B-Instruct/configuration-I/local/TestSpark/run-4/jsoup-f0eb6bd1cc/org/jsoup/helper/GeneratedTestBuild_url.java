package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestBuild_url {

    @Test
    public void testBuild_url() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("https://example.com", urlBuilder.build());
    }

}