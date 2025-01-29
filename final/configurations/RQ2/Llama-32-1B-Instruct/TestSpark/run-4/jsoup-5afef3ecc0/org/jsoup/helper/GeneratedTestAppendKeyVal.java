package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=value");
        java.util.Map<String, String> kvPairs = new java.util.HashMap<>();
        kvPairs.put("param1", "value1");
        kvPairs.put("param2", "value2");

        // Act
        urlBuilder.appendKeyVal(kvPairs);

        // Assert
        assertEquals("https://example.com/path?query=value&param1=value1&param2=value2", urlBuilder.build().toString());
    }

}