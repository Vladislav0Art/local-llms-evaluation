package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedTestBuildReturnsUrlWithDefaultParameters {

    @Test
    public void testBuildReturnsUrlWithDefaultParameters() {
        // Arrange
        String inputUrl = "https://example.com/path?param=value";

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertNotNull(result);
    }

}