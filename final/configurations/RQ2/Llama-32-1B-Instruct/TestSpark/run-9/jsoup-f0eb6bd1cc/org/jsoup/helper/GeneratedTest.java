package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    private UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void build_WhenNullInputUrl_ThenNullPointerExceptionShouldBeThrown() {
        // Arrange
        String url = null;

        // Act & Assert
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.build());
        assertFalse(urlBuilder.build().isEmpty());
    }

    @Test
    public void appendKeyVal_SingleKeyValuePair_WhenValidURL_ThenCorrectModifiedQueryStringShouldBeGenerated() {
        // Arrange
        String url = "http://example.com/path#key=value";
        java.util.HashMap<String, String> kvMap = new java.util.HashMap<>();
        kvMap.put("key", "value");

        when(urlBuilder.build()).thenReturn(new URL(url));

        // Act
        String modifiedQueryString = urlBuilder.appendKeyVal(kvMap);

        // Assert
        assertEquals("http://example.com/path?key=value", modifiedQueryString);
    }

    @Test
    public void appendKeyVal_SingleKeyValuePair_WhenInvalidURL_ThenCorrectModifiedQueryStringShouldBeGenerated() {
        // Arrange
        String url = "http://example.com/path#key=value";
        java.util.HashMap<String, String> kvMap = new java.util.HashMap<>();
        kvMap.put("key", "value");

        when(urlBuilder.build()).thenReturn(new URL(url));

        // Act & Assert
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kvMap));
    }

    @Test
    public void appendKeyVal_MultipleKeyValues_WhenValidURL_ThenCorrectModifiedQueryStringShouldBeGenerated() {
        // Arrange
        String url = "http://example.com/path#key1=value1&key2=value2";
        java.util.Map<String, String> kvMap = new java.util.HashMap<>();
        kvMap.put("key1", "value1");
        kvMap.put("key2", "value2");

        when(urlBuilder.build()).thenReturn(new URL(url));

        // Act
        String modifiedQueryString = urlBuilder.appendKeyVal(kvMap);

        // Assert
        assertEquals("http://example.com/path#key1=value1&key2=%3Dvalue2", modifiedQueryString);
    }

    @Test
    public void appendKeyVal_MultipleKeyValues_WhenInvalidURL_ThenCorrectModifiedQueryStringShouldBeGenerated() {
        // Arrange
        String url = "http://example.com/path#key1=value1&key2=value2";
        java.util.HashMap<String, String> kvMap = new java.util.HashMap<>();
        kvMap.put("key1", "value1");
        kvMap.put("key2", "value2");

        when(urlBuilder.build()).thenReturn(new URL(url));

        // Act & Assert
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kvMap));
    }

    @Test
    public void build_SingleString_WhenValidURL_ThenCorrectModifiedQueryStringShouldBeGenerated() {
        // Arrange
        String url = "http://example.com/path";
        java.util.HashMap<String, String> kvMap = new java.util.HashMap<>();
        kvMap.put("key", "value");

        when(urlBuilder.build()).thenReturn(new URL(url));

        // Act & Assert
        assertEquals("http://example.com/path?key=value", urlBuilder.build().toString());
    }

    @Test
    public void build_SingleString_WhenInvalidURL_ThenCorrectModifiedQueryStringShouldBeGenerated() {
        // Arrange
        String url = "http://example.com/path#";
        java.util.HashMap<String, String> kvMap = new java.util.HashMap<>();
        kvMap.put("key", "value");

        when(urlBuilder.build()).thenReturn(new URL(url));

        // Act & Assert
        assertEquals("http://example.com/path#key=value", urlBuilder.build().toString());
    }

}