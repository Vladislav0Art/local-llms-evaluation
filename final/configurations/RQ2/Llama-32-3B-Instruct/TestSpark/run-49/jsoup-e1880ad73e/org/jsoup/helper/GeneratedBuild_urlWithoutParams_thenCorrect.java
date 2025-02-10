package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.Arrays;

public class GeneratedBuild_urlWithoutParams_thenCorrect {

    @Test
    public void build_urlWithoutParams_thenCorrect() throws URISyntaxException {
        // Arrange
        Connection.KeyVal[] params = {};
        URL inputUrl = new URL("http://example.com/path");
        // Act & Assert
        URI uri = new UrlBuilder(inputUrl, params).build();
        assertEquals("http://example.com/path", uri.toString());
    }

}