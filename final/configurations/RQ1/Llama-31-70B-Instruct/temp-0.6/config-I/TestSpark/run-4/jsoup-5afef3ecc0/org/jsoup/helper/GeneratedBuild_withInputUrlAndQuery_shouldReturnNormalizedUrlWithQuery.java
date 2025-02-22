package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

import org.junit.Test;

public class GeneratedBuild_withInputUrlAndQuery_shouldReturnNormalizedUrlWithQuery {

    @Test
    public void build_withInputUrlAndQuery_shouldReturnNormalizedUrlWithQuery() throws URISyntaxException, MalformedURLException {
        // Arrange
        URL inputUrl = new URL("http://www.test.com/path?query=test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals("http://www.test.com/path?query=test", result.toExternalForm());
    }

}