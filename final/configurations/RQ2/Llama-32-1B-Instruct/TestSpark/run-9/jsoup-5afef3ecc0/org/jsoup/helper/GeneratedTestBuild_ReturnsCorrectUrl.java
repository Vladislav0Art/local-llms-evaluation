package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestBuild_ReturnsCorrectUrl {

    @Test
    public void testBuild_ReturnsCorrectUrl() {
        // Arrange
        URL inputUrl = new URL("https://example.com/path?param=value");

        // Act
        URL actualUrl = UrlBuilder.build(inputUrl);

        // Assert
        assertTrue(actualUrl.getScheme().equals("https"));
        assertTrue(actualUrl.getHost().equals("example.com"));
        assertTrue(actualUrl.getPath().contains("/path?param=value"));
    }

}