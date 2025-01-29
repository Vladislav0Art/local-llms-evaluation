package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

public class GeneratedBuild_SingleString_WhenInvalidURL_ThenCorrectModifiedQueryStringShouldBeGenerated {

    private UrlBuilder urlBuilder = new UrlBuilder(null);

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