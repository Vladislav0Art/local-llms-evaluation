package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        // Arrange
        URL inputUrl = new URL("https://www.example.com/");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        URL actual = builder.build();

        // Assert
        assertEquals(inputUrl, actual);
    }

}