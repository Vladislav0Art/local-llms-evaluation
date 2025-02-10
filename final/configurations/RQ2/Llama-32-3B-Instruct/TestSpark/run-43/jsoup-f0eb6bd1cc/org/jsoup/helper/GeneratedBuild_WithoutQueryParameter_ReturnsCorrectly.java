package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuild_WithoutQueryParameter_ReturnsCorrectly {

    @Test
    public void build_WithoutQueryParameter_ReturnsCorrectly() throws URISyntaxException {
        // Arrange
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URI uri = urlBuilder.build();

        // Assert
        assertEquals("http://example.com/#!/path", uri.toString());
    }

}