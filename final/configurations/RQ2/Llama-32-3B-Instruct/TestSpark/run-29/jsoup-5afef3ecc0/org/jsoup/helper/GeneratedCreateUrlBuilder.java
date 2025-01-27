package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateUrlBuilder {

    @Test
    public void createUrlBuilder() {
        // Arrange
        URL inputUrl = new URL("https://example.com");

        // Act
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Assert
        assert builder != null;
    }

}