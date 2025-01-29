package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyValWithEmptyList {

    @Test
    public void testAppendKeyValWithEmptyList() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        java.util.List<String> list = new java.util.ArrayList<>();

        // Act
        urlBuilder.appendKeyVal(list);

        // Assert
        assertEquals("https://example.com/path", urlBuilder.build().toString());
    }

}