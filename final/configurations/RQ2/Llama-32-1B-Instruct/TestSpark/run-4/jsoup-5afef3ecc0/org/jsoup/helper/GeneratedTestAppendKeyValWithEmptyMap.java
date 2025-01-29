package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyValWithEmptyMap {

    @Test
    public void testAppendKeyValWithEmptyMap() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        java.util.Map<String, String> map = new java.util.HashMap<>();

        // Act
        urlBuilder.appendKeyVal(map);

        // Assert
        assertEquals("https://example.com/path", urlBuilder.build().toString());
    }

}