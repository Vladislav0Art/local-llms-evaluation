package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyValWithNullMap {

    @Test
    public void testAppendKeyValWithNullMap() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        java.util.Map<String, String> nullMap = null;

        // Act
        urlBuilder.appendKeyVal(nullMap);

        // Assert
        assertEquals("https://example.com/path", urlBuilder.build().toString());
    }

}