package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyVal_MultipleKeyValues_WhenInvalidURL_ThenCorrectModifiedQueryStringShouldBeGenerated {

    private UrlBuilder urlBuilder = new UrlBuilder(null);

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

}