package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

import org.junit.Test;

public class GeneratedBuild_withInputUrl_shouldReturnNormalizedUrl {

    @Test
    public void build_withInputUrl_shouldReturnNormalizedUrl() throws URISyntaxException, MalformedURLException {
        // Arrange
        URL inputUrl = new URL("http://www.test.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals("http://www.test.com/path", result.toExternalForm());
    }

}