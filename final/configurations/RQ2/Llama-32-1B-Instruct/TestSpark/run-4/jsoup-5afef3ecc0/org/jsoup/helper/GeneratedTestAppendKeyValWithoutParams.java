package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyValWithoutParams {

    @Test
    public void testAppendKeyValWithoutParams() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=value");

        // Act
        urlBuilder.appendKeyVal(new java.util.HashMap<>());

        // Assert
        assertEquals("https://example.com/path?query=value", urlBuilder.build().toString());
    }

}