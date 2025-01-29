package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_MalformedUrl_ThrowsException {

    @Test
    public void testAppendKeyVal_MalformedUrl_ThrowsException() {
        // Arrange
        String key = "key";
        String value = "value";

        // Act and Assert
        assertThrows(MalformedURLException.class, () -> UrlBuilder.build(new URL("invalid_url")));
    }

}