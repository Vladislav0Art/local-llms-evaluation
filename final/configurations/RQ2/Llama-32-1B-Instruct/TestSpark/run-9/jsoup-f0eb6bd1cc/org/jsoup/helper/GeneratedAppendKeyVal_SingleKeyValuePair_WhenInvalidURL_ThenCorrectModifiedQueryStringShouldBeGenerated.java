package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyVal_SingleKeyValuePair_WhenInvalidURL_ThenCorrectModifiedQueryStringShouldBeGenerated {

    private UrlBuilder urlBuilder = new UrlBuilder(null);

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

}