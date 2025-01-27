package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedBuildUrlWithNoQueryAndFragment {

    @Test
    public void buildUrlWithNoQueryAndFragment() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals("https://example.com", result.toString());
    }

}