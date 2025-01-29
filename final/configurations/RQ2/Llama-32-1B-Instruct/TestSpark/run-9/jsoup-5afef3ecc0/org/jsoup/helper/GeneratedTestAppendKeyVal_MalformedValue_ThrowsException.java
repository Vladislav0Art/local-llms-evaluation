package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_MalformedValue_ThrowsException {

    @Test
    public void testAppendKeyVal_MalformedValue_ThrowsException() {
        // Arrange
        String key = "key";
        int value = 123;

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.appendKeyVal(new org.jsoup.KeyVal(key, value)));
    }

}