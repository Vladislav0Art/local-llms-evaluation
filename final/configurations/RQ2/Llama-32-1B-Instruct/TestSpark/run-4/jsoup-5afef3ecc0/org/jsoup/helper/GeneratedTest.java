package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testBuild() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=value");

        // Act
        String result = urlBuilder.build();

        // Assert
        assertEquals("https://example.com/path", result);
    }

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

    @Test
    public void testAppendKeyValWithoutQuery() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path");

        // Act
        urlBuilder.appendKeyVal(new java.util.ArrayList<>());

        // Assert
        assertEquals("https://example.com/path", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyValWithoutParams() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=value");

        // Act
        urlBuilder.appendKeyVal(new java.util.HashMap<>());

        // Assert
        assertEquals("https://example.com/path?query=value", urlBuilder.build().toString());
    }

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