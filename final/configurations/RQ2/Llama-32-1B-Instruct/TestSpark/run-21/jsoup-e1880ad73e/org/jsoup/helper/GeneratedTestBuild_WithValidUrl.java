package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestBuild_WithValidUrl {

    @Test
    public void testBuild_WithValidUrl() {
        String inputUrl = "https://www.example.com";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("https://www.example.com", result.toUriString());
    }

}