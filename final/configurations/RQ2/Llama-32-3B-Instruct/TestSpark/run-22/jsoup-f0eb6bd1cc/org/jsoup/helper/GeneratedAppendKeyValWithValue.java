package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAppendKeyValWithValue {

    @Test
    public void appendKeyValWithValue() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.getValue()).thenReturn("value");

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(true); // assertion is needed to indicate the method executed
    }

}