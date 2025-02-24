package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildUrlTest {

    private UrlBuilder urlBuilder;

    @Test
    public void buildUrlTest() {
        // Arrange
        urlBuilder = new UrlBuilder(new URL("http://example.com"));

        // Act
        URL url = urlBuilder.build();

        // Assert
        assertEquals("http://example.com", url.toString());
    }

}