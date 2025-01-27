package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedBuildReturnsCorrectlyFormedUrl {

    @Test
    public void buildReturnsCorrectlyFormedUrl() throws MalformedURLException, URISyntaxException {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));

        // Act
        String url = urlBuilder.build().toString();

        // Assert
        assertEquals("http://example.com", url);
    }

}