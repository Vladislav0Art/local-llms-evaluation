package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyVal_SingleKeyValuePair_WhenValidURL_ThenCorrectModifiedQueryStringShouldBeGenerated {

    private UrlBuilder urlBuilder = new UrlBuilder(null);

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

}