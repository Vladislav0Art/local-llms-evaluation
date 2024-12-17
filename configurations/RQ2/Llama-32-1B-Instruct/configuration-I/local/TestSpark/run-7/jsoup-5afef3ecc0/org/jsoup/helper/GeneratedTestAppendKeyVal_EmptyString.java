package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_EmptyString {

    @Test
    public void testAppendKeyVal_EmptyString() {
        // Arrange
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        urlBuilder.appendKeyVal(new Connection.KeyVal(""));

        // Assert
        assertEquals("", urlBuilder.build().toString());
    }

}