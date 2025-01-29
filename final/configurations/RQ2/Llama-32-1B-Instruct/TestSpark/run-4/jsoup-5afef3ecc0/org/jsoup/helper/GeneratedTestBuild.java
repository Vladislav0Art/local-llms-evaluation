package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=value");

        // Act
        String result = urlBuilder.build();

        // Assert
        assertEquals("https://example.com/path", result);
    }

}