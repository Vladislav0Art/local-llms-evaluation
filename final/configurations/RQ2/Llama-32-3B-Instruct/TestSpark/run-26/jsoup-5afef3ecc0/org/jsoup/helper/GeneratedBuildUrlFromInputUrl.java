package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildUrlFromInputUrl {

    @Test
    public void buildUrlFromInputUrl() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        URL result = builder.build();

        // Assert
        assertEquals(inputUrl, result);
    }

}