package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_NonStringValue_ThrowsException {

    @Test
    public void testAppendKeyVal_NonStringValue_ThrowsException() {
        // Arrange
        String key = "key";
        Object value = null;

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.appendKeyVal(new org.jsoup.KeyVal(key, value)));
    }

}