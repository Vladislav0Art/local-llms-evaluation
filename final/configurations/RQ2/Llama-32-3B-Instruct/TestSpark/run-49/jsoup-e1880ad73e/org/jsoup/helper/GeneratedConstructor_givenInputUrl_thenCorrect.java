package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.Arrays;

public class GeneratedConstructor_givenInputUrl_thenCorrect {

    @Test
    public void constructor_givenInputUrl_thenCorrect() {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        // Act & Assert
        assertSame(inputUrl, new UrlBuilder(inputUrl).inputUrl);
    }

}