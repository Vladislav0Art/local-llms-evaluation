package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestBuild_ReturnsUrl {

    @Test
    public void testBuild_ReturnsUrl() {
        // Arrange
        URL inputUrl = new URL("https://example.com");
        Mockito.when(inputUrl.getScheme()).thenReturn("https");

        // Act
        String actualUrl = UrlBuilder.build().toString();

        // Assert
        assertEquals("https://example.com", actualUrl);
    }

}