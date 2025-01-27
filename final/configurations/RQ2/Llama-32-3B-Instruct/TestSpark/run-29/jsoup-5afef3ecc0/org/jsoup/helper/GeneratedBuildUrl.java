package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedBuildUrl {

    @Test
    public void buildUrl() {
        // Arrange
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));

        // Act
        URL url = builder.build();

        // Assert
        assertEquals("https://example.com/path", url.toString());
    }

}