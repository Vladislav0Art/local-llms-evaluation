package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAppendKeyValWithInvalidEncoding {

    @Test
    public void appendKeyValWithInvalidEncoding() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.getValue()).thenReturn("ä");

        // Act and Assert
        try {
            urlBuilder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}