package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedBuildUrlWithQueryAndFragment {

    @Test
    public void buildUrlWithQueryAndFragment() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com?key=value&fragment=foo"));

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals("https://example.com?key=value#fragment=foo", result.toString());
    }

}