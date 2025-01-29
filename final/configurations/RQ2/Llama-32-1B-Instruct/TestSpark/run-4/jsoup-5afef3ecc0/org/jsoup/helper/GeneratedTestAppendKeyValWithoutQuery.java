package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyValWithoutQuery {

    @Test
    public void testAppendKeyValWithoutQuery() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path");

        // Act
        urlBuilder.appendKeyVal(new java.util.ArrayList<>());

        // Assert
        assertEquals("https://example.com/path", urlBuilder.build().toString());
    }

}