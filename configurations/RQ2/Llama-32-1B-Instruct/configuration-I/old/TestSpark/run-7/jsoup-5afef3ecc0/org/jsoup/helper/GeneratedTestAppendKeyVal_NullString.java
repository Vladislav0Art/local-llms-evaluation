package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_NullString {

    @Test
    public void testAppendKeyVal_NullString() {
        // Arrange
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        urlBuilder.appendKeyVal(null);

        // Assert
        assertEquals("", urlBuilder.build().toString());
    }

}