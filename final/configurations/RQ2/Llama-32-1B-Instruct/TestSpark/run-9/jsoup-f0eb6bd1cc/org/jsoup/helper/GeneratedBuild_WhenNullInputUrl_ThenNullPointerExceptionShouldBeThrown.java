package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

public class GeneratedBuild_WhenNullInputUrl_ThenNullPointerExceptionShouldBeThrown {

    private UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void build_WhenNullInputUrl_ThenNullPointerExceptionShouldBeThrown() {
        // Arrange
        String url = null;

        // Act & Assert
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.build());
        assertFalse(urlBuilder.build().isEmpty());
    }

}