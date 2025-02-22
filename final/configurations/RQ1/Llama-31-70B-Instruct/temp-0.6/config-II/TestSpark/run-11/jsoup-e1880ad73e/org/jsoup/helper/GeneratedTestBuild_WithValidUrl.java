package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedTestBuild_WithValidUrl {

    @Test
    public void testBuild_WithValidUrl() {
        // Arrange
        URL inputUrl = createMockUrl();
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL resultUrl = urlBuilder.build();

        // Assert
        assertEquals(inputUrl, resultUrl);
    }

}