package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedBuild_SingleString_WhenValidURL_ThenCorrectURLShouldBeGenerated {

    private UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void build_SingleString_WhenValidURL_ThenCorrectURLShouldBeGenerated() {
        // Arrange
        String url = "http://example.com/path#";
        java.util.HashMap<String, String> kvMap = new java.util.HashMap<>();

        when(urlBuilder.build()).thenReturn(new URL(url));

        // Act
        String modifiedQueryString = urlBuilder.build().toString();

        // Assert
        assertEquals("http://example.com/path", modifiedQueryString);
    }

}