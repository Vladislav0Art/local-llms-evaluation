package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.Arrays;

public class GeneratedBuild_urlWithParams_thenCorrect {

    @Test
    public void build_urlWithParams_thenCorrect() throws URISyntaxException {
        // Arrange
        Connection.KeyVal[] params = {new Connection.KeyVal("key1", "value1")};
        URL inputUrl = new URL("http://example.com/path");
        // Act & Assert
        URI uri = new UrlBuilder(inputUrl, params).build();
        assertEquals("http://example.com/path?key1=value1", uri.toString());
    }

}