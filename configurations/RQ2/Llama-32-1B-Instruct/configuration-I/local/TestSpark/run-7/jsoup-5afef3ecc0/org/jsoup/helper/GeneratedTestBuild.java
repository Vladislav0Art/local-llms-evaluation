package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedTestBuild {

    public static class Connection {
        public String key;
        public String value;
    }

    @Test
    public void testBuild() {
        // Arrange
        String inputUrl = "http://example.com";

        // Act
        URL url = UrlBuilder.from(inputUrl).build();

        // Assert
        assertEquals(inputUrl, url.toString());
    }

}