package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyVal_MultipleKeyValues_WhenValidURL_ThenCorrectModifiedQueryStringShouldBeGenerated {

    private UrlBuilder urlBuilder = new UrlBuilder(null);

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

}