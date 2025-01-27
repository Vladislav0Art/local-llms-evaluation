package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

import org.mockito.Mockito;

public class GeneratedBuildUrlWithFragment {

    @Test
    public void buildUrlWithFragment() {
        // Arrange
        URL inputUrl = new URL("https://example.com?fragment=foo");

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String result = urlBuilder.buildUrl();

        // Assert
        assertEquals("https://example.com?fragment=foo", result);
    }

}