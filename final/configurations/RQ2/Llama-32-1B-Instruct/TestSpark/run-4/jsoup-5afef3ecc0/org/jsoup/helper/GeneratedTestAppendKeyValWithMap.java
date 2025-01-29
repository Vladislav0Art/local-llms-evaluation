package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyValWithMap {

    @Test
    public void testAppendKeyValWithMap() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        java.util.Map<String, String> map = new java.util.HashMap<>();
        map.put("param1", "value1");
        map.put("param2", "value2");

        // Act
        urlBuilder.appendKeyVal(map);

        // Assert
        assertEquals("https://example.com/path?query=value1&param1=value1&param2=value2", urlBuilder.build().toString());
    }

}