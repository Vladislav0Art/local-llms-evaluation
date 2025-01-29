package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_NegativeValue_ThrowsException {

    @Test
    public void testAppendKeyVal_NegativeValue_ThrowsException() {
        // Arrange
        String key = "key";
        int value = -1;

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.appendKeyVal(new org.jsoup.KeyVal(key, value)));
    }

}