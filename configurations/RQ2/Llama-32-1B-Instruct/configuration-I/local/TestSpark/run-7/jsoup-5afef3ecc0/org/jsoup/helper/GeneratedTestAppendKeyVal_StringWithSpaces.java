package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_StringWithSpaces {

    @Test
    public void testAppendKeyVal_StringWithSpaces() {
        // Arrange
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value with spaces");

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals("key=value with spaces", urlBuilder.build().toString());
    }

}