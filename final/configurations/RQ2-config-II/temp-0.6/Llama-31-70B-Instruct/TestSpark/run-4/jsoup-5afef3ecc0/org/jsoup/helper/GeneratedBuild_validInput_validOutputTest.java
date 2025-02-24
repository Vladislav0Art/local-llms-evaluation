package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedBuild_validInput_validOutputTest {

    @Test
    public void build_validInput_validOutputTest() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL outputUrl = urlBuilder.build();

        // Assert
        assertEquals("http://example.com", outputUrl.toString());
    }

}