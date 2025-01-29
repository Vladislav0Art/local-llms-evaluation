package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

public class GeneratedBuild_WhenInvalidURL_ThenNullPointerExceptionShouldBeThrown {

    private UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void build_WhenInvalidURL_ThenNullPointerExceptionShouldBeThrown() {
        // Arrange
        String url = "http://example.com/invalid";

        // Act & Assert
        expectThrows(UnsupportedEncodingException.class, () -> urlBuilder.build());
    }

}