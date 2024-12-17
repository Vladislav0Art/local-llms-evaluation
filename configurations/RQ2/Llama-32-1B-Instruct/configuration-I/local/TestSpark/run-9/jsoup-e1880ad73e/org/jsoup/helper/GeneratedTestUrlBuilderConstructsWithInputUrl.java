package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedTestUrlBuilderConstructsWithInputUrl {

    @Test
    public void testUrlBuilderConstructsWithInputUrl() {
        // Arrange
        String inputUrl = "https://example.com/path?param=value";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Assert
        assertNotNull(urlBuilder);
    }

}