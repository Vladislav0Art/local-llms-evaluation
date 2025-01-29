package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_SetsCorrectValues {

    @Test
    public void testAppendKeyVal_SetsCorrectValues() {
        // Arrange
        String key = "key";
        String value = "value";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?param=value"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal(key, value));

        // Assert
        assertEquals(key, urlBuilder.getKey());
        assertEquals(value, urlBuilder.getValue());
    }

}