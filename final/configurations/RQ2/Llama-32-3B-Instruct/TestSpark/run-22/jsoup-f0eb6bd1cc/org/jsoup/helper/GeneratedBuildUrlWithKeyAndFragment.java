package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

import org.mockito.Mockito;

public class GeneratedBuildUrlWithKeyAndFragment {

    @Test
    public void buildUrlWithKeyAndFragment() {
        // Arrange
        URL inputUrl = new URL("https://example.com?key=value&fragment=foo");

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String result = urlBuilder.buildUrl();

        // Assert
        assertEquals("https://example.com?key=value&fragment=foo", result);
    }

}